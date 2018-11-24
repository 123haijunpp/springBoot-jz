package com.qiuzq.jz.service.impl;

import com.qiuzq.jz.mapper.TreeNodeMapper;
import com.qiuzq.jz.model.TreeNode;
import com.qiuzq.jz.service.TreeNodeService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * program: jz
 * Date: 2018/11/7/007 19:28
 *
 * @author: Mr.Qiu
 * Description:
 */
@Service
@Transactional(rollbackFor = {RuntimeException.class, Exception.class})
public class TreeNodeServiceImpl implements TreeNodeService {
    @Resource
    private TreeNodeMapper treeNodeMapper;

    @Override
    public List<TreeNode> trees(TreeNode treeNode) {
        return treeNodeMapper.trees(treeNode);
    }

}
