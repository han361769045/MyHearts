package com.ll.myhearts.fragments;

import android.widget.Button;

import com.ll.myhearts.R;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

/**
 * Created by LeoLu on 2016/11/2.
 */
@EFragment(value = R.layout.fragment_expert, forceLayoutInjection = true)
public class ExpertFragment extends BaseFragment {

    @ViewById
    Button btnCancel;


    @AfterViews
    void afterView() {

    }

    @Click
    void btnCancel() {
    }
}
