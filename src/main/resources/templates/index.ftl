<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <#include "common/head.ftl"/>
    <script src="js/index.js"></script>
</head>
<body>
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">姐政家务管理系统</div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">
            <li class="layui-nav-item"><a href="">控制台</a></li>
            <li class="layui-nav-item"><a href="">商品管理</a></li>
            <li class="layui-nav-item"><a href="">用户</a></li>
            <li class="layui-nav-item">
                <a href="javascript:;">其它系统</a>
                <dl class="layui-nav-child">
                    <dd><a href="">邮件管理</a></dd>
                    <dd><a href="">消息管理</a></dd>
                    <dd><a href="">授权管理</a></dd>
                </dl>
            </li>
        </ul>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <a href="javascript:void(0);">
                    <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
                    贤心
                </a>
            </li>
            <li class="layui-nav-item"><a href="">网站首页</a></li>
            <li class="layui-nav-item"><a href="">安全退出</a></li>
            <li class="layui-nav-item"><a href="">基本资料</a></li>
            <li class="layui-nav-item"><a href="">安全设置</a></li>
        </ul>
    </div>
    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree" lay-filter="test">
                <a class="" href="javascript:void(0);">导航栏</a>
                <div id="bar"></div>
            </ul>
        </div>
    </div>
    <div class="layui-body">
        <div class="layui-tab" lay-filter="main_tab" lay-allowClose="true">
            <!-- 这个一定要写！！！不写选项卡不会出来，哈哈哈，搞了我好久 -->
            <ul class="layui-tab-title">
                <li class="layui-this">欢迎光临</li>
            </ul>
            <div class="layui-tab-content">
                <div class="layui-tab-item layui-show">内容</div>
                <div class="layui-tab-item">
                    <div class="layui-form">
                        <table border="0px">
                            <tr>
                                <td><label class="layui-form-label">服务名称</label></td>
                                <td>
                                    <div class="layui-inline">
                                        <input class="layui-input" name="serviceName" id="serviceName"
                                               autocomplete="off">
                                    </div>
                                </td>
                                <td><label class="layui-form-label">服务状态</label></td>
                                <td>
                                    <div class="layui-inline">
                                        <select name="state" id="state" lay-filter="state">
                                            <option value="-1">-- 请选择 --</option>
                                            <option value="1">编辑中</option>
                                            <option value="2">使用中</option>
                                            <option value="3">已失效</option>
                                        </select>
                                    </div>
                                </td>
                                <td>
                                    <div class="layui-inline">
                                        <button class="layui-btn"
                                                data-type="reload"> 搜 索
                                        </button>
                                        <button type="button"  id="reset" class="layui-btn">重 置</button>
                                    </div>
                                </td>
                                <td></td>
                            </tr>
                        </table>
                    </div>
                    <br>
                    <table class="layui-hide" id="demo" lay-filter="demo"></table>
                </div>
            </div>
        </div>
    </div>
    <div class="layui-footer">
        ${.now?string("yyyyMMdd HH:mm:ss")}
        <!-- 底部固定区域 -->
        <center>©姐政家务</center>
    </div>
</div>
</body>

<!-- 表格按钮图标 -->
<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
    <a class="layui-btn layui-btn-xs" lay-event="updateState" id="updateState">改变状态</a>
    <a class="layui-btn layui-btn-xs" lay-event="view-details">查看详情</a>
</script>
<script type="text/html" id="toolbarDemo">
    <button class="layui-btn" id="but-add">
        <i class="layui-icon">&#xe608;</i> 添加
    </button>
</script>
<script>
    layui.use('form', function () {
        var form = layui.form;
        form.render();
    });
</script>
</html>