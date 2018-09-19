package com.ysk.xunfei.model;

public class Msg {//聊天消息，此处与json无关
    private String message;
    private boolean isComing;

    public Msg(String message, boolean isComing){
        this.message = message;
        this.isComing = isComing;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean getIsComing() {
        return isComing;
    }

    public void setIsComing(boolean isComing) {
        this.isComing = isComing;
    }
}
