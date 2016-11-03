package com.ll.myhearts.adapters;

import android.view.View;
import android.view.ViewGroup;

import com.ll.myhearts.items.HotEncyItemView_;
import com.ll.myhearts.model.HotEncy;

import org.androidannotations.annotations.EBean;

/**
 * Created by LeoLu on 2016/11/3.
 */
@EBean
public class HotEncyAdapter extends BaseRecyclerViewAdapter<HotEncy> {


    @Override
    public void getMoreData(Object... objects) {
        afterGetMoreData(myRestClient.loadHotEncy("0"));
    }

    @Override
    protected View onCreateItemView(ViewGroup parent, int viewType) {
        return HotEncyItemView_.build(context);
    }
}
