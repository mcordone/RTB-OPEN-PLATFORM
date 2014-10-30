
package com.aol.platforms.rtbgateway.exchanges.translator.data.openrtb;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class SeatBid {

    private List<Bid> bid = new ArrayList<Bid>();
    private String seat;
    private int group;
    private SeatBidExt ext;

    public List<Bid> getBid() {
        return bid;
    }

    public void setBid(List<Bid> bid) {
        this.bid = bid;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public SeatBidExt getExt() {
        return ext;
    }

    public void setExt(SeatBidExt ext) {
        this.ext = ext;
    }

}
