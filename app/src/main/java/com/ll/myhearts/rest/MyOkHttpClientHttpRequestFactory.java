package com.ll.myhearts.rest;

import android.content.Context;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;

import java.lang.reflect.Field;

import okhttp3.OkHttpClient;


@EBean(scope = EBean.Scope.Singleton)
public class MyOkHttpClientHttpRequestFactory extends OkHttp3ClientHttpRequestFactory {

    @RootContext
    Context context;

    MyOkHttpClientHttpRequestFactory() {

    }

    @AfterInject
    void afterInject() {
        try {
            Field client = OkHttp3ClientHttpRequestFactory.class.getDeclaredField("client");
            client.setAccessible(true);
            OkHttpClient okHttpClient = new OkHttpClient().newBuilder().sslSocketFactory(MySSLSocketFactory.getSocketFactory(context)).build();
            client.set(this, okHttpClient);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.setConnectTimeout(30 * 1000);
        this.setReadTimeout(30 * 1000);
        this.setWriteTimeout(30 * 1000);
    }

}
