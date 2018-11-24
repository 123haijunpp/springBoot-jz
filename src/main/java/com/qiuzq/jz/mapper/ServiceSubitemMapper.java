package com.qiuzq.jz.mapper;

import com.qiuzq.jz.model.ServiceSubitem;

public interface ServiceSubitemMapper {
    int deleteByPrimaryKey(Long subitemId);

    int insert(ServiceSubitem record);

    int insertSelective(ServiceSubitem record);

    ServiceSubitem selectByPrimaryKey(Long subitemId);

    int updateByPrimaryKeySelective(ServiceSubitem record);

    int updateByPrimaryKey(ServiceSubitem record);
}