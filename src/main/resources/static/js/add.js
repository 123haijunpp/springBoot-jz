$(document).ready(function () {
    addService();
});


/**
 * 增加服务
 */
function addService() {
    $("#formDemo").click(function () {
        var serviceName = $("#serviceName").val();
        var serviceIcon = $("#serviceIcon").val();
        var serviceBanner = $("#serviceBanner").val();
        var remark = $("#remark").val();
        var data = "serviceName=" + serviceName + "&serviceIcon=" + serviceIcon + "&serviceBanner=" + serviceBanner + "&remark=" + remark;
        // console.log(data);
        $.ajax({
            type: 'post',
            url: 'services/addService',
            data: data,
            async: true,
            success: function (data) {
                if (data === 'ok') {
                    layer.alert("增加success！", {icon: 1});
                }
            }, error: function () {
                layer.alert("增加失败！", {icon: 5});
            }
        });
    });
}
