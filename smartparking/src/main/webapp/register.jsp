<%--
  Created by IntelliJ IDEA.
  User: binguner
  Date: 2019-07-02
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <link rel="stylesheet" href="layui/css/layui.css">
    <script src="${pageContext.request.contextPath}/layui/layui.js"></script>
</head>
<style type="text/css">
    body{
        background-image: url("${pageContext.request.contextPath}/login_bg.jpg");
        background-size: 100%;
    }

    #content{
        background-color: rgb(255, 255, 255);
        border-radius: 13px;
        position: relative;
        width: 30%;
        left: 60%;
        top: 30%;
    }
</style>
<script type="text/javascript">
    function register() {
        alert( "注册一下")
    }
</script>
<body>

<div id="content">
<br>
    <form class="layui-form layui-form-pane layui-main" style="width: 400px;padding: 30px;;" >
        <div class="layui-form-item" style="position: relative; left: 10%">
            <label class="layui-form-label">用户名</label>
            <div class="layui-input-inline">
                <input id="username" type="text" name="userName" required lay-verify="required" placeholder="请输入用户名"
                       autocomplete="off" class="layui-input">
            </div>
            <%--        <div class="layui-form-mid layui-word-aux">辅助文字</div>--%>
        </div>

        <div class="layui-form-item" style="position: relative; left: 10%">
            <label class="layui-form-label">账号</label>
            <div class="layui-input-inline">
                <input id="username" type="text" name="userAccoutn" required lay-verify="required" placeholder="请输入用户名"
                       autocomplete="off" class="layui-input">
            </div>
            <%--        <div class="layui-form-mid layui-word-aux">辅助文字</div>--%>
        </div>

        <div class="layui-form-item" style="position: relative; left: 10%">
            <label class="layui-form-label">密码</label>
            <div class="layui-input-inline">
                <input id="password" type="password" name="password" required lay-verify="required" placeholder="请输入密码"
                       autocomplete="off" class="layui-input">
            </div>
            <%--        <div class="layui-form-mid layui-word-aux">辅助文字</div>--%>
        </div>

        <div class="layui-form-item">
            <div class="layui-input-block">
                <%--            <button class="layui-btn" onclick="login()">登陆</button>--%>
                <input class="layui-btn" onclick="register()" value="注册" style="width: 100px;">
                <button type="reset" class="layui-btn layui-btn-primary">取消</button>
            </div>
        </div>


    </form>

</div>

</body>
</html>
