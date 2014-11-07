
exports.processRequest = function(req, res){
	//TODO 
	//1- get exchange name from req url
	//2- get exchange request data
	//3- call appropiate exchange translator
	debugger;
}

function getExchangeNameFromURI(){
	//TODO loop through a configuration and find the corresponding exchange object
	var pathname = url.parse(request.url).pathname;

}

function getExchangeRequestBidData(request, response) {
    var bidRequestData = "";

	//qet request data
	request.on('data', function(data) {
	  bidRequestData += data;
	  if(bidRequestData.length > 1e6) {
	      bidRequestData = "";
	      response.writeHead(204, {'Content-Type': 'text/json; charset=UTF-8'}).end();
	      //TODO log HTTP Error 413 Request entity too large
	      //response.writeHead(413, {'Content-Type': 'text/plain'}).end();
	      request.connection.destroy();
	  }
	});

	request.on('end', function() {
	  request.BID_DATA = JSON.parse(bidRequestData);
	});
}

//module.exports = processRequest;