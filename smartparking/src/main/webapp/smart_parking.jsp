<%--
  Created by IntelliJ IDEA.
  User: binguner
  Date: 2019-07-02
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>智能预约</title>
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <link rel="stylesheet" href="layui/css/layui.css">
    <script src="${pageContext.request.contextPath}/layui/layui.js"></script>
</head>
<script type="text/javascript">
    function smart_parking() {
        alert("Smart Parking")
    }
</script>
<body>
    <div id="content">
        <button type="button" class="layui-btn layui-btn-normal layui-btn-lg" onclick="smart_parking()" style="position: absolute; left: 45%; top: 10%;">
            一键预约
        </button>

    </div>
</body>
</html>
