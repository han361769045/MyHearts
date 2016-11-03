package com.ll.myhearts.rest;

import com.ll.myhearts.BuildConfig;
import com.ll.myhearts.model.BannerModel;
import com.ll.myhearts.model.BaseModel;
import com.ll.myhearts.model.BaseModelJson;
import com.ll.myhearts.model.DailyExam;
import com.ll.myhearts.model.InitModel;
import com.ll.myhearts.model.LoadingImageModel;
import com.ll.myhearts.model.PsychologyTeacher;
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
    BaseModelJson<LoadingImageModel> loadingImage();

    /**
     * @param map registerId  token
     * @return
     */
    @Post("user/verifytoken_v2")
    BaseModelJson<UserModel> verifytoken_v2(@Body Map map);

    @Get("loadRecommendedConsultants?userid={userid}")
    BaseModelJson<List<PsychologyTeacher>> loadRecommendedConsultants(@Path String userid);

    @Get("com/loadNotification")
    BaseModel loadNotification();

    @Get("com/loadBanner_v2?type=consultant")
    BaseModelJson<List<BannerModel>> loadBanner_v2();

    @Get("psychology/dailyExam?userid={userid}")
    BaseModelJson<DailyExam> dailyExam(@Path String userid);

}

