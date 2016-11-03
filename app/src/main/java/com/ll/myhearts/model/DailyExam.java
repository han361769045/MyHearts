package com.ll.myhearts.model;

/**
 * Created by LeoLu on 2016/11/3.
 */

public class DailyExam {

    /**
     * id : 516
     * title : 英国心理学家的一个很火的图片心理测试
     * instro : 最近，英国心理学家的一幅图片心理测试在俄罗斯社交网站火了起来。
     * image : http://image.xinliji.me/o_1avvi0gi51ioojtqlec1esn1v3rn.jpg
     */

    private String id;
    private String title;
    private String instro;
    private String image;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInstro() {
        return instro;
    }

    public void setInstro(String instro) {
        this.instro = instro;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
