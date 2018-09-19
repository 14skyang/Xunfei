package com.ysk.xunfei;

import android.app.Application;

import com.iflytek.cloud.SpeechUtility;
//讯飞api接入
public class MyApplication extends Application{
    String appid="5b9e0175";

    @Override
    public void onCreate() {//一定要在androidManifest里注册android:name=".MyApplication"
        SpeechUtility.createUtility(MyApplication.this,"appid="+appid);
        super.onCreate();
    }
}
