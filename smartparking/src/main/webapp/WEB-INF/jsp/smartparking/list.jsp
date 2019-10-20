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

                var garage = $("#option"+garageId).text();
                $("#garage").val(garage);


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

<form action="SmartParking/smartparking.do" method="post">
    <input id="garageId" type="hidden" name="garageId">
    <input id="garage" type="hidden" name="garage">
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
            <td><label>区域：</label><input type="text" name="carport"></td>
            <td><input type="submit" value="预约"></td>
        </tr>
    </table>
</form>

</body>
</html>
