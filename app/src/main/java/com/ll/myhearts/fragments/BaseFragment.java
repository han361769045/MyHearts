package com.ll.myhearts.fragments;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;

import com.ll.myhearts.MyApplication;
import com.ll.myhearts.listener.OttoBus;

import org.androidannotations.annotations.App;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.SystemService;
import org.androidannotations.annotations.res.StringRes;

@EFragment
public abstract class BaseFragment extends Fragment {

    @SystemService
    LayoutInflater layoutInflater;

    @StringRes
    String no_net;

    @App
    MyApplication app;

    @Bean
    OttoBus bus;

    @Override
    public void onPause() {
        super.onPause();
        if (isVisible()) {
            onHiddenChanged(isVisible());
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if (isVisible()) {
            onHiddenChanged(isHidden());
        }
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (hidden) {
            bus.unregister(this);
        } else {
            bus.register(this);
        }
    }
}
