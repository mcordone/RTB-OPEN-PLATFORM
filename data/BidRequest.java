
package com.aol.platforms.rtbgateway.exchanges.translator.data.openrtb;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class BidRequest {

    private String id;
    private List<Impression> imp = new ArrayList<Impression>();
    private Site site;
    private App app;
    private Device device;
    private User user;
    private int at;
    private int tmax;
    private List<String> wseat = new ArrayList<String>();
    private int allimps;
    private List<String> cur = new ArrayList<String>();
    private List<String> bcat = new ArrayList<String>();
    private List<String> badv = new ArrayList<String>();
    private Regs regs;
    private RequestExt ext;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Impression> getImp() {
        return imp;
    }

    public void setImp(List<Impression> imp) {
        this.imp = imp;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public App getApp() {
        return app;
    }

    public void setApp(App app) {
        this.app = app;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getAt() {
        return at;
    }

    public void setAt(int at) {
        this.at = at;
    }

    public int getTmax() {
        return tmax;
    }

    public void setTmax(int tmax) {
        this.tmax = tmax;
    }

    public List<String> getWseat() {
        return wseat;
    }

    public void setWseat(List<String> wseat) {
        this.wseat = wseat;
    }

    public int getAllimps() {
        return allimps;
    }

    public void setAllimps(int allimps) {
        this.allimps = allimps;
    }

    public List<String> getCur() {
        return cur;
    }

    public void setCur(List<String> cur) {
        this.cur = cur;
    }

    public List<String> getBcat() {
        return bcat;
    }

    public void setBcat(List<String> bcat) {
        this.bcat = bcat;
    }

    public List<String> getBadv() {
        return badv;
    }

    public void setBadv(List<String> badv) {
        this.badv = badv;
    }

    public Regs getRegs() {
        return regs;
    }

    public void setRegs(Regs regs) {
        this.regs = regs;
    }

    public RequestExt getExt() {
        return ext;
    }

    public void setExt(RequestExt ext) {
        this.ext = ext;
    }

}
