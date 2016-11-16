package com.ll.myhearts.rest;

import android.content.Context;

import com.ll.myhearts.listener.OttoBus;
import com.ll.myhearts.model.BaseModel;
import com.ll.myhearts.model.BaseModelJson;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.rest.spring.annotations.RestService;


@EBean
public class MyBackgroundTask {

    @RootContext
    Context context;

    @Bean
    OttoBus bus;

    @Bean
    MyErrorHandler myErrorHandler;

    @RestService
    MyRestClient myRestClient;

    @AfterInject
    void afterRecyclerInject() {
        myRestClient.setRestErrorHandler(myErrorHandler);
    }

    @Background
    public <T> void getBanner(BaseModelJson<T> type) {
        afterGetData(myRestClient.loadBanner_v2("consultant"), type);
    }

    @Background
    public void loadActionLabels() {
//        afterGetData(myRestClient.loadActionLabels());
    }

    @UiThread
    <T> void afterGetData(BaseModel result, BaseModelJson<T> type) {
        if (result != null) {
            bus.post(result);
        }
    }

}
