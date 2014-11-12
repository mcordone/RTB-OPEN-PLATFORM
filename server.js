var http = require('http');
var url = require('url');
var querystring = require('querystring');
var requestHandler = require('./exchanges/requestProcessor.js');
var config = require('./config/config');

//config.getExchangeConfig();


http.createServer(function(request, response) {

    if(request.method == 'POST') {
      requestHandler.processRequest(request, response);
    }else {
      // Send 405 Method Not Allowed, only POST accepted
      response.writeHead(405, {'Content-Type': 'text/plain'});
      response.end();
    }

    response.end('Done processing the request......');
  
}).listen(8124);
