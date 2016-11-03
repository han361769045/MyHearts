package com.ll.myhearts.model;

/**
 * Created by LeoLu on 2016/11/3.
 */

public class UserModel {


    /**
     * userid : 0
     * isValid : 0
     * rongcloud_token :
     * online_token :
     * mood_color : #00b07d
     * mood_level : 0.5
     * mood_value : 60
     * mood_icon : http://7xi9sc.com2.z0.glb.qiniucdn.com/sad.png
     */

    private String userid;
    private String isValid;
    private String rongcloud_token;
    private String online_token;
    private String mood_color;
    private String mood_level;
    private String mood_value;
    private String mood_icon;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    public String getRongcloud_token() {
        return rongcloud_token;
    }

    public void setRongcloud_token(String rongcloud_token) {
        this.rongcloud_token = rongcloud_token;
    }

    public String getOnline_token() {
        return online_token;
    }

    public void setOnline_token(String online_token) {
        this.online_token = online_token;
    }

    public String getMood_color() {
        return mood_color;
    }

    public void setMood_color(String mood_color) {
        this.mood_color = mood_color;
    }

    public String getMood_level() {
        return mood_level;
    }

    public void setMood_level(String mood_level) {
        this.mood_level = mood_level;
    }

    public String getMood_value() {
        return mood_value;
    }

    public void setMood_value(String mood_value) {
        this.mood_value = mood_value;
    }

    public String getMood_icon() {
        return mood_icon;
    }

    public void setMood_icon(String mood_icon) {
        this.mood_icon = mood_icon;
    }
}
