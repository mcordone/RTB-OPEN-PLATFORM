
package com.aol.platforms.rtbgateway.exchanges.translator.data.openrtb;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Pmp {

    private int privateAuction;
    private List<Deal> deals = new ArrayList<Deal>();

    public int getPrivateAuction() {
        return privateAuction;
    }

    public void setPrivateAuction(int privateAuction) {
        this.privateAuction = privateAuction;
    }

    public List<Deal> getDeals() {
        return deals;
    }

    public void setDeals(List<Deal> deals) {
        this.deals = deals;
    }

}
