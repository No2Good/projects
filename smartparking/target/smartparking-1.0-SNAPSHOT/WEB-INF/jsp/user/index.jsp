<%--
  Created by IntelliJ IDEA.
  User: binguner
  Date: 2019-07-01
  Time: 19:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../taglibs.jsp"%>

<html>
<head>
    <title>首页</title>
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <link rel="stylesheet" href="${path}/layui/css/layui.css">
    <script src="${pageContext.request.contextPath}/layui/layui.js"></script>
</head>

<script type="text/javascript">

    function get_map_hot_view() {
        // var content = document.getElementById("content");
        <%--var url = ${pageContext.request.contextPath} + '/map_show_data.jsp';--%>
        var url = 'http://localhost:8080/sp/map_show_data.jsp';
        document.getElementById("content_frame").src=url
    }

    function get_line_view() {
        <%--var url = ${pageContext.request.contextPath} + 'line_show_data.jsp';--%>
        // document.getElementById("content").innerText = '<object type="text/html" data="http://localhost:8080/sp/line_show_data.jsp" width="100%" height="600px"></object>';
        <%--$("#content").load(${pageContext.request.contextPath} + 'line_show_data.jsp')--%>
        var url = 'http://localhost:8080/sp/line_show_data.jsp';
        console.log("clicked");
        document.getElementById("content_frame").src=url
    }

    function go_user_info() {
        var url = 'User/toUserInfo.do';
        // console.log(url);
        document.getElementById("content_frame").src = url;
    }

    function go_upload_pic() {
        var url = '${pageContext.request.contextPath}/car/toDisCar.do';
        // console.log(url)
        document.getElementById("content_frame").src = url;
    }

    function go_choose_car() {
        var url = 'Carport/toList.do';
        document.getElementById("content_frame").src = url;
    }

    function go_smart_parking() {
        var url = 'SmartParking/toSmartparking.do';
        document.getElementById("content_frame").src = url;
    }

    function go_all_user_info() {
        var url = 'User/selectUserAll.do';
        document.getElementById("content_frame").src = url;
    }

    function go_car_info() {
        var url = 'Car/listCarByUserId.do';
        document.getElementById("content_frame").src = url;
    }

</script>

<body class="layui-layout-body">
    <div class="layui-layout layui-layout-admin">
        <div class="layui-header">
            <div class="layui-logo">智能停车厂管理系统</div>
            <!-- 头部区域（可配合layui已有的水平导航） -->
            <ul class="layui-nav layui-layout-left">
<%--                <li class="layui-nav-item"><a href="">控制台</a></li>--%>
<%--                <li class="layui-nav-item"><a href="">商品管理</a></li>--%>
<%--                <li class="layui-nav-item"><a href="">用户</a></li>--%>
<%--                <li class="layui-nav-item">--%>
<%--                    <a href="javascript:;">其它系统</a>--%>
<%--                    <dl class="layui-nav-child">--%>
<%--                        <dd><a href="">邮件管理</a></dd>--%>
<%--                        <dd><a href="">消息管理</a></dd>--%>
<%--                        <dd><a href="">授权管理</a></dd>--%>
<%--                    </dl>--%>
<%--                </li>--%>
            </ul>
            <ul class="layui-nav layui-layout-right">
                <li class="layui-nav-item">
                    <a href="javascript:;">
                        <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
                        Binguner
                    </a>
                    <dl class="layui-nav-child">
                        <dd><a href="">基本资料</a></dd>
                        <dd><a href="">安全设置</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a href="">退出</a></li>
            </ul>
        </div>

        <div class="layui-side layui-bg-black">
            <div class="layui-side-scroll">
                <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
                <ul class="layui-nav layui-nav-tree"  lay-filter="test">
                    <li class="layui-nav-item layui-nav-itemed">
                        <a class="" href="javascript:;">车位管理</a>
                        <dl class="layui-nav-child">
                            <dd><a href="javascript:void(0);" onclick="go_choose_car()">自主预约</a></dd>
                            <dd><a href="javascript:void(0);" onclick="go_smart_parking()">智能预约</a></dd>
<%--                            <dd><a href="javascript:;">列表三</a></dd>--%>
<%--                            <dd><a href="">超链接</a></dd>--%>
                        </dl>
                    </li>
                    <li class="layui-nav-item">
                        <a href="javascript:;">数据可视化</a>
                        <dl class="layui-nav-child">
                            <dd><a href="javascript:void(0);" onclick="get_map_hot_view()">车位热力图</a></dd>
                            <dd><a href="javascript:void(0);" onclick="get_line_view()">车位周期图</a></dd>
<%--                            href="javascript:get_line_view();"--%>
<%--                            <dd><a href="">超链接</a></dd>--%>
                        </dl>
                    </li>
                    <li class="layui-nav-item"><a href="javascript:void(0)" onclick="go_upload_pic()">车牌识别</a></li>
                    <li class="layui-nav-item"><a href="">停车记录</a></li>
                    <li class="layui-nav-item"><a href="javascript:">用户信息</a>
                        <dl class="layui-nav-child">
                            <dd><a href="javascript:void(0)" onclick="go_user_info()";>查看个人信息</a></dd>
                            <dd><a href="javascript:void(0);" onclick="go_all_user_info()">查看所有用户信息</a></dd>
                            <dd><a href="javascript:void(0);" onclick="go_car_info()">汽车管理</a></dd>
                        </dl>
                    </li>
                </ul>
            </div>
        </div>

        <div id="content" class="layui-body">
            <!-- 内容主体区域 -->
            <div style="padding: 15px;">
                <iframe id="content_frame" src="${pageContext.request.contextPath}/Carport/toList.do" width="100%" height="800" frameborder="0">
                        您的浏览器不支持iframe，请升级
                       </iframe>
            </div>
        </div>

        <div class="layui-footer">
            <!-- 底部固定区域 -->
            © smartParking.com
        </div>
    </div>

    <script>
        //JavaScript代码区域
        layui.use('element', function(){
            var element = layui.element;
        });
    </script>
</body>
</html>
