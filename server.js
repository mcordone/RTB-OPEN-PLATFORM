var http = require('http');
var url = require('url');
var reqProcessor = require('./exchanges/requestProcessor.js');


http.createServer(function(request, response) {

    new reqProcessor(request, response);
    //--------------------------------------------------------
var feedUrl = 'http://feeds.feedburner.com/astronomycast.rss';
var parsedUrl = url.parse(feedUrl);

/*var client = http.createClient(80, parsedUrl.hostname);
var request = client.request(parsedUrl.pathname, { 'host': parsedUrl.hostname });
request.addListener('response', handle);
    request.end();*/

/*var options = {
  hostname: parsedUrl.hostname,
  port: 80,
  path: parsedUrl.pathname,
  method: 'GET'
};

var req = http.request(options, function(res) {
  console.log('STATUS: ' + res.statusCode);
  console.log('HEADERS: ' + JSON.stringify(res.headers));
  res.setEncoding('utf8');
  res.on('data', function (chunk) {
    //console.log('BODY: ' + chunk);
    console.log("---------------------------------------/n");
  });
});

req.on('error', function(e) {
  console.log('problem with request: ' + e.message);
});

// write data to request body
req.write('data\n');
req.end();*/
//--------------------------------------------------------

    //response.sendHeader(200, { 'Content-Type': 'text/html' });
    response.end('Done processing the request.');
}).listen(8124);

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