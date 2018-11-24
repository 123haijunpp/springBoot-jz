package com.qiuzq.jz.mapper;

import com.qiuzq.jz.model.ServiceDesc;

public interface ServiceDescMapper {
    int deleteByPrimaryKey(Long descId);

    int insert(ServiceDesc record);

    int insertSelective(ServiceDesc record);

    ServiceDesc selectByPrimaryKey(Long descId);

    int updateByPrimaryKeySelective(ServiceDesc record);

    int updateByPrimaryKey(ServiceDesc record);
}