<%--
  Created by IntelliJ IDEA.
  User: WS
  Date: 2018/6/18
  Time: 8:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>215</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=0.5, maximum-scale=2.0, user-scalable=yes">
    <script type="text/javascript" src="../js/jquery-3.3.1.min.js"></script>
    <style type="text/css">
        #all {
            margin: 0 auto;
            text-align: center;
        }

        #body-a {
            color: green;
            font-size: 24px;
            font-weight: 900;
            font-family:"KaiTi";
        }

        #body {
            height: 90%;
            margin-top: 30px;
        }

        #body-img {
            width: 50%;
            padding-top: 50px;
        }

        #footer {
            width: 300px;
            margin: 0 auto;
            padding: 20px 0;
        }

        .footerC1, .footerC2 {
            float: left;
            height: 20px;
            line-height: 20px;
            margin: 0px 0px 0px 5px;
            color: #939393;
        }

        #footer .a {
            display: inline-block;
            text-decoration: none;
            height: 20px;
            line-height: 20px;
        }
    </style>
</head>

<body>
<div id="all">
    <div id="body">
        <a href="../views/215.jsp" id="body-a">点我啊</a><br>
        <img src="./the_girl/hopping.jpg" id="body-img">
    </div>
    <div id="footer">
        <a class="a" target="_blank" href="http://www.miitbeian.gov.cn"><p class="footerC1">京ICP备18036878号</p></a>
        <a class="a" target="_blank" href="http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=37152102000038">
            <img src="./the_girl/beian.png" style="float:left;"/>
            <p class="footerC2">鲁公网安备 37152102000038号</p></a>
    </div>
</div>
</body>
</html>
