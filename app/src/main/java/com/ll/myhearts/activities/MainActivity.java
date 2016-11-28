package com.ll.myhearts.activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import com.ll.myhearts.R;
import com.ll.myhearts.customview.FragmentTabHost;
import com.ll.myhearts.fragments.ExpertFragment_;
import com.ll.myhearts.fragments.GroupFramgment_;
import com.ll.myhearts.fragments.HeartFragment_;
import com.ll.myhearts.fragments.HomeFragment_;
import com.ll.myhearts.tools.AndroidTool;
import com.nineoldandroids.view.ViewHelper;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.WindowFeature;
import org.androidannotations.annotations.res.StringArrayRes;

@WindowFeature({WindowManager.LayoutParams.FLAG_SECURE})
@EActivity(R.layout.activity_main)
public class MainActivity extends BaseActivity {

    @ViewById
    FragmentTabHost tabHost;

    @StringArrayRes
    String[] tabTag, tabTitle;

    @ViewById
    public DrawerLayout drawer_layout;

    @ViewById
    NavigationView nv_menu;

    //导航
    Class[] classTab = {HomeFragment_.class, ExpertFragment_.class, GroupFramgment_.class, HeartFragment_.class};

    int[] ids = {R.drawable.tab_home, R.drawable.tab_expert, R.drawable.tab_group, R.drawable.tab_heart};

    long firstTime = 0;

    @AfterViews
    void afterView() {
        initTab();
        drawer_layout.setScrimColor(0x00000000);
        drawer_layout.addDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                View mContent = drawer_layout.getChildAt(0);//返回抽屉布局中的索引为0的子view
                float scale = 1 - slideOffset;//偏移量导致scale从1.0-0.0
                float rightScale = 0.8f + scale * 0.2f;//将内容区域从1.0-0.0转化为1.0-0.8
                float leftScale = 1 - 0.3f * scale; //0.7-1.0
                ViewHelper.setScaleX(drawerView, leftScale);
                ViewHelper.setScaleY(drawerView, leftScale);
                ViewHelper.setAlpha(drawerView, 0.6f + 0.4f * (1 - scale));//开始这里设置成了这样，导致背景透明度有1.0-0.6
                ViewHelper.setTranslationX(mContent,
                        drawerView.getMeasuredWidth() * (1 - scale));
                ViewHelper.setPivotX(mContent, 0);
                ViewHelper.setPivotY(mContent,
                        mContent.getMeasuredHeight() / 2);
                mContent.invalidate();
                ViewHelper.setScaleX(mContent, rightScale);
                ViewHelper.setScaleY(mContent, rightScale);
            }

            @Override
            public void onDrawerOpened(View drawerView) {

            }

            @Override
            public void onDrawerClosed(View drawerView) {

            }

            @Override
            public void onDrawerStateChanged(int newState) {

            }
        });
        nv_menu.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                drawer_layout.closeDrawers();
                return true;
            }
        });
    }

    protected void initTab() {
        tabHost.setup(this, getSupportFragmentManager(), R.id.real_content);
        for (int i = 0; i < tabTag.length; i++) {
            Bundle bundle = new Bundle();
            TabHost.TabSpec tabSpec = tabHost.newTabSpec(tabTag[i]);
            tabSpec.setIndicator(buildIndicator(i));
            tabHost.addTab(tabSpec, classTab[i], bundle);
        }
        tabHost.setCurrentTab(0);
        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
            }
        });
    }

    protected View buildIndicator(int position) {
        View view = layoutInflater.inflate(R.layout.tab_indicator, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.icon_tab);
        TextView textView = (TextView) view.findViewById(R.id.text_indicator);
        imageView.setImageResource(ids[position]);
        textView.setText(tabTitle[position]);
        return view;
    }

    @Override
    public void onBackPressed() {
        long secondTime = System.currentTimeMillis();
        if (secondTime - firstTime > 2000) {
            AndroidTool.showToast(this, "再按一次退出程序");
            firstTime = secondTime;
        } else {
            finish();
            System.exit(-1);
        }
    }
}
