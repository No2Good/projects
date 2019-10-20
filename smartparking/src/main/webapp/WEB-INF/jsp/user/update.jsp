<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/7/1
  Time: 20:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../taglibs.jsp"%>

<html>
<head>
    <title>用户修改</title>
</head>
<body>

<form method="post" action="User/update.do">
    <table align="center" border="1">
        <tr>
            <th>用户名：<input type="text" name="userName" value="${user.userName}"></th>
        </tr>
        <tr>
            <th>账号：<input type="text" name="userAccount" value="${user.userAccount}"></th>
        </tr>
        <tr>
            <th>密码：<input type="text" name="password" value="${user.password}"></th>
        </tr>
        <input type="hidden" name="userId" value="${user.userId}">
        <tr>
            <th align="right"><input type="submit" value="确定"></th>
        </tr>
    </table>
</form>

</body>
</html>
