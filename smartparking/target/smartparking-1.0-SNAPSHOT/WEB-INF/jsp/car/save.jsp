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

</head>
<body>

<form action="Car/save.do" method="post">
    <input type="hidden" name="userId" value="${param.userId}">
    <table align="center">
        <tr>
            <td><label>车牌号：</label><input type="text" name="licenseNumber" ></td>
        </tr>
        <tr>
            <td><input type="submit" value="添加"></td>
        </tr>
    </table>
</form>

</body>
</html>
