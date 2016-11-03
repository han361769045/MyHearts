package com.ll.myhearts.model;

/**
 * Created by LeoLu on 2016/11/3.
 */

public class TopCommentEntity {

    private String id;
    private String objectId;
    private String objectType;
    private String userid;
    private String name;
    private String avatar;
    private String replyToUserid;
    private String replyToUserName;
    private String replyToContent;
    private String content;
    private int createdDate;
    private String consultantTags;
    private String rating;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getReplyToUserid() {
        return replyToUserid;
    }

    public void setReplyToUserid(String replyToUserid) {
        this.replyToUserid = replyToUserid;
    }

    public String getReplyToUserName() {
        return replyToUserName;
    }

    public void setReplyToUserName(String replyToUserName) {
        this.replyToUserName = replyToUserName;
    }

    public String getReplyToContent() {
        return replyToContent;
    }

    public void setReplyToContent(String replyToContent) {
        this.replyToContent = replyToContent;
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

    public String getConsultantTags() {
        return consultantTags;
    }

    public void setConsultantTags(String consultantTags) {
        this.consultantTags = consultantTags;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}

