package com.qiuzq.jz.mapper;

import com.qiuzq.jz.model.Token;

public interface TokenMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Token record);

    int insertSelective(Token record);

    Token selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Token record);

    int updateByPrimaryKey(Token record);
}