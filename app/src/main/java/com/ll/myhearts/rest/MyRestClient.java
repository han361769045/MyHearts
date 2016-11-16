package com.ll.myhearts.rest;

import com.ll.myhearts.BuildConfig;
import com.ll.myhearts.model.ActionLabels;
import com.ll.myhearts.model.BannerModel;
import com.ll.myhearts.model.BaseModel;
import com.ll.myhearts.model.BaseModelJson;
import com.ll.myhearts.model.Comments;
import com.ll.myhearts.model.DailyExam;
import com.ll.myhearts.model.GiftModel;
import com.ll.myhearts.model.GroupCatgs;
import com.ll.myhearts.model.HeartEvent;
import com.ll.myhearts.model.HotEncy;
import com.ll.myhearts.model.InitModel;
import com.ll.myhearts.model.LiveModel;
import com.ll.myhearts.model.LoadingImage;
import com.ll.myhearts.model.PsychologyTeacher;
import com.ll.myhearts.model.PsychologyTeacherDetail;
import com.ll.myhearts.model.UserModel;

import org.androidannotations.rest.spring.annotations.Body;
import org.androidannotations.rest.spring.annotations.Get;
import org.androidannotations.rest.spring.annotations.Path;
import org.androidannotations.rest.spring.annotations.Post;
import org.androidannotations.rest.spring.annotations.Rest;
import org.androidannotations.rest.spring.api.RestClientErrorHandling;
import org.androidannotations.rest.spring.api.RestClientHeaders;
import org.androidannotations.rest.spring.api.RestClientRootUrl;
import org.androidannotations.rest.spring.api.RestClientSupport;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.ResourceHttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;

import java.util.List;
import java.util.Map;


@Rest(rootUrl = BuildConfig.ROOT_URL, requestFactory = MyOkHttpClientHttpRequestFactory.class, interceptors = {MyInterceptor.class},
        converters = {StringHttpMessageConverter.class, MyGsonHttpMessageConverter.class, FormHttpMessageConverter.class, ByteArrayHttpMessageConverter.class, ResourceHttpMessageConverter.class},
        responseErrorHandler = MyResponseErrorHandlerBean.class)
public interface MyRestClient extends RestClientRootUrl, RestClientSupport, RestClientHeaders, RestClientErrorHandling {

    /**
     * @return
     */
    @Get("com/init")
    BaseModelJson<InitModel> init();

    @Get("com/loadingimage")
    BaseModelJson<LoadingImage> loadingImage();

    /**
     * @param map registerId  token
     * @return
     */
    @Post("user/verifytoken_v2")
    BaseModelJson<UserModel> verifytoken_v2(@Body Map map);


    /**
     * 查询首页推荐咨询师
     *
     * @param userid 0
     * @return
     */
    @Get("consultant/loadRecommendedConsultants?userid={userid}")
    BaseModelJson<List<PsychologyTeacher>> loadRecommendedConsultants(@Path String userid);

    @Get("com/loadNotification")
    BaseModel loadNotification();

    /**
     * 查询 首页广告位
     *
     * @param type consultant(首页)
     *             consultant_list（咨询页面）
     *             live（直播）
     * @return
     */
    @Get("com/loadBanner_v2?type={type}")
    BaseModelJson<List<BannerModel>> loadBanner_v2(@Path String type);

    /**
     * 查询首页 每日一测
     *
     * @param userid 0
     * @return
     */
    @Get("psychology/dailyExam?userid={userid}")
    BaseModelJson<DailyExam> dailyExam(@Path String userid);

    /**
     * 查询首页 精选阅读
     *
     * @param userid 0
     * @return
     */
    @Get("psychology/loadHotEncy?userid={userid}")
    BaseModelJson<List<HotEncy>> loadHotEncy(@Path String userid);

    /**
     * 精选阅读 详情
     *
     * @param id     178
     * @param userId 0
     * @return
     */
    @Get("psychology/encydetail?id={id}&userid={userId}")
    BaseModelJson<HotEncy> encyDetail(@Path int id, @Path String userId);


    /**
     * +
     * 查询首页 小广告
     *
     * @return
     */
    @Get("com/loadActionLabels")
    BaseModelJson<List<ActionLabels>> loadActionLabels();

    /**
     * 查询咨询页面
     *
     * @param orderBy all-A
     * @param page    1
     * @return
     */
    @Get("consultant/loadWebcallConsultants?orderBy={orderBy}&page={page}")
    BaseModelJson<List<PsychologyTeacher>> loadConsultantTabList(@Path String orderBy, @Path int page);

    /**
     * 群组 页面
     *
     * @return
     */
    @Get("social/loadGroupCatgs")
    BaseModelJson<List<GroupCatgs>> loadGroupCatgs();

    /**
     * @param labelId 0
     * @param type    1：最新  2：热门
     * @param page    1 页数
     * @param userId  0
     * @return
     */
    @Get("social/nearuserevents_v3?labelid={labelId}&type={type}&page={page}&userid={userId}")
    BaseModelJson<List<HeartEvent>> nearuserevents_v3(@Path int labelId, @Path int type, @Path int page, @Path String userId);

    /**
     * live页面 直播
     *
     * @param page   1
     * @param userId 0
     * @return
     */
    @Get("multimedia/loadLiveList_v3?page={page}&userid={userId}")
    BaseModelJson<List<LiveModel>> loadLiveList_v3(@Path int page, @Path String userId);

    /**
     * live页面 关注
     *
     * @param page   1
     * @param userId 0
     * @return
     */
    @Get("multimedia/loadLiveList_v3?page={page}&userid={userId}")
    BaseModelJson<List<LiveModel>> loadFollowedList(@Path int page, @Path String userId);

    /**
     * @param cuserid 当前用户的id
     * @param userid  查询用户的id
     * @return
     */
    @Get("consultant/consultantProfile?cuserid={cuserid}&userid={userid}")
    BaseModelJson<PsychologyTeacherDetail> consultantProfile(@Path String cuserid, @Path String userid);

    /**
     * 咨询师 详细页面 的gift数据
     *
     * @param userid
     * @return
     */
    @Get("consultant/profileTopGifts?userid={userid}")
    BaseModelJson<List<GiftModel>> profileTopGifts(@Path String userid);

    /**
     * 咨询师 详细页面 评论
     *
     * @param userid
     * @return
     */
    @Get("consultant/profileTopComments?userid={userid}")
    BaseModelJson<List<Comments>> profileTopComments(@Path String userid);

}

