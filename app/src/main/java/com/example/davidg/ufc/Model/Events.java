package com.example.davidg.ufc.Model;

/**
 * Created by DavidG on 20/03/2018.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Events {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("event_date")
    @Expose
    private String eventDate;
    @SerializedName("secondary_feature_image")
    @Expose
    private String secondaryFeatureImage;
    @SerializedName("ticket_image")
    @Expose
    private String ticketImage;
    @SerializedName("event_time_zone_text")
    @Expose
    private String eventTimeZoneText;
    @SerializedName("short_description")
    @Expose
    private String shortDescription;
    @SerializedName("event_dategmt")
    @Expose
    private String eventDategmt;
    @SerializedName("end_event_dategmt")
    @Expose
    private String endEventDategmt;
    @SerializedName("ticketurl")
    @Expose
    private String ticketurl;
    @SerializedName("ticket_seller_name")
    @Expose
    private Object ticketSellerName;
    @SerializedName("base_title")
    @Expose
    private String baseTitle;
    @SerializedName("title_tag_line")
    @Expose
    private String titleTagLine;
    @SerializedName("twitter_hashtag")
    @Expose
    private String twitterHashtag;
    @SerializedName("ticket_general_sale_date")
    @Expose
    private Object ticketGeneralSaleDate;
    @SerializedName("statid")
    @Expose
    private Integer statid;
    @SerializedName("feature_image")
    @Expose
    private String featureImage;
    @SerializedName("event_time_text")
    @Expose
    private String eventTimeText;
    @SerializedName("ticket_general_sale_text")
    @Expose
    private String ticketGeneralSaleText;
    @SerializedName("subtitle")
    @Expose
    private String subtitle;
    @SerializedName("event_status")
    @Expose
    private String eventStatus;
    @SerializedName("isppvevent")
    @Expose
    private Boolean isppvevent;
    @SerializedName("corner_audio_available")
    @Expose
    private Boolean cornerAudioAvailable;
    @SerializedName("corner_audio_blue_stream_url")
    @Expose
    private Object cornerAudioBlueStreamUrl;
    @SerializedName("corner_audio_red_stream_url")
    @Expose
    private Object cornerAudioRedStreamUrl;
    @SerializedName("last_modified")
    @Expose
    private String lastModified;
    @SerializedName("url_name")
    @Expose
    private String urlName;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("trailer_url")
    @Expose
    private Object trailerUrl;
    @SerializedName("arena")
    @Expose
    private String arena;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("fm_fnt_feed_url")
    @Expose
    private String fmFntFeedUrl;
    @SerializedName("main_event_fighter1_id")
    @Expose
    private Integer mainEventFighter1Id;
    @SerializedName("main_event_fighter2_id")
    @Expose
    private Integer mainEventFighter2Id;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getSecondaryFeatureImage() {
        return secondaryFeatureImage;
    }

    public void setSecondaryFeatureImage(String secondaryFeatureImage) {
        this.secondaryFeatureImage = secondaryFeatureImage;
    }

    public String getTicketImage() {
        return ticketImage;
    }

    public void setTicketImage(String ticketImage) {
        this.ticketImage = ticketImage;
    }

    public String getEventTimeZoneText() {
        return eventTimeZoneText;
    }

    public void setEventTimeZoneText(String eventTimeZoneText) {
        this.eventTimeZoneText = eventTimeZoneText;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getEventDategmt() {
        return eventDategmt;
    }

    public void setEventDategmt(String eventDategmt) {
        this.eventDategmt = eventDategmt;
    }

    public String getEndEventDategmt() {
        return endEventDategmt;
    }

    public void setEndEventDategmt(String endEventDategmt) {
        this.endEventDategmt = endEventDategmt;
    }

    public String getTicketurl() {
        return ticketurl;
    }

    public void setTicketurl(String ticketurl) {
        this.ticketurl = ticketurl;
    }

    public Object getTicketSellerName() {
        return ticketSellerName;
    }

    public void setTicketSellerName(Object ticketSellerName) {
        this.ticketSellerName = ticketSellerName;
    }

    public String getBaseTitle() {
        return baseTitle;
    }

    public void setBaseTitle(String baseTitle) {
        this.baseTitle = baseTitle;
    }

    public String getTitleTagLine() {
        return titleTagLine;
    }

    public void setTitleTagLine(String titleTagLine) {
        this.titleTagLine = titleTagLine;
    }

    public String getTwitterHashtag() {
        return twitterHashtag;
    }

    public void setTwitterHashtag(String twitterHashtag) {
        this.twitterHashtag = twitterHashtag;
    }

    public Object getTicketGeneralSaleDate() {
        return ticketGeneralSaleDate;
    }

    public void setTicketGeneralSaleDate(Object ticketGeneralSaleDate) {
        this.ticketGeneralSaleDate = ticketGeneralSaleDate;
    }

    public Integer getStatid() {
        return statid;
    }

    public void setStatid(Integer statid) {
        this.statid = statid;
    }

    public String getFeatureImage() {
        return featureImage;
    }

    public void setFeatureImage(String featureImage) {
        this.featureImage = featureImage;
    }

    public String getEventTimeText() {
        return eventTimeText;
    }

    public void setEventTimeText(String eventTimeText) {
        this.eventTimeText = eventTimeText;
    }

    public String getTicketGeneralSaleText() {
        return ticketGeneralSaleText;
    }

    public void setTicketGeneralSaleText(String ticketGeneralSaleText) {
        this.ticketGeneralSaleText = ticketGeneralSaleText;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
    }

    public Boolean getIsppvevent() {
        return isppvevent;
    }

    public void setIsppvevent(Boolean isppvevent) {
        this.isppvevent = isppvevent;
    }

    public Boolean getCornerAudioAvailable() {
        return cornerAudioAvailable;
    }

    public void setCornerAudioAvailable(Boolean cornerAudioAvailable) {
        this.cornerAudioAvailable = cornerAudioAvailable;
    }

    public Object getCornerAudioBlueStreamUrl() {
        return cornerAudioBlueStreamUrl;
    }

    public void setCornerAudioBlueStreamUrl(Object cornerAudioBlueStreamUrl) {
        this.cornerAudioBlueStreamUrl = cornerAudioBlueStreamUrl;
    }

    public Object getCornerAudioRedStreamUrl() {
        return cornerAudioRedStreamUrl;
    }

    public void setCornerAudioRedStreamUrl(Object cornerAudioRedStreamUrl) {
        this.cornerAudioRedStreamUrl = cornerAudioRedStreamUrl;
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

    public Object getTrailerUrl() {
        return trailerUrl;
    }

    public void setTrailerUrl(Object trailerUrl) {
        this.trailerUrl = trailerUrl;
    }

    public String getArena() {
        return arena;
    }

    public void setArena(String arena) {
        this.arena = arena;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFmFntFeedUrl() {
        return fmFntFeedUrl;
    }

    public void setFmFntFeedUrl(String fmFntFeedUrl) {
        this.fmFntFeedUrl = fmFntFeedUrl;
    }

    public Integer getMainEventFighter1Id() {
        return mainEventFighter1Id;
    }

    public void setMainEventFighter1Id(Integer mainEventFighter1Id) {
        this.mainEventFighter1Id = mainEventFighter1Id;
    }

    public Integer getMainEventFighter2Id() {
        return mainEventFighter2Id;
    }

    public void setMainEventFighter2Id(Integer mainEventFighter2Id) {
        this.mainEventFighter2Id = mainEventFighter2Id;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

}