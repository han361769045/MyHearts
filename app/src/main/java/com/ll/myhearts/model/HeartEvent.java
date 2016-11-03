package com.ll.myhearts.model;

import java.util.List;

/**
 * Created by LeoLu on 2016/11/3.
 */

public class HeartEvent {

    /**
     * id : 26619
     * actId : 0
     * actName :
     * isAnon : 0
     * labelId : 1
     * label : 其他
     * userid : 92004
     * nickname : 董慧娟
     * avatar : http://image.xinliji.me/o_1ar0cb3bf1akf1ltotja675s7qs.png
     * gender : 0
     * dob : 1985-08-06
     * type : user_event
     * location :
     * content : 许多成年人从小生长在一个不被鼓励，甚至责备他们表达自己思想和感觉的家庭中．要求一个玩具，得到的回应却是父母关于家用拮据的长篇唠叨，这个孩子带着愧疚和失望走开了，当他表示怒气时，父母以严厉和责难的话作为回报，于是这个孩子学会表示愤怒的情绪是不恰当的，他就学会压抑自己的失望，在这种背景下进入成年期，会习惯否认自己的感觉，跟情绪的自我失去了联系．
     * createdDateTime : 1478135702
     * commentCnt : 0
     * photoCnt : 1
     * viewCnt : 65
     * isConsultant : 1
     * photos : ["http://image.xinliji.me/7e6bbcfe-6347-4069-8788-d104b1812b94"]
     * age : 31
     */

    private String id;
    private String actId;
    private String actName;
    private String isAnon;
    private String labelId;
    private String label;
    private String userid;
    private String nickname;
    private String avatar;
    private String gender;
    private String dob;
    private String type;
    private String location;
    private String content;
    private int createdDateTime;
    private String commentCnt;
    private String photoCnt;
    private String viewCnt;
    private String isConsultant;
    private int age;
    private List<String> photos;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getActId() {
        return actId;
    }

    public void setActId(String actId) {
        this.actId = actId;
    }

    public String getActName() {
        return actName;
    }

    public void setActName(String actName) {
        this.actName = actName;
    }

    public String getIsAnon() {
        return isAnon;
    }

    public void setIsAnon(String isAnon) {
        this.isAnon = isAnon;
    }

    public String getLabelId() {
        return labelId;
    }

    public void setLabelId(String labelId) {
        this.labelId = labelId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

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

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(int createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public String getCommentCnt() {
        return commentCnt;
    }

    public void setCommentCnt(String commentCnt) {
        this.commentCnt = commentCnt;
    }

    public String getPhotoCnt() {
        return photoCnt;
    }

    public void setPhotoCnt(String photoCnt) {
        this.photoCnt = photoCnt;
    }

    public String getViewCnt() {
        return viewCnt;
    }

    public void setViewCnt(String viewCnt) {
        this.viewCnt = viewCnt;
    }

    public String getIsConsultant() {
        return isConsultant;
    }

    public void setIsConsultant(String isConsultant) {
        this.isConsultant = isConsultant;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getPhotos() {
        return photos;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }
}
