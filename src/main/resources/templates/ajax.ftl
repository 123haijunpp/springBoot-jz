<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>跨域请求</title>
    <#include "common/head.ftl"/>
    <script>
        function showData(result) {
            console.log("调用showData(); 回调的" + result);
        }

        //
        $(document).ready(function () {
            $("#btn").click(function () {
                // 向头部输入一个脚本，该脚本发起一个跨域请求
                $("head").append("<script src='http://192.168.43.92:8088/s2/ok?callback=showData'><\/script>");
            });

        });

        $(document).ready(function () {
            $("#btn").click(function () {
                $.ajax({
                    url: 'http://192.168.43.92:8088/s2/ok',
                    type: "post",
                    dataType: 'jsonp',  // 指定服务器返回的数据类型
                    jsonp: "theFunction",   // 指定参数名称
                    // jsonCallback: "showData", // 指定回调函数的名称
                    success: function (data) {
                        console.log("调用回调函数的名称success" + data);
                        // alert("成功" + data);
                    }, error: function () {
                        alert("错误！");
                    }
                });
            });
        });

    </script>
</head>
<body>
<button type="button" id="btn">获取跨域数据</button>
主界面${now},loginCount:${loginCount}
<textarea id="text" style="width: 400px; height: 100px;"></textarea>
</body>
<script>
    // function success(text) {
    //     alert("Success:" + text);
    // }
    //
    // function fail(code) {
    //     alert("Error:" + code);
    // }
    //
    // var request = new XMLHttpRequest(); // 创建XMLHttpRequest
    // request.onreadystatechange = function () { // 状态发生变化时，函数被回调
    //     if (request.readyState === 4) {   // 成功完成
    //         // 判断响应结果
    //         if (request.status === 200) {
    //             // 成功，通过responseText拿到响应的文本
    //             return success(request.responseText);
    //         } else {
    //             // 失败，根据响应码判断失败原因：
    //             return fail(request.status);
    //         }
    //     } else {
    //         // HTTP请求还在继续...
    //     }
    // };
    //
    // // 发送请求
    // request.open("GET", "/jz/services/ajax");
    // request.send();
    //
    // alert("请求已发送，请等待响应...");
</script>
</html>