package com.qiuzq.jz.service.impl;

import com.qiuzq.jz.mapper.ServiceMapper;
import com.qiuzq.jz.model.Service;
import com.qiuzq.jz.service.ServicesService;
import com.qiuzq.jz.util.PageBean;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * program: jz
 * Date: 2018/11/8/008 15:56
 *
 * @author: Mr.Qiu
 * Description:
 */
@org.springframework.stereotype.Service
@Transactional(rollbackFor = {RuntimeException.class, Exception.class})
public class ServicesServiceImpl implements ServicesService {

    private ServiceMapper serviceMapper;

    @Override
    public int insert(Service record) {
        return serviceMapper.insert(record);
    }

    @Resource
    public void setServiceMapper(ServiceMapper serviceMapper) {
        this.serviceMapper = serviceMapper;
    }

    @Override
    public List<Service> list(Service service, PageBean pageBean) {
        List<Service> services = null;
        if (pageBean != null && pageBean.isPagination()) {
            services = serviceMapper.list(service);
        }
        return services;
    }

    @Override
    public int deleteByPrimaryKey(Long serviceId) {
        return serviceMapper.deleteByPrimaryKey(serviceId);
    }

    @Override
    public int updateStateByPrimaryKey(Service record) {
        return serviceMapper.updateStateByPrimaryKey(record);
    }

}
