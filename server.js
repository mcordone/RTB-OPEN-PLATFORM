var http = require('http');
var url = require('url');
var querystring = require('querystring');
var Config = require('./config/config');
var exchangeManager = require('./exchanges/exchangeManager');
var requestHandler = require('./exchanges/requestProcessor.js');

//START APPLICATION CONFIGURATION
Config.on('CONFIGURATION_READY', function(){
  console.log('**** CONFIGURATION READY');


  http.createServer(function(request, response) {

      if(request.method == 'POST') {
        requestHandler.processRequest(request, response);
      }else {
        // Send 405 Method Not Allowed, only POST accepted
        response.writeHead(405, {'Content-Type': 'text/plain'});
        response.end();
      }
    
  }).listen(8124);
});

Config.init();

