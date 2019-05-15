package com.bawei.a5152.mvp;

import com.bawei.a5152.volley.HttpUtils;

/*
 *@Auther:甄帅
 *@Date: 时间
 *@Description:功能
 * */public class MainModel implements IMainController.MainModel {
     private HttpUtils utils;
    public MainModel() {
        utils=HttpUtils.httpUtils;
    }

    @Override
    public void https(String url, HttpUtils.CallBack back) {
           utils.doHttpGet(url,back);
    }
}
