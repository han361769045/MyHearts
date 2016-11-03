package com.ll.myhearts.model;

import java.util.List;

/**
 * Created by LeoLu on 2016/11/3.
 */

public class PsychologyTeacherDetail extends PsychologyTeacher {

    /**
     * qjCode :
     * audioLength :
     * gender : 0
     * score : 0
     * dob : 1984-10-22
     * constellation : 1
     * height : 160
     * weight : 60
     * role : 0
     * emotion : 0
     * occupation :
     * label :
     * hobby :
     * like :
     * hate :
     * isLiked : 0
     * isFollowed : 0
     * isInBlacklist : 0
     * groupCnt : 0
     * cmtCnt : 6
     * isAnchor : 0
     * distance : 0
     * lastLoginLatitude : 27.997699
     * lastLoginLongitude : 120.721583
     * lastLoginTime : 1478094795
     * isConsultant : 1
     * honor : 国家二级心理咨询师
     * resume : 2005年毕业于温州医科大学，三甲医院工作近10年。国家二级咨询师，国家三级公共营养师。温州市心理学会会员；温州市图书馆心理驿站辅导成员；温州市瓯海区暖心工坊成员。参加后现代心里教练工作坊中科院心理研究所史占彪授课；温州大学杨德省催眠培训；徐毅强自然催眠课程；黄国胜人格面具培训课程，马孟骏SFBT 焦点解决模式课程。多年医学和心理学专业背景以及自我成长经历，可以引领处于不同心理阶段的求助者摆脱阴霾，慢慢学会自我觉察，自我成长，而达到自发自动的成长与完善。擅长：婚恋关系、孩子教育、青春期问题、情绪压力等方面咨询。
     * qualificationPhotos : http://image.xinliji.me/o_1aot3klnh15ci1afu1rln4ek1om4j.jpg,http://image.xinliji.me/o_1aot3klnhksc1cnp4vp8l980tk.jpg
     * fee : 500元/小时
     * reserveFee : 300
     * clinicName : 我心APP平台
     * address :
     * lon :
     * lat :
     * isNamePending : 0
     * isQuaPending : 1
     * nameDraft :
     * quaDraft : 国二
     * quaPhotosDraft : http://image.xinliji.me/Ftvv8OOo8xyDt__LzOLgRP9Wjcjb
     * videoProfile :
     * webcallPrice : 50
     * canShare : 1
     * shareTitle : 【我心】(心理记)注册咨询师
     * shareContent : 相约【我心】(心理记)，我是您的专属心理咨询师 金新新
     * age : 32
     * catgsRating : [{"key":"JIAOLV","label":"焦虑","rating":"1"},{"key":"MOOD_OTHER","label":"其他","rating":"2"},{"key":"YIYUZHENG","label":"抑郁症","rating":"2"},{"key":"ZIBEI","label":"自卑","rating":"1"}]
     * topComment : {"id":"70948","objectId":"87135","objectType":"consultant","userid":"102926","name":"珊**","avatar":"http://icon.xinliji.me//avatar_0_73.png","replyToUserid":"","replyToUserName":"","replyToContent":"","content":"好，很喜欢","createdDate":1473776044,"consultantTags":"抑郁症","rating":"5"}
     * timelyPercent : 60.00
     * giftNum : 15
     */

    private String qjCode;
    private String audioLength;
    private String gender;
    private String score;
    private String dob;
    private String constellation;
    private String height;
    private String weight;
    private String role;
    private String emotion;
    private String occupation;
    private String label;
    private String hobby;
    private String like;
    private String hate;
    private String isLiked;
    private String isFollowed;
    private String isInBlacklist;
    private String groupCnt;
    private String cmtCnt;
    private String isAnchor;
    private String distance;
    private String lastLoginLatitude;
    private String lastLoginLongitude;
    private int lastLoginTime;
    private String isConsultant;
    private String honor;
    private String resume;
    private String qualificationPhotos;
    private String fee;
    private int reserveFee;
    private String clinicName;
    private String address;
    private String lon;
    private String lat;
    private String isNamePending;
    private String isQuaPending;
    private String nameDraft;
    private String quaDraft;
    private String quaPhotosDraft;
    private String videoProfile;
    private String webcallPrice;
    private String canShare;
    private String shareTitle;
    private String shareContent;
    private int age;
    /**
     * id : 70948
     * objectId : 87135
     * objectType : consultant
     * userid : 102926
     * name : 珊**
     * avatar : http://icon.xinliji.me//avatar_0_73.png
     * replyToUserid :
     * replyToUserName :
     * replyToContent :
     * content : 好，很喜欢
     * createdDate : 1473776044
     * consultantTags : 抑郁症
     * rating : 5
     */

    private TopCommentEntity topComment;
    private String timelyPercent;
    private String giftNum;
    /**
     * key : JIAOLV
     * label : 焦虑
     * rating : 1
     */

    private List<CatgsRatingEntity> catgsRating;


    public String getQjCode() {
        return qjCode;
    }

    public void setQjCode(String qjCode) {
        this.qjCode = qjCode;
    }

    public String getAudioLength() {
        return audioLength;
    }

    public void setAudioLength(String audioLength) {
        this.audioLength = audioLength;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmotion() {
        return emotion;
    }

    public void setEmotion(String emotion) {
        this.emotion = emotion;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getHate() {
        return hate;
    }

    public void setHate(String hate) {
        this.hate = hate;
    }

    public String getIsLiked() {
        return isLiked;
    }

    public void setIsLiked(String isLiked) {
        this.isLiked = isLiked;
    }

    public String getIsFollowed() {
        return isFollowed;
    }

    public void setIsFollowed(String isFollowed) {
        this.isFollowed = isFollowed;
    }

    public String getIsInBlacklist() {
        return isInBlacklist;
    }

    public void setIsInBlacklist(String isInBlacklist) {
        this.isInBlacklist = isInBlacklist;
    }

    public String getGroupCnt() {
        return groupCnt;
    }

    public void setGroupCnt(String groupCnt) {
        this.groupCnt = groupCnt;
    }

    public String getCmtCnt() {
        return cmtCnt;
    }

    public void setCmtCnt(String cmtCnt) {
        this.cmtCnt = cmtCnt;
    }

    public String getIsAnchor() {
        return isAnchor;
    }

    public void setIsAnchor(String isAnchor) {
        this.isAnchor = isAnchor;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getLastLoginLatitude() {
        return lastLoginLatitude;
    }

    public void setLastLoginLatitude(String lastLoginLatitude) {
        this.lastLoginLatitude = lastLoginLatitude;
    }

    public String getLastLoginLongitude() {
        return lastLoginLongitude;
    }

    public void setLastLoginLongitude(String lastLoginLongitude) {
        this.lastLoginLongitude = lastLoginLongitude;
    }

    public int getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(int lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getIsConsultant() {
        return isConsultant;
    }

    public void setIsConsultant(String isConsultant) {
        this.isConsultant = isConsultant;
    }

    public String getHonor() {
        return honor;
    }

    public void setHonor(String honor) {
        this.honor = honor;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getQualificationPhotos() {
        return qualificationPhotos;
    }

    public void setQualificationPhotos(String qualificationPhotos) {
        this.qualificationPhotos = qualificationPhotos;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public int getReserveFee() {
        return reserveFee;
    }

    public void setReserveFee(int reserveFee) {
        this.reserveFee = reserveFee;
    }

    public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getIsNamePending() {
        return isNamePending;
    }

    public void setIsNamePending(String isNamePending) {
        this.isNamePending = isNamePending;
    }

    public String getIsQuaPending() {
        return isQuaPending;
    }

    public void setIsQuaPending(String isQuaPending) {
        this.isQuaPending = isQuaPending;
    }

    public String getNameDraft() {
        return nameDraft;
    }

    public void setNameDraft(String nameDraft) {
        this.nameDraft = nameDraft;
    }

    public String getQuaDraft() {
        return quaDraft;
    }

    public void setQuaDraft(String quaDraft) {
        this.quaDraft = quaDraft;
    }

    public String getQuaPhotosDraft() {
        return quaPhotosDraft;
    }

    public void setQuaPhotosDraft(String quaPhotosDraft) {
        this.quaPhotosDraft = quaPhotosDraft;
    }

    public String getVideoProfile() {
        return videoProfile;
    }

    public void setVideoProfile(String videoProfile) {
        this.videoProfile = videoProfile;
    }

    public String getWebcallPrice() {
        return webcallPrice;
    }

    public void setWebcallPrice(String webcallPrice) {
        this.webcallPrice = webcallPrice;
    }

    public String getCanShare() {
        return canShare;
    }

    public void setCanShare(String canShare) {
        this.canShare = canShare;
    }

    public String getShareTitle() {
        return shareTitle;
    }

    public void setShareTitle(String shareTitle) {
        this.shareTitle = shareTitle;
    }

    public String getShareContent() {
        return shareContent;
    }

    public void setShareContent(String shareContent) {
        this.shareContent = shareContent;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public TopCommentEntity getTopComment() {
        return topComment;
    }

    public void setTopComment(TopCommentEntity topComment) {
        this.topComment = topComment;
    }

    public String getTimelyPercent() {
        return timelyPercent;
    }

    public void setTimelyPercent(String timelyPercent) {
        this.timelyPercent = timelyPercent;
    }

    public String getGiftNum() {
        return giftNum;
    }

    public void setGiftNum(String giftNum) {
        this.giftNum = giftNum;
    }

    public List<CatgsRatingEntity> getCatgsRating() {
        return catgsRating;
    }

    public void setCatgsRating(List<CatgsRatingEntity> catgsRating) {
        this.catgsRating = catgsRating;
    }

}
