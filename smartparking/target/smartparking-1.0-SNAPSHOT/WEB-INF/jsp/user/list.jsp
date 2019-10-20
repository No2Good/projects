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
    <title>listPerson</title>
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <link rel="stylesheet" href="layui/css/layui.css">
    <script src="${pageContext.request.contextPath}/layui/layui.js"></script>
</head>
<body>

<form action="User/listUser.do" method="post">
    <table align="center" width="80%">
        <tr>
            <td><label>用户名：</label><input type="text" name="userName" value="${query.userName }"></td>
            <td><label>账号：</label><input type="text" name="userAccount" value="${query.userAccount }"></td>
            <td><input type="submit" class="layui-btn layui-btn-normal" value="查询"></td>
        </tr>
    </table>
</form>

<%--<table align="center" width="80%" border="1">
    <tr>
        <th>用户名</th>
        <th>账号</th>
        <th>汽车</th>
    </tr>
    <c:forEach items="${userList }" var="user">
        <tr>
            <td>${user.userName }</td>
            <td>${user.userAccount }</td>
            <td>
                <select>
                    <c:forEach items="${user.carList}" var="car">
                        <option>${car.licenseNumber}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
    </c:forEach>
</table>--%>


<table class="layui-table">
    <colgroup>
        <col width="150">
        <col width="200">
        <col width="200">
    </colgroup>
    <thead>
    <tr>
        <th>用户名</th>
        <th>账号</th>
        <th>汽车</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${userList }" var="user">
        <tr>
            <td>${user.userName }</td>
            <td>${user.userAccount }</td>
            <td>
                <select>
                    <c:forEach items="${user.carList}" var="car">
                        <option>${car.licenseNumber}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>


</body>
</html>
