package com.qiuzq.jz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * program: jz
 * Date: 2018/11/13/013 14:31
 *
 * @author: Mr.Qiu
 * Description:
 */
@Controller
public class Test {

    @RequestMapping("/chongji")
    public String chongji() {
        return "js";
    }

}
