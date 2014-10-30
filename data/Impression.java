
package com.aol.platforms.rtbgateway.exchanges.translator.data.openrtb;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Impression {

    private String id;
    private Banner banner;
    private Video video;
    private String displaymanager;
    private String displaymanagerver;
    private int instl;
    private String tagid;
    private double bidfloor;
    private String bidfloorcur;
    private List<String> iframebuster = new ArrayList<String>();
    private int secure;
    private Pmp pmp;
    private Impressionxt ext;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Banner getBanner() {
        return banner;
    }

    public void setBanner(Banner banner) {
        this.banner = banner;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public String getDisplaymanager() {
        return displaymanager;
    }

    public void setDisplaymanager(String displaymanager) {
        this.displaymanager = displaymanager;
    }

    public String getDisplaymanagerver() {
        return displaymanagerver;
    }

    public void setDisplaymanagerver(String displaymanagerver) {
        this.displaymanagerver = displaymanagerver;
    }

    public int getInstl() {
        return instl;
    }

    public void setInstl(int instl) {
        this.instl = instl;
    }

    public String getTagid() {
        return tagid;
    }

    public void setTagid(String tagid) {
        this.tagid = tagid;
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

    public List<String> getIframebuster() {
        return iframebuster;
    }

    public void setIframebuster(List<String> iframebuster) {
        this.iframebuster = iframebuster;
    }

    public int getSecure() {
        return secure;
    }

    public void setSecure(int secure) {
        this.secure = secure;
    }

    public Pmp getPmp() {
        return pmp;
    }

    public void setPmp(Pmp pmp) {
        this.pmp = pmp;
    }

    public Impressionxt getExt() {
        return ext;
    }

    public void setExt(Impressionxt ext) {
        this.ext = ext;
    }

}
