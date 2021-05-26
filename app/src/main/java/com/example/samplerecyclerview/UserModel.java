package com.example.samplerecyclerview;

public class UserModel {
    private String nameTv;
    private String msgTv;
    private String timeTv;
    private int avatar;

    public UserModel(String nameTv, String msgTv, String timeTv, int avatar) {
        this.nameTv = nameTv;
        this.msgTv = msgTv;
        this.timeTv = timeTv;
        this.avatar = avatar;
    }

    public String getNameTv() {
        return nameTv;
    }

    public void setNameTv(String nameTv) {
        this.nameTv = nameTv;
    }

    public String getMsgTv() {
        return msgTv;
    }

    public void setMsgTv(String msgTv) {
        this.msgTv = msgTv;
    }

    public String getTimeTv() {
        return timeTv;
    }

    public void setTimeTv(String timeTv) {
        this.timeTv = timeTv;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }
}
