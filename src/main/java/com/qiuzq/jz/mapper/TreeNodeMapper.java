package com.qiuzq.jz.mapper;

import com.qiuzq.jz.model.TreeNode;

import java.util.List;

public interface TreeNodeMapper {
    int deleteByPrimaryKey(Integer treeNodeId);

    int insert(TreeNode record);

    int insertSelective(TreeNode record);

    TreeNode selectByPrimaryKey(Integer treeNodeId);

    int updateByPrimaryKeySelective(TreeNode record);

    int updateByPrimaryKey(TreeNode record);

    /**
     * 查询所有服务
     *
     * @param treeNode
     * @return
     */
    List<TreeNode> trees(TreeNode treeNode);
}