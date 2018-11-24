<!DOCTYPE html>
<html>
<head>
    <title>用户增加</title>
    <#include "common/head.ftl"/>
    <script src="js/add.js"></script>
</head>
<body>
<div>
    <div style="width:100%;text-align:center;margin-top: 100px;">
        <form class="layui-form">
            <table align="center" style="border-collapse:separate; border-spacing:10px;">
                <tr>
                    <td align="right"><label>用户名</label></td>
                    <td>
                        <input type="text" name="serviceName" id="serviceName" required lay-verify="required"
                               placeholder="请输入标题"
                               autocomplete="off"
                               class="layui-input">
                    </td>
                </tr>
                <tr>
                    <td align="right"><label>服务图标</label></td>
                    <td>
                        <input type="text" name="serviceIcon" id="serviceIcon" required lay-verify="required"
                               placeholder="服务图标"
                               autocomplete="off"
                               class="layui-input">
                    </td>
                </tr>
                <tr>
                    <td align="right"><label>服务横幅</label></td>
                    <td>
                        <input type="text" name="serviceBanner" id="serviceBanner" required lay-verify="required"
                               placeholder="请输入服务横幅"
                               autocomplete="off"
                               class="layui-input">
                    </td>
                </tr>
                <tr>
                    <td align="right"><label>文本域</label></td>
                    <td>
                    <textarea placeholder="请输入内容" class="layui-textarea" name="remark"
                              id="remark"></textarea>
                    </td>
                </tr>
            </table>
            <button type="button" class="layui-btn layui-btn-radius layui-btn-normal" id="formDemo">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-radius layui-btn-normal">重置</button>
    </div>
</div>
<script>
    layui.use('form', function () {
        var form = layui.form;
        form.render();
    });
</script>
</body>
</html>
