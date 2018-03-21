package com.example.davidg.ufc.Model;

/**
 * Created by DavidG on 20/03/2018.
 */

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class News {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("external_url_text")
    @Expose
    private String externalUrlText;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("article_media_id")
    @Expose
    private Object articleMediaId;
    @SerializedName("article_date")
    @Expose
    private String articleDate;
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;
    @SerializedName("external_url")
    @Expose
    private String externalUrl;
    @SerializedName("introduction")
    @Expose
    private String introduction;
    @SerializedName("article_fighter_id")
    @Expose
    private Object articleFighterId;
    @SerializedName("featured_news_category")
    @Expose
    private Object featuredNewsCategory;
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
    private List<Object> keywordIds = null;
    @SerializedName("published_start_date")
    @Expose
    private String publishedStartDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExternalUrlText() {
        return externalUrlText;
    }

    public void setExternalUrlText(String externalUrlText) {
        this.externalUrlText = externalUrlText;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getArticleMediaId() {
        return articleMediaId;
    }

    public void setArticleMediaId(Object articleMediaId) {
        this.articleMediaId = articleMediaId;
    }

    public String getArticleDate() {
        return articleDate;
    }

    public void setArticleDate(String articleDate) {
        this.articleDate = articleDate;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getExternalUrl() {
        return externalUrl;
    }

    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Object getArticleFighterId() {
        return articleFighterId;
    }

    public void setArticleFighterId(Object articleFighterId) {
        this.articleFighterId = articleFighterId;
    }

    public Object getFeaturedNewsCategory() {
        return featuredNewsCategory;
    }

    public void setFeaturedNewsCategory(Object featuredNewsCategory) {
        this.featuredNewsCategory = featuredNewsCategory;
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

    public List<Object> getKeywordIds() {
        return keywordIds;
    }

    public void setKeywordIds(List<Object> keywordIds) {
        this.keywordIds = keywordIds;
    }

    public String getPublishedStartDate() {
        return publishedStartDate;
    }

    public void setPublishedStartDate(String publishedStartDate) {
        this.publishedStartDate = publishedStartDate;
    }

}