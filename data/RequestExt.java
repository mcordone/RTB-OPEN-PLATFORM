
package com.aol.platforms.rtbgateway.exchanges.translator.data.openrtb;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class RequestExt {

    private String exchangeId;
    private String openRTBVersion = "2.2";
    private String version = "1.2";
    private String uuid;

    public String getExchangeId() {
        return exchangeId;
    }

    public void setExchangeId(String exchangeId) {
        this.exchangeId = exchangeId;
    }

    public String getOpenRTBVersion() {
        return openRTBVersion;
    }

    public void setOpenRTBVersion(String openRTBVersion) {
        this.openRTBVersion = openRTBVersion;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

}
