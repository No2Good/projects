<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: binguner
  Date: 2019-07-02
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>选择车位</title>
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <link rel="stylesheet" href="layui/css/layui.css">
    <script src="${pageContext.request.contextPath}/layui/layui.js"></script>
</head>
<body>
<form class="layui-form" action="">

    <div class="layui-form-item">
        <label class="layui-form-label">停车场</label>
        <div class="layui-input-block">
            <select name="city" lay-verify="required">
                <option value=""></option>
                <option value="0">田森汇</option>
                <option value="1">万科</option>
                <option value="2">万达</option>
                <option value="3">奥特莱斯</option>
            </select>
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">区号</label>
        <div class="layui-input-block">
            <select name="city" lay-verify="required">
                <option value=""></option>
                <option value="0">A</option>
                <option value="1">B</option>
                <option value="2">C</option>
                <option value="3">D</otion>
            </select>
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">区号</label>
        <div class="layui-input-block">
            <select name="city" lay-verify="required">
                <option value=""></option>
                <option value="0">A</option>
                <option value="1">B</option>
                <option value="2">C</option>
                <option value="3">D</otion>
            </select>
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">车位号</label>
        <div class="layui-input-block">
            <select name="city" lay-verify="required">
                <option value=""></option>
<%--                <c:forEach>--%>
<%--                    <option value=""></option>--%>
<%--                </c:forEach>--%>
                <option value="0">A</option>
                <option value="1">B</option>
                <option value="2">C</option>
                <option value="3">D</otion>
            </select>
        </div>
    </div>


    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>

<script>
    //Demo
    layui.use('form', function(){
        var form = layui.form;

        //监听提交
        form.on('submit(formDemo)', function(data){
            layer.msg(JSON.stringify(data.field));
            return false;
        });
    });
</script>

</body>
</html>
