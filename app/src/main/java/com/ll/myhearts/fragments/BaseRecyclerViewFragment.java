package com.ll.myhearts.fragments;

import android.graphics.Paint;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.leo.lu.mytitlebar.MyTitleBar;
import com.ll.myhearts.adapters.BaseRecyclerViewAdapter;
import com.ll.myhearts.rest.MyErrorHandler;
import com.ll.myhearts.rest.MyRestClient;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.rest.spring.annotations.RestService;

/**
 * Created by LeoLu on 2016/11/3.
 */
@EFragment
public class BaseRecyclerViewFragment<T> extends BaseFragment {

    @ViewById
    MyTitleBar myTitleBar;

    @ViewById
    RecyclerView recyclerView;

    @Bean
    MyErrorHandler myErrorHandler;

    @RestService
    MyRestClient myRestClient;

    RecyclerView.ItemDecoration itemDecoration;

    BaseRecyclerViewAdapter<T> myAdapter;

    LinearLayoutManager linearLayoutManager;

    GridLayoutManager gridLayoutManager;

    Paint paint = new Paint();

    int gridCount = 3;

    @AfterInject
    void afterRecyclerInject() {
        myRestClient.setRestErrorHandler(myErrorHandler);
    }

    @AfterViews
    void afterRecyclerView() {
        gridLayoutManager = new GridLayoutManager(getActivity(), gridCount);
        linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setHasFixedSize(true);
        verticalItem();
    }

    //线性布局
    void verticalItem() {
        recyclerView.setAdapter(null);
        myAdapter.verticalAndHorizontal = BaseRecyclerViewAdapter.VerticalAndHorizontal.Vertical;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(myAdapter);
    }

    //网格布局
    void horizontalItem() {
        recyclerView.setAdapter(null);
        myAdapter.verticalAndHorizontal = BaseRecyclerViewAdapter.VerticalAndHorizontal.Horizontal;
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(myAdapter);
    }

}
