$(document).ready(function () {
    layui.use('table', function () {
        var table = layui.table;
        // JS渲染表格
        table.render({
            elem: '#demo'    // 表格选择器
            , toolbar: '#toolbarDemo'    //工具栏
            , defaultToolbar: ['filter', 'print', 'exports']
            , height: 510
            , url: 'services/serviceList'    // 数据接口
            , title: '用户数据表'
            , cols: [[ //表头
                {field: 'serviceId', title: 'ID', width: 100, sort: true, fixed: 'left', hide: true}
                , {field: 'serviceName', title: '服务名称', width: 280}
                , {field: 'serviceIcon', title: '服务图标', width: 280}
                , {field: 'serviceBanner', title: '服务横幅', width: 240, sort: true}
                , {field: 'state', title: '服务状态', width: 180, hide: true}
                , {field: 'stateName', title: '服务状态', width: 180}
                , {field: 'remark', title: '备注', width: 400}
                , {fixed: 'right', title: '操作', toolbar: '#barDemo', width: 310}
            ]],
            page: true //开启分页

        });
        // 监听行工具事件
        table.on('tool(demo)', function (obj) { // 注：tool是工具条事件名，demo是table原始容器的容器的属性， lay-filter='对应的值'
            var data = obj.data;   // 获取当前行的数据
            // 获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
            if (obj.event === 'del') {
                layer.confirm('你确定要删除？', function (index) {
                    //向服务端发送删除指令
                    delUser(data.serviceId, obj, index);
                });
            }
            if (obj.event === 'updateState') {
                var state = $("#state").val();
                if (state == -1) {
                    layer.alert("请在下拉框中选择状态后修改！");
                } else {
                    updateState(data.serviceId, state, table);
                }
            }
            if (obj.event === 'edit') {
                layer.alert("修改");
                doUpdateServer(data);
            }
        });

        // 重载事件不需要指定url，只需要根据表格id就可以重载，这里的id是值layui声明的id, 然后再where里面传参数
        var $ = layui.$, active = {
            reload: function () {
                var serviceName = $('#serviceName');
                var state = $("#state");
                // console.log(state.val());
                //执行重载
                table.reload('demo', {
                    page: {
                        page: 1 //重新从第 1 页开始
                    },
                    where: {
                        // 传递到后台的参数
                        serviceName: serviceName.val(),
                        state: state.val()
                    }
                });
            }
        };

        $('.layui-inline .layui-btn').on('click', function () {
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });

        doAddUser(table);
    });

    /**
     * 清空搜索栏
     */
    $(".layui-inline #reset").on('click', function () {
        var serviceName = $('#serviceName');
        var state = $("#state");
        if ((serviceName.val() != '' && serviceName.val() != null) || (state.val() != '-1')) {
            serviceName.val('');
            var select = 'dd[lay-value="-1"]';
            $('#state').siblings("div.layui-form-select").find('dl').find(select).click();
        } else {
            layer.alert("没啥好清空的！");
        }
    });

    /**
     * 导航列表 tree
     */
    var url = "home/appBar";
    $("#bar").tree({
        url: url,
        // onBeforeExpand 该事件在节点展开之前触发
        onBeforeExpand: function (node) {
            var parentNodeId = node.id; // 获取当前节点id，对加载远程数据很重要
            var options = $("#bar").tree("options"); // 调用tree(树)控件options(返回树控件属性)方法
            options.url = "" + url + "?parentNodeId=" + parentNodeId + "&test=" + new Date().getTime();
        },
        // onSelect 在用户选择节点的时候触发
        onSelect: function (node) {
            // attributes 被添加到节点的自定义属性
            var url = node.attributes.url;
            if (url) {
                openTab(node.text, url, node.id); // 如果有值则打开一个新的窗口
            }
        }
    });
});


/**
 * 查询要修改的服务
 * @param obj
 */
function doUpdateServer(obj) {
    var index = layer.open({
        title: '修改服务',
        type: 2,    //2 (iframe)嵌套层
        content: 'services/doUpdateServer',    // content 是一个url
        area: ['460px', '600px'],
        btn: ['确定', '关闭'],
        skin: 'layui-layer-rim', //加上边框
        success: function (layero, index) {
            var body = layui.layer.getChildFrame('body', index);  // 获取iframe页的DOM
            var iframeWin = window[layero.find('iframe')[0]['name']]; //得到iframe页的窗口对象，执行iframe页的方法：iframeWin.method();
            // console.log(body.html()); //得到iframe页的body内容
            body.find("#serviceId").val(obj.serviceId);
            body.find('#serviceName').val(obj.serviceName);
            body.find("#serviceIcon").val(obj.serviceIcon);
            body.find("#serviceBanner").val(obj.serviceBanner);
            body.find("#remark").val(obj.remark);
            // 设置 select 自动选择
            var select = 'dd[lay-value=' + obj.state + ']';
            body.find('#state').siblings("div.layui-form-select").find('dl').find(select).click();
        }
        // yes: function (index, layero) {
        //     // 按钮一的回调
        //     layer.close(index);
        //     table.reload("demo");
        // },
        // cancel: function (index, layero) {
        //     layer.close(index);
        //     table.reload("demo");
        // }
    });
}

/**
 * 修改状态
 * @param serverId 服务id
 * @param state 状态id
 * @param table 表元素
 */
function updateState(serverId, state, table) {
    $.ajax({
        type: 'post',
        url: 'services/updateServiceState',
        async: true,
        data: 'serviceId=' + serverId + '&state=' + state,
        success: function (data) {
            if (data === 'ok') {
                // console.log("状态改变成功！");
                layer.alert("状态修改成功!", {icon: 1});
            }
        }, error: function () {
            layer.alert("请求失败！", {icon: 5});
        }
    });
}

/**
 * 删除用户
 * @param serverId   用户id
 * @param obj  利用obj获取当前行数据
 * @param index
 */
function delUser(serverId, obj, index) {
    $.ajax({
        url: 'services/delService',
        type: 'GET',
        data: 'serviceId=' + serverId,
        success: function (data) {
            // == 是个bug，请用===
            if (data === 'ok') {
                obj.del(); //删除对应行（tr）的DOM结构，并更新缓存
                layer.close(index);// 关闭提示窗体
            }
        },
        error: function () {
            layer.alert('报错了！', {icon: 2})
        }
    });
}


/**
 * 跳转增加页面
 */
function doAddUser(table) {
    $("#but-add").click(function () {
            var index = layer.open({
                title: '增加服务',
                type: 2,    //2 (iframe)嵌套层
                content: 'services/doAddServicePage',    // content 是一个url
                area: ['460px', '600px'],
                btn: ['确定', '关闭'],
                skin: 'layui-layer-rim', //加上边框
                yes: function (index, layero) {
                    // 按钮一的回调
                    layer.close(index);
                    table.reload("demo");
                },
                cancel: function (index, layero) {
                    layer.close(index);
                    table.reload("demo");
                }
            });
        }
    );
}

/**
 * 点击打开tab选项卡
 * @param title
 * @param url
 */
function openTab(title, url, id) {
    layui.use('element', function () {
        var element = layui.element; //Tab的切换功能，切换事件监听等，需要依赖element模块
        //初始化动态元素，一些动态生成的元素如果不设置初始化，将不会有默认的动态效果
        element.init();
        var content = '<iframe  data-frameid="' + id + '" scrolling="auto" frameborder="0" src="' + url + '" width="99%" height="99%"></iframe> ';
        //判断是否存在tab
        var exist = $("li[lay-id='" + id + "']").length;
        if (exist === 0) {
            //新增一个tab选项卡
            element.tabAdd('main_tab', {
                title: title,
                content: content,//支持传入html
                id: id
            });
            element.tabChange('main_tab', id);//切换tab
        }

    });
}