package com.qiuzq.jz.mapper;

import com.qiuzq.jz.model.ColumnSubitem;

public interface ColumnSubitemMapper {
    int deleteByPrimaryKey(Long csid);

    int insert(ColumnSubitem record);

    int insertSelective(ColumnSubitem record);

    ColumnSubitem selectByPrimaryKey(Long csid);

    int updateByPrimaryKeySelective(ColumnSubitem record);

    int updateByPrimaryKey(ColumnSubitem record);
}