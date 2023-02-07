package com.example.CrudDemo.model;

public class User {
    private int userId;
    private String name;
    private String userName;
    private String adderss;
    private int phoneNum;
    public User(){};

    public User(int userId, String name, String userName, String adderss, int phoneNum) {
        this.userId = userId;
        this.name = name;
        this.userName = userName;
        this.adderss = adderss;
        this.phoneNum = phoneNum;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAdderss() {
        return adderss;
    }

    public void setAdderss(String adderss) {
        this.adderss = adderss;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }
}
