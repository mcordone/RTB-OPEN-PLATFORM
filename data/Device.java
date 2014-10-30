
package com.aol.platforms.rtbgateway.exchanges.translator.data.openrtb;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Device {

    private String ua;
    private Geo geo;
    private String ip;
    private String ipv6;
    private int dnt;
    private String ifa;
    private String dpidsha1;
    private String dpidmd5;
    private String didsha1;
    private String didmd5;
    private String macmd5;
    private String macsha1;
    private String carrier;
    private int connectiontype;
    private boolean js;
    private String language;
    private String make;
    private String model;
    private String os;
    private String osv;
    private String flashver;
    private int devicetype;
    private DeviceExt ext;

    public String getUa() {
        return ua;
    }

    public void setUa(String ua) {
        this.ua = ua;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIpv6() {
        return ipv6;
    }

    public void setIpv6(String ipv6) {
        this.ipv6 = ipv6;
    }

    public int getDnt() {
        return dnt;
    }

    public void setDnt(int dnt) {
        this.dnt = dnt;
    }

    public String getIfa() {
        return ifa;
    }

    public void setIfa(String ifa) {
        this.ifa = ifa;
    }

    public String getDpidsha1() {
        return dpidsha1;
    }

    public void setDpidsha1(String dpidsha1) {
        this.dpidsha1 = dpidsha1;
    }

    public String getDpidmd5() {
        return dpidmd5;
    }

    public void setDpidmd5(String dpidmd5) {
        this.dpidmd5 = dpidmd5;
    }

    public String getDidsha1() {
        return didsha1;
    }

    public void setDidsha1(String didsha1) {
        this.didsha1 = didsha1;
    }

    public String getDidmd5() {
        return didmd5;
    }

    public void setDidmd5(String didmd5) {
        this.didmd5 = didmd5;
    }

    public String getMacmd5() {
        return macmd5;
    }

    public void setMacmd5(String macmd5) {
        this.macmd5 = macmd5;
    }

    public String getMacsha1() {
        return macsha1;
    }

    public void setMacsha1(String macsha1) {
        this.macsha1 = macsha1;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public int getConnectiontype() {
        return connectiontype;
    }

    public void setConnectiontype(int connectiontype) {
        this.connectiontype = connectiontype;
    }

    public boolean isJs() {
        return js;
    }

    public void setJs(boolean js) {
        this.js = js;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getOsv() {
        return osv;
    }

    public void setOsv(String osv) {
        this.osv = osv;
    }

    public String getFlashver() {
        return flashver;
    }

    public void setFlashver(String flashver) {
        this.flashver = flashver;
    }

    public int getDevicetype() {
        return devicetype;
    }

    public void setDevicetype(int devicetype) {
        this.devicetype = devicetype;
    }

    public DeviceExt getExt() {
        return ext;
    }

    public void setExt(DeviceExt ext) {
        this.ext = ext;
    }

}
