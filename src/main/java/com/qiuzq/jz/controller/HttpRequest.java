package com.qiuzq.jz.controller;

import com.qiuzq.jz.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

/**
 * program: jz
 * Date: 2018/11/25/025 17:56
 *
 * @author: Mr.Qiu
 * Description:
 */
@Controller
@RequestMapping("/http")
@Slf4j
public class HttpRequest {

    @RequestMapping("/execute")
    @ResponseBody
    public String httpExecute(User user, HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 获取请求头的属性
//        String header = request.getHeader("cache-control");
//        String acceptEncoding = request.getHeader("Accept-Encoding");
        // 获取http请求类型
        String method = request.getMethod();
        //请求资源
        String requestURI = request.getRequestURI();
        // 获取http协议版本
        String protocol = request.getProtocol();
        System.out.println("请求头：" + method + " " + requestURI + " " + protocol);
        Enumeration<String> names = request.getHeaderNames();
        while (names.hasMoreElements()) {
            String key = names.nextElement();
            String value = request.getHeader(key);
            System.out.println(key + ":" + value);
        }
        return "hello";
    }
}

