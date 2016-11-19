package com.ll.myhearts.fragments;

import android.widget.Button;

import com.bigkoo.pickerview.TimePickerView;
import com.ll.myhearts.R;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import java.util.Date;

/**
 * Created by LeoLu on 2016/11/2.
 */
@EFragment(R.layout.fragment_expert)
public class ExpertFragment extends BaseFragment {

    @ViewById
    Button btnCancel;

    TimePickerView pvTime;


    @AfterViews
    void afterView() {
        pvTime = new TimePickerView(getActivity(), TimePickerView.Type.YEAR_MONTH_DAY);
        pvTime.setTime(new Date());
        pvTime.setCyclic(false);
        pvTime.setCancelable(true);
        //时间选择后回调
        pvTime.setOnTimeSelectListener(new TimePickerView.OnTimeSelectListener() {

            @Override
            public void onTimeSelect(Date date) {
            }
        });
        //弹出时间选择器
    }

    @Click
    void btnCancel() {
        pvTime.show();
    }
}
