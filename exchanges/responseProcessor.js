


exports.sendNoBidResponse = function(res){
	res.writeHead(204, {'Content-Type': 'text/json; charset=UTF-8'});
	res.end();
}

exports.sendJsonResponse = function(res, responseData){
	res.writeHead(200, {'Content-Type': 'text/json; charset=UTF-8'});
	res.end(responseData, 'utf8');
}