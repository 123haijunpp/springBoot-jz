package com.qiuzq.jz.mapper;

import com.qiuzq.jz.model.Column;

public interface ColumnMapper {
    int deleteByPrimaryKey(Long columnId);

    int insert(Column record);

    int insertSelective(Column record);

    Column selectByPrimaryKey(Long columnId);

    int updateByPrimaryKeySelective(Column record);

    int updateByPrimaryKey(Column record);
}