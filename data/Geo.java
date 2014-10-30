
package com.aol.platforms.rtbgateway.exchanges.translator.data.openrtb;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Geo {

    private int type;
    private double lat;
    private double lon;
    private String country;
    private String region;
    private String regionfips104;
    private String metro;
    private String zip;
    private String city;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegionfips104() {
        return regionfips104;
    }

    public void setRegionfips104(String regionfips104) {
        this.regionfips104 = regionfips104;
    }

    public String getMetro() {
        return metro;
    }

    public void setMetro(String metro) {
        this.metro = metro;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
