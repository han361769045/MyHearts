package com.ll.myhearts.items;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ll.myhearts.R;
import com.ll.myhearts.model.HotEncy;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

/**
 * Created by LeoLu on 2016/11/3.
 */
@EViewGroup(R.layout.item_hot_ency)
public class HotEncyItemView extends ItemView<HotEncy> {

    @ViewById
    TextView txt_title;

    @ViewById
    ImageView img_icon;

    public HotEncyItemView(Context context) {
        super(context);
    }

    @Override
    protected void init(Object... objects) {
        txt_title.setText(_data.getTitle());
        Glide.with(context)
                .load(_data.getIcon())
                .centerCrop()
                .into(img_icon);
    }
}
