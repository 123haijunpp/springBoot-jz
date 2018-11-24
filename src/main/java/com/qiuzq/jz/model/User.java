package com.qiuzq.jz.model;

import java.util.Date;

public class User {
    private Long id;

    private String userName;

    private String userPwd;

    private Date createTime;

    public User(Long id, String userName, String userPwd, Date createTime) {
        this.id = id;
        this.userName = userName;
        this.userPwd = userPwd;
        this.createTime = createTime;
    }

    public User() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}