package com.bawei.a5152.mvp;

import com.bawei.a5152.volley.HttpUtils;

/*
 *@Auther:甄帅
 *@Date: 时间
 *@Description:功能
 * */public class MainPresenter implements IMainController.MainPresenter {
     private IMainController.MainModel model;
     private IMainController.MainView view;
    @Override
    public void attch(IMainController.MainView view) {
       this.view=view;
       model=new MainModel();
    }

    @Override
    public void pttch() {
       if (view!=null){
           view=null;
       }
       if (model!=null){
           model=null;
       }
    }

    @Override
    public void questshow(String stt) {
        model.https(stt, new HttpUtils.CallBack() {
            @Override
            public void onSuccess(String result) {
                view.showlist(result);
            }

            @Override
            public void onFail(String msg) {

            }
        });
    }
}
