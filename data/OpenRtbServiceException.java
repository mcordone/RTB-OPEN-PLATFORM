
package com.aol.platforms.rtbgateway.exchanges.translator.data.openrtb;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class OpenRtbServiceException {

    private int code;
    private String message;
    private String reason;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

}
