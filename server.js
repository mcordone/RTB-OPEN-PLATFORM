var http = require('http');
var url = require('url');
var querystring = require('querystring');
var processRequest = require('./exchanges/requestProcessor.js');


http.createServer(function(request, response) {

    if(request.method == 'POST') {
      processRequest(request, response);
    }else {
      // Send 405 Method Not Allowed, only POST accepted
      response.writeHead(405, {'Content-Type': 'text/plain'});
      response.end();
    }

    response.end('Done processing the request......');
  
}).listen(8124);

function requestHandler(request, response) {
    var bidRequestData = "";

    if(request.method == 'POST') {

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

    } else {
      // Send 405 Method Not Allowed, only POST accepted
      response.writeHead(405, {'Content-Type': 'text/plain'});
      response.end();
    }
}


function handle(response) {    
    if(response.statusCode !== 200)
        return;
    
    var responseBody = '';
    
    response.addListener('data', function(chunk) {
        responseBody += chunk;
    });
    
    response.addListener('end', function() {       
        console.log('All data has been read.');
        //console.log(responseBody);
    });
}