package com.qiuzq.jz.service;

import com.qiuzq.jz.model.Service;
import com.qiuzq.jz.util.PageBean;

import java.util.List;

/**
 * program: jz
 * Date: 2018/11/8/008 15:55
 *
 * @author: Mr.Qiu
 * Description: 服务接口
 */
public interface ServicesService {

    /**
     * 服务增加
     *
     * @param record
     * @return
     */
    int insert(Service record);

    /**
     * 查询所有
     *
     * @param service
     * @return
     */
    List<Service> list(Service service, PageBean pageBean);

    /**
     * 删除服务
     *
     * @param serviceId
     * @return
     */
    int deleteByPrimaryKey(Long serviceId);

    /**
     * 改变服务转台
     *
     * @param record
     * @return
     */
    int updateStateByPrimaryKey(Service record);
}
