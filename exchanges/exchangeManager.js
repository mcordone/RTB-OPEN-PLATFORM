var Config = require('../config/config');

//list of exchanges config data
//var exchangesList = Config.getExchanges();
var exchangeAdaptorList = {};

//exchangeManager instance
var ExchangeManager = {};

/*
	@desc: return exchange configuration data with matching name.
	@param name (exchange name)
	@return excahange config hash object otherwise undefined.
*/
ExchangeManager.getExchangeByName = function(name){
	"use strict";
	var exchangesList = Config.getExchanges(),
		iExchgName = name.toLowerCase(),
		exchElem;

	exchangesList.every(function(element, index, array){
		if(iExchgName === element.name.toLowerCase()){
			exchElem = element;
			return;
		}
	}, this);

	return exchElem;
};

/*
	@desc: return exchange configuration data with matching id.
	@param id (exchange id)
	@return excahange config hash object otherwise undefined
*/
ExchangeManager.getExchangeById = function(id){
	"use strict";
	var exchangesList = Config.getExchanges(),
		exchElem;

	exchangesList.every(function(element, index, array){
		if(id === element.id){
			exchElem = element;
			return;
		}
	}, this);

	return exchElem;
};

/*
	@desc: return exchange configuration data.
	@param pathname (pathname from url of current request being process)
	@return excahange config hash object otherwise undefined
*/
ExchangeManager.getExchangeFromPathname = function(pathname){
	var exchangesList = Config.getExchanges(),
		exchElem;

	exchangesList.every(function(element, index, array){
		if (pathname.indexOf(element.name.toLowerCase())) {
			exchElem = element;
			return;
		};
	});

	return exchElem;
}

ExchangeManager.getExchangeAdaptor = function(){

}

/* Private members */
function registerAdaptor(exchangeName, adaptorInst){
	exchangeAdaptorList[exchangeName] = adaptorInst;
}

function unregisterAdaptor(exchangeName, adaptorInst){
	if(exchangeAdaptorList.hasOwnProperty()){
		exchangeAdaptorList[exchangeName] = null;
		delete exchangeAdaptorList[exchangeName];
	}
}

module.exports = ExchangeManager;

