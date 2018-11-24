<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>跨域请求</title>
    <#include "common/head.ftl"/>
</head>
<body>
<button type="button" id="btn" onclick="request()">获取跨域数据</button>

</body>
<script>
    function request() {
        for (var i = 0; i < 1000000; i++) {
            $("head").append("<script src='http://192.168.43.92:8088/s2/Book/addBook?bookName=张三" + i + "&price=" + i + "'> <\/script>");
        }
    }
</script>
</html>