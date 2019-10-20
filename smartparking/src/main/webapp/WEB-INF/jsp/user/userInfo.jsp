<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/7/1
  Time: 19:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../taglibs.jsp"%>

<html>
<head>
    <title>用户信息</title>
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <link rel="stylesheet" href="layui/css/layui.css">
    <script src="${pageContext.request.contextPath}/layui/layui.js"></script>
</head>
<body>

<%--<table align="center" border="1">
    <tr>
        <th>用户名：${user.userName}</th>
    </tr>
    <tr>
        <th>账号：${user.userAccount}</th>
    </tr>
    <tr>
        <th>密码：${user.password}</th>
    </tr>
    <tr>
        <th>余额：${user.balance}</th>
    </tr>
    <tr>
        <th>汽车：
            <select>
                <c:forEach items="${user.carList}" var="car">
                    <option>${car.licenseNumber}</option>
                </c:forEach>
            </select>
        </th>
    </tr>
    <tr>
        <th align="right"><a href="User/toUpdate.do?id=${user.userId}">修改用户信息</a></th>
    </tr>&lt;%&ndash;
    <tr>
        <th align="right"><a href="Car/listCarByUserId.do?userId=${user.userId}">汽车管理</a></th>
    </tr>&ndash;%&gt;
</table>--%>

<table class="layui-table">
    <%--<colgroup>
        <col width="150">
        <col width="200">
        <col>
    </colgroup>
    <thead>
    <tr>
        <th>昵称</th>
        <th>加入时间</th>
        <th>签名</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>贤心</td>
        <td>2016-11-29</td>
        <td>人生就像是一场修行</td>
    </tr>
    <tr>
        <td>许闲心</td>
        <td>2016-11-28</td>
        <td>于千万人之中遇见你所遇见的人，于千万年之中，时间的无涯的荒野里…</td>
    </tr>
    </tbody>--%>
        <tr>
            <th>用户名：${user.userName}</th>
        </tr>
        <tr>
            <th>账号：${user.userAccount}</th>
        </tr>
        <tr>
            <th>密码：${user.password}</th>
        </tr>
        <tr>
            <th>余额：${user.balance}</th>
        </tr>
        <tr>
            <th>汽车：
                <select>
                    <c:forEach items="${user.carList}" var="car">
                        <option>${car.licenseNumber}</option>
                    </c:forEach>
                </select>
            </th>
        </tr>
        <tr>
            <th align="right">
                <button type="button" class="layui-btn layui-btn-normal">
                    <a href="User/toUpdate.do?id=${user.userId}">修改用户信息</a>
                </button>
            </th>
        </tr>
</table>

</body>
</html>
