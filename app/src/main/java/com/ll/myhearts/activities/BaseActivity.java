package com.ll.myhearts.activities;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.inputmethod.InputMethodManager;

import com.ll.myhearts.MyApplication;
import com.ll.myhearts.model.BaseModel;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.App;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.SystemService;
import org.androidannotations.annotations.res.StringRes;

@EActivity
public abstract class BaseActivity extends AppCompatActivity {

    @SystemService
    InputMethodManager inputMethodManager;

    @SystemService
    LayoutInflater layoutInflater;

    @StringRes
    String no_net;

    @App
    MyApplication app;

    Paint paint = new Paint();

    @AfterViews
    void baseAfterView() {
        
    }

    public void notifyUI(BaseModel bm) {


    }

}
