package com.ll.myhearts.model;

/**
 * Created by LeoLu on 2016/11/3.
 */

public class Comments {

    /**
     * userid : 109944
     * nickname : 丹**
     * rating : 5
     * ratinglabel : 非常满意
     * tags : 很专业,态度很好
     * content : 非常不错
     * createdDate : 1476287611
     * createdDateLabel : 16-10-12
     */

    private String userid;
    private String nickname;
    private String rating;
    private String ratinglabel;
    private String tags;
    private String content;
    private int createdDate;
    private String createdDateLabel;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getRatinglabel() {
        return ratinglabel;
    }

    public void setRatinglabel(String ratinglabel) {
        this.ratinglabel = ratinglabel;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(int createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedDateLabel() {
        return createdDateLabel;
    }

    public void setCreatedDateLabel(String createdDateLabel) {
        this.createdDateLabel = createdDateLabel;
    }
}
