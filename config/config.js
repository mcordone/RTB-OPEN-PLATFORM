var fs = require("fs");

var rawData = fs.readFileSync(__dirname + "/config.json","utf8");
var jsonData = JSON.parse(rawData);
var exchagesConf = jsonData.exchanges; //array of exchanges


//return collection (array) of all exchanges
exports = module.exports = {
	getExchangeConfig : function(){
		return exchagesConf;
	}
}