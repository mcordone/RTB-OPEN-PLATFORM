var fs = require("fs");
var EventEmitter = require('events').EventEmitter;
var Config;
var jsonConfigData;

Config = new EventEmitter();
/*Public api*/
Config.init = function(){
	initialize();
};

/* return array of exchanges data */
Config.getExchanges = function(){
	return jsonConfigData.exchanges;
}

/* return array of bidders data */
Config.getBidders = function(){
	return jsonConfigData.bidders;
}

/*Private*/
function initialize(){
	loadConfigData();
}

function loadConfigData(){
	var rawConfData = fs.readFileSync(__dirname + "/config.json","utf8");
	parseConfigData(rawConfData);
}

function parseConfigData(rawData){
	jsonConfigData = JSON.parse(rawData);
	Config.emit('CONFIGURATION_READY');
}

module.exports = Config;

