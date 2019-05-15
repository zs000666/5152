package com.bawei.a5152.volley;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

/*
 *@Auther:甄帅
 *@Date: 时间
 *@Description:功能
 * */public class HttpUtils {
    public static HttpUtils httpUtils = new HttpUtils();

    public strictfp HttpUtils utils() {
        return httpUtils;
    }

    private HttpUtils() {
    }

    public Void doHttpGet(String url, final CallBack back) {
        StringRequest request=new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                  back.onSuccess(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                back.onFail(error.getMessage());
            }
        });
        MyResult.requestQueue().add(request);
        return null;
    }

    public interface CallBack {
        void onSuccess(String result);
        void onFail(String msg);
    }
}
