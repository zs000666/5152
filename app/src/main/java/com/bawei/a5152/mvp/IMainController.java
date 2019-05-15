package com.bawei.a5152.mvp;

import com.bawei.a5152.volley.HttpUtils;

/*
 *@Auther:甄帅
 *@Date: 时间
 *@Description:功能
 * */public interface IMainController {
     public interface MainModel{
         void https(String url, HttpUtils.CallBack back);
     }
     public interface MainView{
         void showlist(String str);
     }
     public interface MainPresenter{
         void attch(MainView view);
         void pttch();
         void questshow(String stt);
     }
 }
