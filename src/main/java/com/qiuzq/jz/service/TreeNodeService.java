package com.qiuzq.jz.service;

import com.qiuzq.jz.model.TreeNode;

import java.util.List;

/**
 * program: jz
 * Date: 2018/11/7/007 19:27
 *
 * @author: Mr.Qiu
 * Description:
 */
public interface TreeNodeService {

    /**
     * 查询所有服务
     *
     * @param treeNode
     * @return
     */
    List<TreeNode> trees(TreeNode treeNode);

}
