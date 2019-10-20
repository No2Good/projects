<%--
  Created by IntelliJ IDEA.
  User: binguner
  Date: 2019-06-27
  Time: 17:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>折线图</title>
</head>
<body>

    <div id="container" style="height: 80%; width: 60%"></div>
    <script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts/echarts.min.js"></script>
    <script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts-gl/echarts-gl.min.js"></script>
    <script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts-stat/ecStat.min.js"></script>
    <script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts/extension/dataTool.min.js"></script>
    <script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts/map/js/china.js"></script>
    <script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts/map/js/world.js"></script>
    <script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts/extension/bmap.min.js"></script>
    <script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/simplex.js"></script>







    <script type="text/javascript">
        var dom = document.getElementById("container");
        var myChart = echarts.init(dom);
        var app = {};
        option = null;
        option = {
            title: {
                text: '折线图堆叠'
            },
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                data:['万达','万科','田森汇','奥特莱斯']
            },
            grid: {
                left: '3%',
                right: '4%',
                bottom: '3%',
                containLabel: true
            },
            toolbox: {
                feature: {
                    saveAsImage: {}
                }
            },
            xAxis: {
                type: 'category',
                boundaryGap: false,
                // data: ['周一','周二','周三','周四','周五','周六','周日']
                data: ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December']

            },
            yAxis: {
                type: 'value'
            },
            series: [
                {
                    name:'万达',
                    type:'line',
                    stack: '总量',
                    data: [120, 132, 401, 734, 190, 1330, 1320, 124, 523, 1231, 412, 123]

                },
                {
                    name:'万科',
                    type:'line',
                    stack: '总量',
                    data: [230, 232, 451, 234, 180, 430, 1220, 324, 423, 631, 112, 123]
                },
                {
                    name:'田森汇',
                    type:'line',
                    stack: '总量',
                    data: [460, 372, 241, 778, 230, 180, 320, 224, 543, 231, 421, 523]
                },
                {
                    name:'奥特莱斯',
                    type:'line',
                    stack: '总量',
                    data: [324, 342, 781, 242, 189, 450, 120, 524, 323, 531, 142, 123]
                }
            ]
        };
        ;
        if (option && typeof option === "object") {
            myChart.setOption(option, true);
        }
    </script>



</body>
</html>
