package com.ll.myhearts.model;


import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by LeoLu on 2016/11/3.
 */
public class BannerModel implements Parcelable {

    /**
     * id : 91
     * icon : http://image.xinliji.me/o_1avql13fjca14io1shr19g9lnfi.png
     * pic : http://image.xinliji.me/o_1avql17q81oj71pqu18oq1dq01c6cn.png
     * title : 手把手教你绘画“读心术”
     * subtitle : 11月10日~12月29日
     * type : webview
     * url : http://mp.weixin.qq.com/s?__biz=MzIzMTI2Mzc1Mg==&mid=2649795500&idx=1&sn=21c061340c83b65e6dd83cb47185ad2b&chksm=f0a2d0cbc7d559ddade10241bd4f677983479bc7e78b704fcca207d300750c7e26ac8364a4df&mpshare=1&scene=1&srcid=1022lJercAohHL6kTjxiRsgC#wechat_redirect&token=
     * target :
     * className :
     */

    private String id;
    private String icon;
    private String pic;
    private String title;
    private String subtitle;
    private String type;
    private String url;
    private String target;
    private String className;

    public BannerModel() {
    }

    public BannerModel(String id, String icon, String pic, String title, String subtitle, String type, String url, String target, String className) {
        this.id = id;
        this.icon = icon;
        this.pic = pic;
        this.title = title;
        this.subtitle = subtitle;
        this.type = type;
        this.url = url;
        this.target = target;
        this.className = className;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.icon);
        dest.writeString(this.pic);
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        dest.writeString(this.type);
        dest.writeString(this.url);
        dest.writeString(this.target);
        dest.writeString(this.className);
    }

    protected BannerModel(Parcel in) {
        this.id = in.readString();
        this.icon = in.readString();
        this.pic = in.readString();
        this.title = in.readString();
        this.subtitle = in.readString();
        this.type = in.readString();
        this.url = in.readString();
        this.target = in.readString();
        this.className = in.readString();
    }

    public static final Creator<BannerModel> CREATOR = new Creator<BannerModel>() {
        @Override
        public BannerModel createFromParcel(Parcel source) {
            return new BannerModel(source);
        }

        @Override
        public BannerModel[] newArray(int size) {
            return new BannerModel[size];
        }
    };
}
