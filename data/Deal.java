
package com.aol.platforms.rtbgateway.exchanges.translator.data.openrtb;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Deal {

    private String id;
    private double bidfloor;
    private String bidfloorcur;
    private List<String> wseat = new ArrayList<String>();
    private List<String> wadomain = new ArrayList<String>();
    private int at;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBidfloor() {
        return bidfloor;
    }

    public void setBidfloor(double bidfloor) {
        this.bidfloor = bidfloor;
    }

    public String getBidfloorcur() {
        return bidfloorcur;
    }

    public void setBidfloorcur(String bidfloorcur) {
        this.bidfloorcur = bidfloorcur;
    }

    public List<String> getWseat() {
        return wseat;
    }

    public void setWseat(List<String> wseat) {
        this.wseat = wseat;
    }

    public List<String> getWadomain() {
        return wadomain;
    }

    public void setWadomain(List<String> wadomain) {
        this.wadomain = wadomain;
    }

    public int getAt() {
        return at;
    }

    public void setAt(int at) {
        this.at = at;
    }

}
