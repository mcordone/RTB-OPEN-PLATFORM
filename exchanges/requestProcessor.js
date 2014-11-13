
var url = require('url');
var config = require('../config/config');
var resProcessor = require('./responseProcessor');

exports.processRequest = function(req, res){
	//ACTION:
	//1- get exchange name from req uri
	//2- get exchange request payload data
	//3- call appropiate exchange translator
	//debugger;

	//get exchange name from URI
	var exchName = getExchangeNameFromURI(req)

	//get exchange request bid payload data
	var requestBidPayload;
	if(undefined != exchName){
		getExchangeRequestBidData(req, res, function(error, data){
			if (error) {
				//TODO log error and end request
				console.log("*** " + error.message());
				resProcessor.sendNoBidResponse(res);
				req.connection.destroy();
			};

			requestBidPayload = data;

			//TODO get proper exchange translator/adapter
		});
	}
	else{
		//XXX no request data :: send 204 response (no bid) and end request
		resProcessor.sendNoBidResponse(res);
		req.connection.destroy();
	}

}

function getExchangeNameFromURI(req){
	//TODO loop through a configuration and find the corresponding exchange object
	var pathname = url.parse(req.url).pathname.toLowerCase();
		exchCollection = config.getExchangeConfig(),
		exchangeName = undefined,
		indexPos = -1;

	for(var i=0; i < exchCollection.length; i++){

		indexPos = pathname.indexOf(exchCollection[i].name.toLowerCase());
		if(indexPos > -1) {
			exchangeName = exchCollection[i].name;
			break;
		};
	}

	return exchangeName;
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
