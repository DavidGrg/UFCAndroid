package com.example.davidg.ufc.Model;

/**
 * Created by DavidG on 20/03/2018.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fighters {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("nickname")
    @Expose
    private Object nickname;
    @SerializedName("wins")
    @Expose
    private Integer wins;
    @SerializedName("statid")
    @Expose
    private Integer statid;
    @SerializedName("losses")
    @Expose
    private Integer losses;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("weight_class")
    @Expose
    private String weightClass;
    @SerializedName("title_holder")
    @Expose
    private Boolean titleHolder;
    @SerializedName("draws")
    @Expose
    private Integer draws;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("fighter_status")
    @Expose
    private String fighterStatus;
    @SerializedName("rank")
    @Expose
    private String rank;
    @SerializedName("pound_for_pound_rank")
    @Expose
    private String poundForPoundRank;
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;
    @SerializedName("belt_thumbnail")
    @Expose
    private String beltThumbnail;
    @SerializedName("left_full_body_image")
    @Expose
    private String leftFullBodyImage;
    @SerializedName("right_full_body_image")
    @Expose
    private String rightFullBodyImage;
    @SerializedName("profile_image")
    @Expose
    private String profileImage;
    @SerializedName("link")
    @Expose
    private String link;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Object getNickname(int position) {
        return nickname;
    }

    public void setNickname(Object nickname) {
        this.nickname = nickname;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public Integer getStatid() {
        return statid;
    }

    public void setStatid(Integer statid) {
        this.statid = statid;
    }

    public Integer getLosses() {
        return losses;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getWeightClass() {
        return weightClass;
    }

    public void setWeightClass(String weightClass) {
        this.weightClass = weightClass;
    }

    public Boolean getTitleHolder() {
        return titleHolder;
    }

    public void setTitleHolder(Boolean titleHolder) {
        this.titleHolder = titleHolder;
    }

    public Integer getDraws() {
        return draws;
    }

    public void setDraws(Integer draws) {
        this.draws = draws;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFighterStatus() {
        return fighterStatus;
    }

    public void setFighterStatus(String fighterStatus) {
        this.fighterStatus = fighterStatus;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getPoundForPoundRank() {
        return poundForPoundRank;
    }

    public void setPoundForPoundRank(String poundForPoundRank) {
        this.poundForPoundRank = poundForPoundRank;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getBeltThumbnail() {
        return beltThumbnail;
    }

    public void setBeltThumbnail(String beltThumbnail) {
        this.beltThumbnail = beltThumbnail;
    }

    public String getLeftFullBodyImage() {
        return leftFullBodyImage;
    }

    public void setLeftFullBodyImage(String leftFullBodyImage) {
        this.leftFullBodyImage = leftFullBodyImage;
    }

    public String getRightFullBodyImage() {
        return rightFullBodyImage;
    }

    public void setRightFullBodyImage(String rightFullBodyImage) {
        this.rightFullBodyImage = rightFullBodyImage;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Fighters{" +
                "id=" + id +
                ", nickname=" + nickname +
                ", wins=" + wins +
                ", statid=" + statid +
                ", losses=" + losses +
                ", lastName='" + lastName + '\'' +
                ", weightClass='" + weightClass + '\'' +
                ", titleHolder=" + titleHolder +
                ", draws=" + draws +
                ", firstName='" + firstName + '\'' +
                ", fighterStatus='" + fighterStatus + '\'' +
                ", rank='" + rank + '\'' +
                ", poundForPoundRank='" + poundForPoundRank + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", beltThumbnail='" + beltThumbnail + '\'' +
                ", leftFullBodyImage='" + leftFullBodyImage + '\'' +
                ", rightFullBodyImage='" + rightFullBodyImage + '\'' +
                ", profileImage='" + profileImage + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}