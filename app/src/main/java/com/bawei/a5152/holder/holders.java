package com.bawei.a5152.holder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bawei.a5152.R;

/*
 *@Auther:甄帅
 *@Date: 时间
 *@Description:功能
 * */public class holders extends RecyclerView.ViewHolder {

    public final ImageView img;
    public final TextView tv;

    public holders(@NonNull View itemView) {
        super(itemView);
        img = itemView.findViewById(R.id.img);
        tv = itemView.findViewById(R.id.tv);
    }
}
