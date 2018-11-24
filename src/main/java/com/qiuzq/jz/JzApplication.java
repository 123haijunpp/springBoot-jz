package com.qiuzq.jz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.qiuzq.jz.mapper")
@ComponentScan({"com.qiuzq.jz.config", "com.qiuzq.jz.controller", "com.qiuzq.jz.service", "com.qiuzq.jz.aop", "com.qiuzq.jz.redis","com.qiuzq.jz.weixin"})
@EnableTransactionManagement // 启注解事务管理，等同于xml配置方式的 <tx:annotation-driven>
@EnableScheduling // 启用定时任务
public class JzApplication {
    public static void main(String[] args) {
        SpringApplication.run(JzApplication.class, args);
    }
}
