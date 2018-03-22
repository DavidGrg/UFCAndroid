package com.example.davidg.ufc.Model;

/**
 * Created by DavidG on 22/03/2018.
 */


import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Media {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("media_date")
    @Expose
    private String mediaDate;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("more_link_text")
    @Expose
    private String moreLinkText;
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;
    @SerializedName("internal_url")
    @Expose
    private String internalUrl;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("more_linkurl")
    @Expose
    private String moreLinkurl;
    @SerializedName("embedded_type")
    @Expose
    private Object embeddedType;
    @SerializedName("embedded_id")
    @Expose
    private String embeddedId;
    @SerializedName("mobile_stream_url")
    @Expose
    private String mobileStreamUrl;
    @SerializedName("mobile_video_url")
    @Expose
    private String mobileVideoUrl;
    @SerializedName("last_modified")
    @Expose
    private String lastModified;
    @SerializedName("url_name")
    @Expose
    private String urlName;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("keyword_ids")
    @Expose
    private List<Integer> keywordIds = null;
    @SerializedName("published_start_date")
    @Expose
    private String publishedStartDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMediaDate() {
        return mediaDate;
    }

    public void setMediaDate(String mediaDate) {
        this.mediaDate = mediaDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMoreLinkText() {
        return moreLinkText;
    }

    public void setMoreLinkText(String moreLinkText) {
        this.moreLinkText = moreLinkText;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getInternalUrl() {
        return internalUrl;
    }

    public void setInternalUrl(String internalUrl) {
        this.internalUrl = internalUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMoreLinkurl() {
        return moreLinkurl;
    }

    public void setMoreLinkurl(String moreLinkurl) {
        this.moreLinkurl = moreLinkurl;
    }

    public Object getEmbeddedType() {
        return embeddedType;
    }

    public void setEmbeddedType(Object embeddedType) {
        this.embeddedType = embeddedType;
    }

    public String getEmbeddedId() {
        return embeddedId;
    }

    public void setEmbeddedId(String embeddedId) {
        this.embeddedId = embeddedId;
    }

    public String getMobileStreamUrl() {
        return mobileStreamUrl;
    }

    public void setMobileStreamUrl(String mobileStreamUrl) {
        this.mobileStreamUrl = mobileStreamUrl;
    }

    public String getMobileVideoUrl() {
        return mobileVideoUrl;
    }

    public void setMobileVideoUrl(String mobileVideoUrl) {
        this.mobileVideoUrl = mobileVideoUrl;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public String getUrlName() {
        return urlName;
    }

    public void setUrlName(String urlName) {
        this.urlName = urlName;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public List<Integer> getKeywordIds() {
        return keywordIds;
    }

    public void setKeywordIds(List<Integer> keywordIds) {
        this.keywordIds = keywordIds;
    }

    public String getPublishedStartDate() {
        return publishedStartDate;
    }

    public void setPublishedStartDate(String publishedStartDate) {
        this.publishedStartDate = publishedStartDate;
    }

}
