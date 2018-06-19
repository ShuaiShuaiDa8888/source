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
    <title>小姐姐</title>
    <script type="text/javascript" src="./js/jquery-3.3.1.min.js"></script>
    <style type="text/css">
        #div {
            text-align: center;
            margin: 0px auto;
        }

        #img {
            margin-top: 50px;
            width: 300px;
            height: 400px;
        }
    </style>
</head>

<body>
<div id="div">
    <h1>我长得帅吗</h1>
    <button id="success">超级帅</button>
    <button id="nosuccess">臭死啦</button>
    <br>
    <img src="aa.jpg" id="img"><br>
    <h3 id="h3">哈哈哈哈哈</h3>
</div>
<script>
    $(document).ready(function () {
        $("#img").hide();
        $("#h3").hide();
        $("#nosuccess").click(function () {
            window.confirm("送你玫瑰花啊！");
            window.confirm("夸我帅的人最漂亮！");
            window.confirm("不吃你口红啦！");
            window.confirm("吃完给你买一只！");
            window.confirm("哈哈哈哈哈哈哈！");
            $("#nosuccess").attr({"disabled": "disabled"});
        });
        $("#success").click(function () {
            window.confirm("一号小姐姐已经拿下！");
            $("#img").show();
            $("#h3").show();
            $("#nosuccess").attr({"disabled": "disabled"});
            $("#success").attr({"disabled": "disabled"});
        });
    });
</script>

<audio autoplay="true">
    <source src="music.mp3" type="audio/mp3"/>
</audio>
</body>
</html>
