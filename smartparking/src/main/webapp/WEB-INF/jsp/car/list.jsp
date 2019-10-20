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
    <title>listCar</title>
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <link rel="stylesheet" href="layui/css/layui.css">
    <script src="${pageContext.request.contextPath}/layui/layui.js"></script>
</head>

<body>

<a class="layui-btn layui-btn-warm" href="Car/toSave.do?userId=${sessionScope.userId}">添加</a>
<input type="hidden" name="userId" ${sessionScope.userId}>
<%--<table align="center" border="1">
    <tr>
        <th>车牌号</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${carList}" var="car">
        <tr>
            <th>${car.licenseNumber}</th>
            <th>
                <a href="Car/deleteCar.do?carId=${car.carId}">删除</a>
            </th>
        </tr>
    </c:forEach>
</table>--%>


<table class="layui-table">
    <colgroup>
        <col width="150">
        <col width="200">
    </colgroup>
    <thead>
    <tr>
        <th>车牌号</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${carList}" var="car">
        <tr>
            <td>
                    ${car.licenseNumber}
            </td>
            <td>
                <a class="layui-btn layui-btn-normal" href="Car/deleteCar.do?carId=${car.carId}">删除</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>


</body>
</html>
