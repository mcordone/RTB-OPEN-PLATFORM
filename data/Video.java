
package com.aol.platforms.rtbgateway.exchanges.translator.data.openrtb;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Video {

    private List<String> mimes = new ArrayList<String>();
    private int minduration;
    private int maxduration;
    private int protocol;
    private List<Integer> protocols = new ArrayList<Integer>();
    private int linearity;
    private int w;
    private int h;
    private int pos;
    private List<Integer> api = new ArrayList<Integer>();
    private int startDelay;
    private int sequence;
    private List<Integer> battr = new ArrayList<Integer>();
    private int maxextended;
    private int minbitrate;
    private int maxbitrate;
    private int boxingallowed;
    private List<Integer> playbackmethod = new ArrayList<Integer>();
    private List<Integer> delivery = new ArrayList<Integer>();
    private List<Banner> companionad = new ArrayList<Banner>();
    private List<Integer> companiontype = new ArrayList<Integer>();

    public List<String> getMimes() {
        return mimes;
    }

    public void setMimes(List<String> mimes) {
        this.mimes = mimes;
    }

    public int getMinduration() {
        return minduration;
    }

    public void setMinduration(int minduration) {
        this.minduration = minduration;
    }

    public int getMaxduration() {
        return maxduration;
    }

    public void setMaxduration(int maxduration) {
        this.maxduration = maxduration;
    }

    public int getProtocol() {
        return protocol;
    }

    public void setProtocol(int protocol) {
        this.protocol = protocol;
    }

    public List<Integer> getProtocols() {
        return protocols;
    }

    public void setProtocols(List<Integer> protocols) {
        this.protocols = protocols;
    }

    public int getLinearity() {
        return linearity;
    }

    public void setLinearity(int linearity) {
        this.linearity = linearity;
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

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public List<Integer> getApi() {
        return api;
    }

    public void setApi(List<Integer> api) {
        this.api = api;
    }

    public int getStartDelay() {
        return startDelay;
    }

    public void setStartDelay(int startDelay) {
        this.startDelay = startDelay;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public List<Integer> getBattr() {
        return battr;
    }

    public void setBattr(List<Integer> battr) {
        this.battr = battr;
    }

    public int getMaxextended() {
        return maxextended;
    }

    public void setMaxextended(int maxextended) {
        this.maxextended = maxextended;
    }

    public int getMinbitrate() {
        return minbitrate;
    }

    public void setMinbitrate(int minbitrate) {
        this.minbitrate = minbitrate;
    }

    public int getMaxbitrate() {
        return maxbitrate;
    }

    public void setMaxbitrate(int maxbitrate) {
        this.maxbitrate = maxbitrate;
    }

    public int getBoxingallowed() {
        return boxingallowed;
    }

    public void setBoxingallowed(int boxingallowed) {
        this.boxingallowed = boxingallowed;
    }

    public List<Integer> getPlaybackmethod() {
        return playbackmethod;
    }

    public void setPlaybackmethod(List<Integer> playbackmethod) {
        this.playbackmethod = playbackmethod;
    }

    public List<Integer> getDelivery() {
        return delivery;
    }

    public void setDelivery(List<Integer> delivery) {
        this.delivery = delivery;
    }

    public List<Banner> getCompanionad() {
        return companionad;
    }

    public void setCompanionad(List<Banner> companionad) {
        this.companionad = companionad;
    }

    public List<Integer> getCompaniontype() {
        return companiontype;
    }

    public void setCompaniontype(List<Integer> companiontype) {
        this.companiontype = companiontype;
    }

}
