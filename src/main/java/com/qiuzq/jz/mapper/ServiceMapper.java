package com.qiuzq.jz.mapper;

import com.qiuzq.jz.model.Service;

import java.util.List;

public interface ServiceMapper {

    /**
     * 删除服务
     *
     * @param serviceId
     * @return
     */
    int deleteByPrimaryKey(Long serviceId);

    /**
     * 服务增加
     *
     * @param record
     * @return
     */
    int insert(Service record);

    int insertSelective(Service record);

    Service selectByPrimaryKey(Long serviceId);

    int updateByPrimaryKeySelective(Service record);

    int updateByPrimaryKey(Service record);

    /**
     * 改变服务转台
     *
     * @param record
     * @return
     */
    int updateStateByPrimaryKey(Service record);

    /**
     * 查询所有
     *
     * @param service
     * @return
     */
    List<Service> list(Service service);
}