<%--
  Created by IntelliJ IDEA.
  User: binguner
  Date: 2019-06-28
  Time: 17:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传车牌图片</title>
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <script type="text/javascript">
        function submit_file() {
            var file_obj = document.getElementById("file").files[0];
            var fd = new FormData();
            fd.append('pic_file', file_obj);
            $.ajax({
                url: '${pageContext.request.contextPath}/car/disCar.do',
                type: 'post',
                data: fd,
                processData:false,
                contentType: false,
                success: function(){
                    console.log("success")
                },
                error: function () {
                    console.log("error!")
                }
            })
        }
    </script>
</head>

<body>
    <form name="serForm">
        <input id="file" type="file" name="file" multiple="multiple"><br>
        <input type="button" value="文件上传" onclick="submit_file();"/>
    </form>
</body>
</html>
