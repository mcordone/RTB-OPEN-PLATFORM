var http = require('http');
var url = require('url');
var querystring = require('querystring');
var Config = require('./config/config');
var ExchangeManager = require('./exchanges/exchangeManager');
var requestHandler = require('./httpHandler/requestHandler');

//APPLICATION CONFIGURATION CONTINUES...
Config.on('CONFIGURATION_READY', function(){
  console.log('**** CONFIGURATION READY');

  //Initialize ExchangeManager
  ExchangeManager.initialize();

  //create and start server
  createServer();

});

//START APPLICATION CONFIGURATION
Config.init();

function createServer(){
  http.createServer(function(request, response) {

      if(request.method == 'POST') {
        requestHandler.processRequest(request, response);
      }else {
        // Send 405 Method Not Allowed, only POST accepted
        response.writeHead(405, {'Content-Type': 'text/plain'});
        response.end();
      }
    
  }).listen(8124); //TODO make port a configuration constant
}

