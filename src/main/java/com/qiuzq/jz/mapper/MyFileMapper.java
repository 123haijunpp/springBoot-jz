package com.qiuzq.jz.mapper;

import com.qiuzq.jz.model.MyFile;

public interface MyFileMapper {
    int deleteByPrimaryKey(String fileId);

    int insert(MyFile record);

    int insertSelective(MyFile record);

    MyFile selectByPrimaryKey(String fileId);

    int updateByPrimaryKeySelective(MyFile record);

    int updateByPrimaryKey(MyFile record);
}