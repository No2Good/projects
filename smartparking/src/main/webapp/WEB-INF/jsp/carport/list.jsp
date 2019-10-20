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
    <script>

        $(function () {

            $("form").submit(function () {
                var garageId = $("#sgarageId").val();
                $("#garageId").val(garageId);

                return true;
            })

            if($("#garageId").val() != "" ){
                var garageId = $("#garageId").val();
                $("#option"+garageId).attr("selected","selected");
            }

        })

    </script>

</head>

<body>

<form action="Carport/listCarportByCondition.do" method="post">
    <input id="garageId" type="hidden" name="garageId" value="${sessionScope.garageId}">
    <input type="hidden" name="userId" value="${sessionScope.userId}">
    <table align="center" width="80%">
        <tr>
            <td>
                <label>车库：</label>
                <select id="sgarageId">
                    <option id="option1" value="1">outlets</option>
                    <option id="option2" value="2">wanda</option>
                    <option id="option3" value="3">wanke</option>
                    <option id="option4" value="4">tiansenhui</option>
                </select>
            </td>
            <td><label>区域：</label><input type="text" name="cposition" value="${query.cposition }"></td>
            <td><input class="layui-btn layui-btn-normal layui-btn-sm" type="submit" value="查询"></td>
        </tr>
    </table>
</form>

<%--<table align="center" border="1">
    <tr>
        <th>车位</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${carportList}" var="carport">
        <tr>
            <th>${carport.cposition}</th>
            <th>
                <form method="post" action="ReserveOrders/save.do">
                    <input type="hidden" name="carportId" value="${carport.carportId}">
                    <input type="hidden" name="userId" value="${param.userId}">
                    <input type="submit" value="预约">
                </form>
            </th>
        </tr>
    </c:forEach>
</table>--%>


<table class="layui-table">
    <colgroup>
        <col width="150">
        <col width="200">
<%--        <col>--%>
    </colgroup>
    <thead>
    <tr>
        <th>车位</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${carportList}" var="carport">
        <tr>
            <th>${carport.cposition}</th>
            <th>
                <form method="post" action="ReserveOrders/save.do">
                    <input type="hidden" name="carportId" value="${carport.carportId}">
                    <input type="hidden" name="userId" value="${param.userId}">
                    <input class="layui-btn layui-btn-sm" type="submit" value="预约">
                </form>
            </th>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
