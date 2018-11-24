package com.qiuzq.jz.model;

import java.util.Date;

public class Token {
    private Long id;

    private String accessToken;

    private Integer expiresIn;

    private Date createTime;

    public Token(Long id, String accessToken, Integer expiresIn, Date createTime) {
        this.id = id;
        this.accessToken = accessToken;
        this.expiresIn = expiresIn;
        this.createTime = createTime;
    }

    public Token() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Integer getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}