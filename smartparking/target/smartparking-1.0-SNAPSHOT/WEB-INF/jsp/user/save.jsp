<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/4/10
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../taglibs.jsp"%>

<html>
<head>
    <title>保存</title>
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <link rel="stylesheet" href="layui/css/layui.css">
    <script src="${pageContext.request.contextPath}/layui/layui.js"></script>
    <script>
        // $(function () {
        //
        //     $("form").submit(function () {
        //         var pw = $("#pw").val();
        //         var pw1 = $("#pw1").val();
        //
        //         if (pw != pw1) {
        //             alert("密码不一致！");
        //             return false;
        //         }else {
        //             return true;
        //         }
        //     })
        //
        // })
    </script>
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

<body>


<div id="content">
    <br>
    <form class="layui-form layui-form-pane layui-main" style="width: 400px;padding: 30px;;" action="User/save.do" method="post" >
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
                <input type="submit" class="layui-btn" onclick="register()" value="注册" style="width: 100px;">
                <button type="reset" class="layui-btn layui-btn-primary">取消</button>
            </div>
        </div>


    </form>

</div>


<%--<form action="User/save.do" method="post">
    <table align="center" width="80%">
        <tr>
            <td><label>姓名：</label><input type="text" name="userName" ></td>
        </tr>
        <tr>
            <td><label>账号：</label><input type="text" name="userAccount" ></td>
        </tr>
        <tr>
            <td><label>密码：</label><input id="pw" type="password" name="password" ></td>
        </tr>
        <tr>
            <td><label>确认密码：</label><input id="pw1" type="password"></td>
        </tr>
        <tr>
            <td><input type="submit" value="注册"></td>
        </tr>
    </table>
</form>--%>

</body>
</html>
