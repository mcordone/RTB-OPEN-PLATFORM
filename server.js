var http = require('http');
var url = require('url');
var querystring = require('querystring');
var reqProcessor = require('./exchanges/requestProcessor.js');


http.createServer(function(request, response) {

    //new reqProcessor(request, response);
    //getPostData(request, response);

    if(request.method == 'POST') {

        getRequestBidData(request, response);

    //response.sendHeader(200, { 'Content-Type': 'text/html' });
    response.end('Done processing the request......');
    } else {
        response.writeHead(200, "OK", {'Content-Type': 'text/plain'});
        response.end();
    }
  
}).listen(8124);

function getRequestBidData(request, response) {
    var queryData = "";
    if(typeof callback !== 'function') return null;

    if(request.method == 'POST') {
        request.on('data', function(data) {
            bidData += data;
            if(bidData.length > 1e6) {
                bidData = "";
                response.writeHead(204, {'Content-Type': 'text/json; charset=UTF-8'}).end();
                //TODO log HTTP Error 413 Request entity too large
                //response.writeHead(413, {'Content-Type': 'text/plain'}).end();
                request.connection.destroy();
            }
        });

        request.on('end', function() {
            request.BID_DATA = bidData;
        });

    } else {
        response.writeHead(405, {'Content-Type': 'text/plain'});
        response.end();
    }
}

function getPostData (req, res) {
        if (req.method == 'POST') {
            var jsonString = '';
            req.on('data', function (data) {
                jsonString += data;
            });
            req.on('end', function () {
                 console.log(JSON.parse(jsonString));
            });
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