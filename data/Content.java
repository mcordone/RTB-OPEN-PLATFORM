
package com.aol.platforms.rtbgateway.exchanges.translator.data.openrtb;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Content {

    private String id;
    private String series;
    private String season;
    private String title;
    private int episode;
    private String url;
    private int len;
    private int context;
    private int livesteam;
    private int videoquality;
    private String language;
    private int embeddable;
    private List<String> cat = new ArrayList<String>();
    private List<String> keywords = new ArrayList<String>();
    private String contentrating;
    private String userrating;
    private int qagmediarating;
    private int sourcerelationship;
    private Producer producer;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEpisode() {
        return episode;
    }

    public void setEpisode(int episode) {
        this.episode = episode;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public int getContext() {
        return context;
    }

    public void setContext(int context) {
        this.context = context;
    }

    public int getLivesteam() {
        return livesteam;
    }

    public void setLivesteam(int livesteam) {
        this.livesteam = livesteam;
    }

    public int getVideoquality() {
        return videoquality;
    }

    public void setVideoquality(int videoquality) {
        this.videoquality = videoquality;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getEmbeddable() {
        return embeddable;
    }

    public void setEmbeddable(int embeddable) {
        this.embeddable = embeddable;
    }

    public List<String> getCat() {
        return cat;
    }

    public void setCat(List<String> cat) {
        this.cat = cat;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public String getContentrating() {
        return contentrating;
    }

    public void setContentrating(String contentrating) {
        this.contentrating = contentrating;
    }

    public String getUserrating() {
        return userrating;
    }

    public void setUserrating(String userrating) {
        this.userrating = userrating;
    }

    public int getQagmediarating() {
        return qagmediarating;
    }

    public void setQagmediarating(int qagmediarating) {
        this.qagmediarating = qagmediarating;
    }

    public int getSourcerelationship() {
        return sourcerelationship;
    }

    public void setSourcerelationship(int sourcerelationship) {
        this.sourcerelationship = sourcerelationship;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

}
