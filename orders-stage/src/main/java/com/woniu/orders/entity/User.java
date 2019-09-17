package com.woniu.orders.entity;

import lombok.Data;

import java.util.Date;


public class User {
    /**
    * 用户id
    */
    private Integer id;

    /**
    * 用户名
    */
    private String username;

    /**
    * 用户密码
    */
    private String password;

    /**
    * 电话号码
    */
    private String phone;

    /**
    * 生日
    */
    private Date birth;

    /**
    * 用户状态1：激活 0：受限
    */
    private Byte state;

    /**
    * 用户的头像图片
    */
    private String upic;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public String getUpic() {
        return upic;
    }

    public void setUpic(String upic) {
        this.upic = upic;
    }

}