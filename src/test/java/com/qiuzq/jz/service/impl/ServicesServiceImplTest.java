package com.qiuzq.jz.service.impl;

import com.qiuzq.jz.model.Service;
import com.qiuzq.jz.service.ServicesService;
import com.qiuzq.jz.util.PageBean;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * program: jz
 * Date: 2018/11/8/008 17:08
 *
 * @author: Mr.Qiu
 * Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ServicesServiceImplTest {

    @Resource
    private ServicesService servicesService;

    private Service service;
    private PageBean pageBean;

    @Before
    public void setUp() {
        service = new Service();
        pageBean = new PageBean();
    }

    @Test
    public void insert() {
        service.setServiceName("家电清洗");
        service.setState(1);
        service.setIsvoid(0);
        this.servicesService.insert(service);
    }

    @Test
    public void list() {
//        service.setServiceName("家电清洗");
//        service.setState(1);
//        service.setIsvoid(0);
        List<Service> services = this.servicesService.list(service, pageBean);
        System.out.println(services.size());
    }
}