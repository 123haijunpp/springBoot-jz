package com.qiuzq.jz.weixin;

import org.springframework.stereotype.Component;
import org.weixin4j.Weixin;
import org.weixin4j.WeixinConfig;
import org.weixin4j.WeixinPayConfig;
import org.weixin4j.loader.ITicketLoader;
import org.weixin4j.loader.ITokenLoader;

import javax.annotation.Resource;


@Component(value = "weixin")
public class MyWeixin extends Weixin {

    public MyWeixin() {
        super();
    }

    public MyWeixin(String appId, String secret) {
        super(appId, secret);
    }

    public MyWeixin(WeixinConfig weixinConfig) {
        super(weixinConfig);
    }

    public MyWeixin(WeixinPayConfig weixinPayConfig) {
        super(weixinPayConfig);
    }

    public MyWeixin(WeixinConfig weixinConfig, WeixinPayConfig weixinPayConfig) {
        super(weixinConfig, weixinPayConfig);
    }

    @Resource(name = "redisTokenLoader")
    public void setTokenLoader(ITokenLoader tokenLoader) {
        this.tokenLoader = tokenLoader;
    }

    //@Resource(name = "redisTicketLoader")
    //public void setTicketLoader(ITicketLoader ticketLoader) {
    //    this.ticketLoader = ticketLoader;
    //}
}
