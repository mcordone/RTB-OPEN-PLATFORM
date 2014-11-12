
var url = require('url');
var config = require('../config/config');

exports.processRequest = function(req, res){
	//TODO 
	//1- get exchange name from req url
	//2- get exchange request data
	//3- call appropiate exchange translator
	//debugger;

	//get exchange name from URI
	var exchName = getExchangeNameFromURI(req)

	//get exchange request bid data
	var requestBidData;
	if(undefined != exchName){
		requestBidData = getExchangeRequestBidData(req, res, function(error, data){
			if (error) {
				//TODO log error and end request
			};
			//console.info(data);
			requestBidData = data;
		});
		//console.info('*** BID DATA ', requestBidData);
	}
	else{
		//XXX no request data :: send 204 response and end request
		res.writeHead(204, {'Content-Type': 'text/json; charset=UTF-8'}).end();
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
	      res.writeHead(204, {'Content-Type': 'text/json; charset=UTF-8'}).end();
	      //TODO log HTTP Error 413 Request entity too large
	      //response.writeHead(413, {'Content-Type': 'text/plain'}).end();
	      req.connection.destroy();
	  }
	});

	req.on('end', function() {
		bidRequestData = JSON.parse(bidRequestData);

		process.nextTick( function(){
			callback(null, bidRequestData);
			});
	});

	req.on('error', function(error){
		callback(error, null);
	})

	//TODO listen for error receiving data
}

//module.exports = processRequest;