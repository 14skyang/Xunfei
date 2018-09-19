package com.ysk.xunfei.model;


//接收图灵机器人V1版返回的json数据bean
public class Resp {
    private int code;
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
