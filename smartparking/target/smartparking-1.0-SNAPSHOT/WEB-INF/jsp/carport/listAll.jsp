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

    <script>

        $(function () {

            $("form").submit(function () {
                var garageId = $("#sgarageId").val();
                $("#garageId").val(garageId);

                var isUse = $("#cisUse").val();
                $("#isUse").val(isUse);

                return true;
            })

            if($("#garageId").val() != "" ){
                var garageId = $("#garageId").val();
                $("#option"+garageId).attr("selected","selected");
            }

            if($("#isUser").val() == ''){
                $("#w").attr("selected","selected");
            }
            if($("#isUser").val() == '是'){
                $("#yes").attr("selected","selected");
            }
            if($("#isUser").val() == '否'){
                $("#no").attr("selected","selected");
            }
            if($("#isUser").val() == '已预约'){
                $("#reserve").attr("selected","selected");
            }

        })

    </script>

</head>

<body>

<form action="Carport/listAll.do" method="post">
    <input id="garageId" type="hidden" name="garageId" value="${carport.garageId}">
    <input id="isUse" type="hidden" name="isUse" value="${carport.isUse}">
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
            <td>
                <label>是否使用：</label>
                <select id="cisUse">
                    <option id="w" value="">任意</option>
                    <option id="yes" value="是">是</option>
                    <option id="no" value="否">否</option>
                    <option id="reserve" value="已预约">已预约</option>
                </select>
            <th>
                <input type="submit" value="查询">
            </th>
        </tr>
    </table>
</form>

<table align="center" border="1">
    <tr>
        <th>车库</th>
        <th>车位</th>
        <th>是否使用</th>
    </tr>
    <c:forEach items="${carportList}" var="carport">
        <tr>
            <th>${carport.garage.garageName}</th>
            <th>${carport.cposition}</th>
            <th>${carport.isUse}</th>
        </tr>
    </c:forEach>
</table>


</body>
</html>
