
package com.aol.platforms.rtbgateway.exchanges.translator.data.openrtb;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class BidResponse {

    private String id;
    private List<SeatBid> seatbid = new ArrayList<SeatBid>();
    private String bidid;
    private String cur;
    private String customdata;
    private int nbr;
    private ResponseExt ext;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<SeatBid> getSeatbid() {
        return seatbid;
    }

    public void setSeatbid(List<SeatBid> seatbid) {
        this.seatbid = seatbid;
    }

    public String getBidid() {
        return bidid;
    }

    public void setBidid(String bidid) {
        this.bidid = bidid;
    }

    public String getCur() {
        return cur;
    }

    public void setCur(String cur) {
        this.cur = cur;
    }

    public String getCustomdata() {
        return customdata;
    }

    public void setCustomdata(String customdata) {
        this.customdata = customdata;
    }

    public int getNbr() {
        return nbr;
    }

    public void setNbr(int nbr) {
        this.nbr = nbr;
    }

    public ResponseExt getExt() {
        return ext;
    }

    public void setExt(ResponseExt ext) {
        this.ext = ext;
    }

}
