package com.ll.myhearts.fragments;

import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.View;

import com.leo.lu.mytitlebar.MyTitleBar;
import com.ll.myhearts.R;
import com.ll.myhearts.activities.MainActivity;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

/**
 * Created by LeoLu on 2016/11/2.
 */
@EFragment(R.layout.fragment_home)
public class HomeFragment extends BaseFragment {

    @ViewById
    MyTitleBar myTitleBar;


    public DrawerLayout drawer_layout;

    @AfterViews
    void afterView() {
        drawer_layout = ((MainActivity) getActivity()).drawer_layout;
        myTitleBar.setLogoOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer_layout.openDrawer(GravityCompat.START);
            }
        });
    }


}
