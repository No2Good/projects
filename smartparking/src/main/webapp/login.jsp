<%--
  Created by IntelliJ IDEA.
  User: binguner
  Date: 2019-07-01
  Time: 19:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆</title>
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <link rel="stylesheet" href="layui/css/layui.css">
    <script src="${pageContext.request.contextPath}/layui/layui.js"></script>

</head>
<style type="text/css">
    body{
        background-image: url("${pageContext.request.contextPath}/login_bg.jpg");
        background-size: 100%;
    }

    #login_panel{
        background-color: #ffffff;
        border-radius: 14px;
        width: 30%;
        position: relative;
        left: 60%;
        text-align: center;
    }

    #register_new_account{
        font-size: 10px;
        position: relative;
        color: rgba(0, 0, 0, 0.47);
        left: 40%;
    }
</style>
<body>

<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>

<script type="text/javascript">
    function login() {
        var username = $("#username").val();
        var password = $("#password").val();
        console.log( username + " , " + password);
        var data = 'username='+username+"&password="+password;
        $.ajax({
            <%--url: ${pageContext.request.contextPath},--%>
            type: 'post',
            dataType: text,
            data: data,
            success: function () {
                window.location.href = "www.baidu.com";
            },
            error: function () {
                
            }
        })
    }

    function register() {
        alert("register")
    }

</script>


<div id="login_panel">
    <br>
    <font size="4">账号密码登陆</font>
    <form class="layui-form layui-form-pane layui-main" style="width: 400px;padding: 30px;;" >
        <div class="layui-form-item" style="position: relative; left: 10%">
            <label class="layui-form-label">用户名</label>
            <div class="layui-input-inline">
                <input id="username" type="text" name="username" required lay-verify="required" placeholder="请输入用户名"
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
                <input class="layui-btn" onclick="login()" value="登陆" style="width: 100px;">
                <button type="reset" class="layui-btn layui-btn-primary">取消</button>
            </div>
        </div>


    </form>
    <a href="javascript:void(0)" onclick="register()"><p>注册新账号</p></a>
</div>
<script>
    layui.use('form', function () {
        var form = layui.form;
        form.render();
    });
</script>
</body>
</html>
