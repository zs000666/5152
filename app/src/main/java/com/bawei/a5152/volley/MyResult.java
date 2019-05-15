package com.bawei.a5152.volley;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/*
 *@Auther:甄帅
 *@Date: 时间
 *@Description:功能
 * */public class MyResult extends Application {


    private static RequestQueue queue;

    @Override
    public void onCreate() {
        super.onCreate();
        queue = Volley.newRequestQueue(getApplicationContext());
    }

    public static RequestQueue requestQueue(){
        return queue;
    }
}
