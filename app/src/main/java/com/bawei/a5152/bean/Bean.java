package com.bawei.a5152.bean;

/*
 *@Auther:甄帅
 *@Date: 时间
 *@Description:功能
 * */public class Bean {
     private String desc;
     private String url;

    public Bean(String desc, String url) {
        this.desc = desc;
        this.url = url;
    }

    public Bean() {
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "desc='" + desc + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
