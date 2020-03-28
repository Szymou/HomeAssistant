package com.java.szymou.bean;

public class UserInfo {
    private Integer id;

    private String uName;

    private String uSex;

    private String uEmail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public UserInfo(String uName, String uSex, String uEmail) {
        this.uName = uName;
        this.uSex = uSex;
        this.uEmail = uEmail;
    }
}