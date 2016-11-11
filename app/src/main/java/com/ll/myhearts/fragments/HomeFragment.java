package com.ll.myhearts.fragments;

import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.leo.lu.bannerauto.BannerLayout;
import com.leo.lu.bannerauto.bannertypes.BaseBannerView;
import com.leo.lu.bannerauto.bannertypes.DefaultBannerView;
import com.leo.lu.bannerauto.bannertypes.TextBannerView;
import com.ll.myhearts.R;
import com.ll.myhearts.activities.MainActivity;
import com.ll.myhearts.adapters.HotEncyAdapter;
import com.ll.myhearts.model.ActionLabels;
import com.ll.myhearts.model.BannerModel;
import com.ll.myhearts.model.BaseModelJson;
import com.ll.myhearts.model.HotEncy;
import com.ll.myhearts.model.PsychologyTeacher;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.ViewsById;

import java.util.List;

/**
 * Created by LeoLu on 2016/11/2.
 */
@EFragment(R.layout.fragment_home)
public class HomeFragment extends BaseRecyclerViewFragment<HotEncy> implements BaseBannerView.OnBannerClickListener {

    @ViewById
    BannerLayout banner_image, news_image;

    @ViewById
    LinearLayout ll_call, ll_reserve, ll_free, ll_exam;

    @ViewsById({R.id.img_one, R.id.img_two, R.id.img_three, R.id.img_four})
    List<ImageView> imgList;

    @ViewsById({R.id.txt_one_name, R.id.txt_two_name, R.id.txt_three_name, R.id.txt_four_name})
    List<TextView> names;

    @ViewsById({R.id.txt_one_qualification, R.id.txt_two_qualification, R.id.txt_three_qualification, R.id.txt_four_qualification})
    List<TextView> qualifications;

    DrawerLayout drawer_layout;

    @Bean
    void setAdapter(HotEncyAdapter myAdapter) {
        this.myAdapter = myAdapter;
    }


    @AfterViews
    void afterView() {
        drawer_layout = ((MainActivity) getActivity()).drawer_layout;
        myTitleBar.setLogoOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer_layout.openDrawer(GravityCompat.START);
            }
        });
        myAdapter.getMoreData();
        getBanner();
        loadActionLabels();
        fff();
    }

    @Background
    void fff() {
        afterF(myRestClient.fff());
    }

    @UiThread
    void afterF(String fff) {
        String a = fff;
    }

    @Background
    void loadActionLabels() {
        afterLoadActionLabels(myRestClient.loadActionLabels());
    }

    @UiThread
    void afterLoadActionLabels(BaseModelJson<List<ActionLabels>> result) {
        if (result != null && result.getErrorCode() == 0) {
            showActionLabels(result.getResults());
        }
    }

    private void showActionLabels(List<ActionLabels> list) {
        if (list != null) {
            news_image.setDuration(2000);
            for (ActionLabels actionLabels : list) {
                TextBannerView textBannerView = new TextBannerView(getActivity());
                textBannerView.description(actionLabels.getLabel());
                news_image.addBanner(textBannerView);
            }
        }
    }

    @Background
    void getBanner() {
        afterGetBanner(myRestClient.loadBanner_v2("consultant"));
    }

    @UiThread
    void afterGetBanner(BaseModelJson<List<BannerModel>> result) {
        if (result != null && result.getErrorCode() == 0) {
            showBanner(result.getResults());
        }
    }

    private void showBanner(List<BannerModel> list) {
        if (list != null) {
            for (BannerModel bannerModel : list) {
                DefaultBannerView defaultBannerView = new DefaultBannerView(getActivity());
                Bundle bundle = new Bundle();
                bundle.putParcelable("bannerModel", bannerModel);
                defaultBannerView.image(bannerModel.getPic())
                        .bundle(bundle)
                        .setOnBannerClickListener(this);
                banner_image.addBanner(defaultBannerView);
            }
        }
    }

    @Override
    public void onBannerClick(BaseBannerView banner) {

    }

    @Background
    void loadRecommendedConsultants() {
        afterLoadRecommendedConsultants(myRestClient.loadRecommendedConsultants("0"));
    }

    @UiThread
    void afterLoadRecommendedConsultants(BaseModelJson<List<PsychologyTeacher>> result) {
        if (result != null && result.getErrorCode() == 0) {
        }
    }
}
