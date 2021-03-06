package com.ll.myhearts.rest;

import android.content.Context;
import android.util.Log;

import com.ll.myhearts.tools.AndroidTool;


import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;
import org.androidannotations.rest.spring.api.RestErrorHandler;
import org.springframework.core.NestedRuntimeException;


@EBean
public class MyErrorHandler implements RestErrorHandler {

    @RootContext
    Context context;

    @Override
    public void onRestClientExceptionThrown(NestedRuntimeException arg0) {
        // TODO Auto-generated method stub
        //开启 线程运行 否者报错
        AndroidTool.dismissLoadDialog();
        Log.e(context.getClass().getName(), arg0.getMessage());
    }
}
