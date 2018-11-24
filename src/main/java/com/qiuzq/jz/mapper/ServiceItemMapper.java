package com.qiuzq.jz.mapper;

import com.qiuzq.jz.model.ServiceItem;

public interface ServiceItemMapper {
    int deleteByPrimaryKey(Long itemId);

    int insert(ServiceItem record);

    int insertSelective(ServiceItem record);

    ServiceItem selectByPrimaryKey(Long itemId);

    int updateByPrimaryKeySelective(ServiceItem record);

    int updateByPrimaryKey(ServiceItem record);
}