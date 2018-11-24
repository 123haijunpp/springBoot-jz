package com.qiuzq.jz.controller;

import com.qiuzq.jz.model.Service;
import com.qiuzq.jz.service.ServicesService;
import com.qiuzq.jz.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * program: jz
 * Date: 2018/11/8/008 15:59
 *
 * @author: Mr.Qiu
 * Description:
 */
@Controller
@RequestMapping("/services")
public class ServiceController {

    private ServicesService servicesService;

    @RequestMapping({"/doUpdateServer"})
    public String doUpdateServer() {
        return "editService";
    }

    @RequestMapping("/updateServiceState")
    @ResponseBody
    public String updateServiceState(Service service) {
        servicesService.updateStateByPrimaryKey(service);
        return "ok";
    }

    @RequestMapping("/delService")
    @ResponseBody
    public String delService(Service service) {
        servicesService.deleteByPrimaryKey(service.getServiceId());
        return "ok";
    }

    @RequestMapping({"/doAddServicePage"})
    public String doAddServicePage() {
        return "addService";
    }

    @RequestMapping("/addService")
    @ResponseBody
    public String addService(Service service) {
        service.setState(2);
        service.setIsvoid(0);
        servicesService.insert(service);
        return "ok";
    }

    @RequestMapping("/serviceList")
    @ResponseBody
    public Map<String, Object> listService(Service service, PageBean pageBean, HttpServletRequest request) {
        pageBean.setRequest(request);
        List<Service> services = servicesService.list(service, pageBean);
        List<Service> se = new ArrayList<>(16);
        Service service1 = null;
        for (Service s : services) {
            service1 = new Service();
            if (s.getState() == 1) {
                s.setStateName("编辑中");
            }
            if (s.getState() == 2) {
                s.setStateName("使用中");
            }
            if (s.getState() == 3) {
                s.setStateName("已失效");
            }
            service1.setStateName(s.getStateName());
            service1.setState(s.getState());
            service1.setIsvoid(s.getIsvoid());
            service1.setServiceName(s.getServiceName());
            service1.setRemark(s.getRemark());
            service1.setServiceBanner(s.getServiceBanner());
            service1.setServiceIcon(s.getServiceIcon());
            service1.setServiceId(s.getServiceId());
            se.add(service1);
        }
        Map<String, Object> data = new HashMap<>(16);
        data.put("code", "0");
        data.put("msg", "ok");
        data.put("count", pageBean.getTotal());
        data.put("data", se);
        return data;
    }

    @Autowired
    public void setServicesService(ServicesService servicesService) {
        this.servicesService = servicesService;
    }
}
