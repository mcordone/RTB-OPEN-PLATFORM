var Config = require('../config/config');


var isInitialized = false,
	exchangesList,
	exchangeAdaptorInstList = {};

//exchangeManager instance
var ExchangeManager = {};

ExchangeManager.initialize = function(){
	if(!isInitialized){
		exchangesList = Config.getExchanges();

		if (exchangesList != undefined) {
			//create instances
			exchangesList.forEach(function(element, index, array){
				var ExchAdapter = require('./'+element.adapterClass);

				//register new adaptor
				registerAdaptor(element.name, new ExchAdapter());
			});
		}

		isInitialized = true;
	}
};

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

ExchangeManager.getExchangeAdaptorInst = function(exchName){
	//TODO unitest
	return exchangeAdaptorInstList[exchName];
}

/* Private members */
function registerAdaptor(exchName, adaptorInst){
	exchangeAdaptorInstList[exchName] = adaptorInst;
}

function unregisterAdaptor(exchName, adaptorInst){
	if(exchangeAdaptorInstList.hasOwnProperty(exchName)){
		exchangeAdaptorInstList[exchName] = null;
		delete exchangeAdaptorInstList[exchName];
	}
}

module.exports = ExchangeManager;

