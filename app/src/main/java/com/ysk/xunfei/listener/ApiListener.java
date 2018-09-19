package com.ysk.xunfei.listener;

public interface ApiListener {//图灵用的监听器
    public void onSuccess(String response);
    public void onFail();
}
