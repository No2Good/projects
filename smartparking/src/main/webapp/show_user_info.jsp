<%--
  Created by IntelliJ IDEA.
  User: binguner
  Date: 2019-07-02
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户信息</title>
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <link rel="stylesheet" href="layui/css/layui.css">
    <script src="${pageContext.request.contextPath}/layui/layui.js"></script>
</head>
<body>
<br><br><br><br>
<form class="layui-form" action="" style="position:relative; left: 30%;">
    <div class="layui-form-item">
        <label class="layui-form-label">用户名</label>
        <div class="layui-input-inline">
            <input type="text" name="username" required  lay-verify="required" placeholder="Binguner" autocomplete="off" class="layui-input" disabled>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">账号</label>
        <div class="layui-input-inline">
            <input type="text" name="userAccount" required  lay-verify="required" placeholder="123213" autocomplete="off" class="layui-input" disabled>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">密码</label>
        <div class="layui-input-inline">
            <input type="text" name="password" required lay-verify="required" placeholder="213123" autocomplete="off" class="layui-input" disabled>
        </div>
<%--        <div class="layui-form-mid layui-word-aux">辅助文字</div>--%>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">余额</label>
        <div class="layui-input-inline">
            <input type="text" name="balance" required lay-verify="required" placeholder="12" autocomplete="off" class="layui-input" disabled>
        </div>
        <%--        <div class="layui-form-mid layui-word-aux">辅助文字</div>--%>
    </div>
</form>

<table class="layui-table" style="width: 50%; position:relative; left: 20%;">
    <colgroup>
        <col width="150">
        <col width="200">
        <col>
    </colgroup>
    <thead>
    <tr>
        <th>序号</th>
        <th>车牌号</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>1</td>
        <td>纯1234</td>
    </tr>
    <tr>
        <td>2</td>
        <td>纯12343</td>
    </tr>
    </tbody>
</table>

<script>
    //Demo
    layui.use('form', function(){
        var form = layui.form;
        form.on('submit(formDemo)', function(data){
            layer.msg(JSON.stringify(data.field));
            return false;
        });
    });
</script>
</body>
</html>
