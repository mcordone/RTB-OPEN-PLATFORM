
var url = require('url');
var config = require('../config/config');
var ExchangeManager = require('./exchangeManager');
var resProcessor = require('./responseProcessor');

exports.processRequest = function(req, res){
	//ACTION:
	//1- get exchange name from req uri
	//2- get exchange request payload data
	//3- call appropiate exchange translator
	//debugger;

	//get exchange name from pathname (URI)
	var pathname = url.parse(req.url).pathname.toLowerCase();
	var exchConfigData = ExchangeManager.getExchangeFromPathname(pathname);

	//get exchange request bid payload data
	var requestBidPayload;
	if(undefined != exchConfigData){
		getExchangeRequestBidData(req, res, function(error, data){
			if (error) {
				//TODO log error and end request
				console.log("*** ERROR: " + error.message());
				resProcessor.sendNoBidResponse(res);
				req.connection.destroy();
			};

			requestBidPayload = data;

			//TODO get proper exchange translator/adapter
			//res.end();
		});
	}
	else{
		//XXX no request data :: send 204 response (no bid) and end request
		resProcessor.sendNoBidResponse(res);
		req.connection.destroy();
	}

}

function getExchangeRequestBidData(req, res, callback) {
    var bidRequestData = "";

	//qet request data
	req.on('data', function(data) {
	  bidRequestData += data;
	  if(bidRequestData.length > 1e6) {
	      bidRequestData = "";
	      resProcessor.sendNoBidResponse(res);
		  req.connection.destroy();
	      //TODO log HTTP Error 413 Request entity too large
	      //response.writeHead(413, {'Content-Type': 'text/plain'}).end();
	  }
	});

	req.on('end', function() {
		bidRequestData = JSON.parse(bidRequestData);

		//TODO perhaps check request data integrity

		process.nextTick( function(){
			callback(null, bidRequestData);
			});
	});

	req.on('error', function(error){
		process.nextTick( function(){
			callback(new Error("ERROR GETTING EXCHANGE REQUEST DATA"), null);
			});

	})
}

function getExchangeAdapter(){
	
}
