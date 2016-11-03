package com.ll.myhearts.rest;

import android.content.Context;
import android.util.Log;

import com.ll.myhearts.BuildConfig;
import com.ll.myhearts.tools.AndroidTool;

import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;
import org.androidannotations.annotations.UiThread;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;


@EBean
public class MyInterceptor implements ClientHttpRequestInterceptor {

    @RootContext
    Context context;

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] data,
                                        ClientHttpRequestExecution execution) throws IOException {
        if (BuildConfig.DEBUG) {
            String str = new String(data);
            Log.e(context.getClass().getName(), request.getURI().toString());
            Log.e(context.getClass().getName(), str);
        }
        if (!request.getHeaders().containsKey("isLoading") || Boolean.parseBoolean(request.getHeaders().get("isLoading").get(0))) {
            showLoading();
        }
        return execution.execute(request, data);
    }

    @UiThread
    void showLoading() {
        AndroidTool.showLoadDialog(context);
    }
}
