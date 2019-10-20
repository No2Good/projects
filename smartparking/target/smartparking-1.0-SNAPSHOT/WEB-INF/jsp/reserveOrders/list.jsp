<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/4/10
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../taglibs.jsp"%>

<html>
<head>
    <title>listCarport</title>
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <link rel="stylesheet" href="layui/css/layui.css">
    <script src="${pageContext.request.contextPath}/layui/layui.js"></script>
</head>

<body>



<%--<table align="center" border="1">
    <tr>
        <th>车库</th>
        <th>车位</th>
        <th>开始时间</th>
        <th>结束时间</th>
    </tr>
    <c:forEach items="${roList}" var="ro">
        <tr>
            <th>${ro.carport.garage.garageName}</th>
            <th>${ro.carport.cposition}</th>
            <th>${ro.startTime}</th>
            <th>${ro.endTime}</th>
        </tr>
    </c:forEach>
</table>--%>

<table class="layui-table">
    <colgroup>
        <col width="100">
        <col width="100">
        <col width="200">
        <col width="200">
    </colgroup>
    <thead>
    <tr>
        <th>车库</th>
        <th>车位</th>
        <th>开始时间</th>
        <th>结束时间</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${roList}" var="ro">
        <tr>
            <th>${ro.carport.garage.garageName}</th>
            <th>${ro.carport.cposition}</th>
            <th><f:formatDate value="${ro.startTime}" pattern="yyyy-MM-dd HH:mm:ss"></f:formatDate></th>
            <th><f:formatDate value="${ro.endTime}" pattern="yyyy-MM-dd HH:mm:ss"></f:formatDate></th>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
