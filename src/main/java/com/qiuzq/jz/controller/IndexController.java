package com.qiuzq.jz.controller;

import com.qiuzq.jz.model.TreeNode;
import com.qiuzq.jz.service.TreeNodeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.*;

/**
 * program: jz
 * Date: 2018/11/7/007 11:00
 *
 * @author: Mr.Qiu
 * Description: 展示页面
 */
@Controller
@RequestMapping("/home")
@Slf4j
public class IndexController {

    @Resource
    private TreeNodeService treeNodeService;

    @Resource
    private StringRedisTemplate stringRedisTemplate;
    /*
        StringRedisTemplate存取数据是字符串的时候使用
        RedisTemplate 存储复杂的对象类型，而取出的时候又不想做任何装换。
     */

    @RequestMapping("/ajax")
    public String a() {
        return "ajax";
    }

    /**
     * 首页导航栏
     *
     * @param treeNode
     * @param model
     * @return
     */
    @RequestMapping("/appBar")
    @ResponseBody
    public List<Map<String, Object>> doIndex(TreeNode treeNode, Model model) {
        List<TreeNode> trees = treeNodeService.trees(treeNode);
        List<Map<String, Object>> tree = new ArrayList<>(16);
        Map<String, Object> map = null;
        Map<String, Object> attributes = null;
        for (TreeNode node : trees) {
            /* 树控件数据格式化 属性 */
            map = new HashMap<>(16);
            map.put("id", node.getTreeNodeId());
            map.put("text", node.getTreeNodeName());
            /* 如果是枝节点isLeaf为false，如果为closed将不自动展开该节点(说明不是叶节点而是枝节点可展开) */
            map.put("state", node.isLeaf() ? "open" : "closed");
            /* attributes 自定义属性 */
            attributes = new HashMap<>(16);
            attributes.put("url", node.getUrl());
            map.put("attributes", attributes);
            tree.add(map);
        }
        return tree;
    }

    /**
     * 服务一览
     *
     * @return
     */
    @RequestMapping("/serviceIn")
    public String serviceIn() {
        return "serviceIn";
    }

    /**
     * 测试redis缓存
     *
     * @param model
     * @return
     */
    @RequestMapping("/pppp")
    public String test(Model model) {
        log.info("appBar");
        Integer n = 1;
        String loginCount = stringRedisTemplate.opsForValue().get("loginCount");
        if (null != loginCount) {
            n = Integer.parseInt(loginCount) + 1;
        }
        stringRedisTemplate.opsForValue().set("loginCount", n.toString());

        model.addAttribute("now", new Date().toLocaleString());
        model.addAttribute("loginCount", n);
        return "ajax";
    }
}
