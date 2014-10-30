
package com.aol.platforms.rtbgateway.exchanges.translator.data.openrtb;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Banner {

    private String id;
    private int w;
    private int h;
    private int wmax;
    private int hmax;
    private int wmin;
    private int hmin;
    private int pos;
    private List<Integer> btype = new ArrayList<Integer>();
    private List<Integer> battr = new ArrayList<Integer>();
    private List<String> mimes = new ArrayList<String>();
    private int topframe;
    private List<Integer> expdir = new ArrayList<Integer>();
    private List<Integer> api = new ArrayList<Integer>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getWmax() {
        return wmax;
    }

    public void setWmax(int wmax) {
        this.wmax = wmax;
    }

    public int getHmax() {
        return hmax;
    }

    public void setHmax(int hmax) {
        this.hmax = hmax;
    }

    public int getWmin() {
        return wmin;
    }

    public void setWmin(int wmin) {
        this.wmin = wmin;
    }

    public int getHmin() {
        return hmin;
    }

    public void setHmin(int hmin) {
        this.hmin = hmin;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public List<Integer> getBtype() {
        return btype;
    }

    public void setBtype(List<Integer> btype) {
        this.btype = btype;
    }

    public List<Integer> getBattr() {
        return battr;
    }

    public void setBattr(List<Integer> battr) {
        this.battr = battr;
    }

    public List<String> getMimes() {
        return mimes;
    }

    public void setMimes(List<String> mimes) {
        this.mimes = mimes;
    }

    public int getTopframe() {
        return topframe;
    }

    public void setTopframe(int topframe) {
        this.topframe = topframe;
    }

    public List<Integer> getExpdir() {
        return expdir;
    }

    public void setExpdir(List<Integer> expdir) {
        this.expdir = expdir;
    }

    public List<Integer> getApi() {
        return api;
    }

    public void setApi(List<Integer> api) {
        this.api = api;
    }

}
