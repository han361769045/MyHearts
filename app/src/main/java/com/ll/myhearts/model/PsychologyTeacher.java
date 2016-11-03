package com.ll.myhearts.model;

/**
 * Created by LeoLu on 2016/11/3.
 */

public class PsychologyTeacher {

    /**
     * userid : 7542
     * nickname : 曹华
     * avatar : http://image.xinliji.me/o_1b0c6uq0l14gl1np4a0mumo1ouma.png
     * title : 青春成长咨询师
     * qualification : 国二
     */

    private String userid;
    private String nickname;
    private String avatar;
    private String title;
    private String qualification;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
