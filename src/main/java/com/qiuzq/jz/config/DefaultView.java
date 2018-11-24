package com.qiuzq.jz.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.*;

/**
 * program: jz
 * Date: 2018/11/7/007 11:04
 *
 * @author: Mr.Qiu
 * Description: 默认首页跳转
 * Configuration解可以用java代码的形式实现spring中xml配置文件配置的效果。
 */
@Configuration
public class DefaultView extends WebMvcConfigurationSupport {

    /**
     * 设置对主页的跳转
     *
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
        super.addViewControllers(registry);
    }

    /**
     * 解决跳转后静态资源无法访问的问题
     *
     * @param registry
     */
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
    }
}
