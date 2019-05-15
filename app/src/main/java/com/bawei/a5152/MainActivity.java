package com.bawei.a5152;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.bawei.a5152.adapter.MyAdapter;
import com.bawei.a5152.bean.Bean;
import com.bawei.a5152.mvp.IMainController;
import com.bawei.a5152.mvp.MainPresenter;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements IMainController.MainView {
    private String url="http://gank.io/api/data/%E7%A6%8F%E5%88%A9/66/1";
    private IMainController.MainPresenter presenter;
    private IMainController.MainModel model;
    private RecyclerView rlv;
    private ArrayList<Bean> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rlv = findViewById(R.id.rlv);
        //布局管理器
        rlv.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        //绑定
        presenter=new MainPresenter();
        presenter.attch(this);
        presenter.questshow(url);
    }

    @Override
    public void showlist(String str) {
        try {
            JSONObject object=new JSONObject(str);
            JSONArray results = object.getJSONArray("results");
            list = new ArrayList<>();
            for (int i = 0; i <results.length() ; i++) {
                 JSONObject obj= (JSONObject) results.get(i);
                String desc = obj.getString("desc");
                String url = obj.getString("url");
                list.add(new Bean(desc,url));
            }
            MyAdapter adapter=new MyAdapter(list,MainActivity.this);
            rlv.setAdapter(adapter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.pttch();
    }
}
