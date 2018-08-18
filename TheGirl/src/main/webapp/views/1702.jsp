<%--
  Created by IntelliJ IDEA.
  User: WS
  Date: 2018/8/12
  Time: 23:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>1702</title>
    <script type="text/javascript" src="../js/jquery-3.3.1.min.js"></script>
    <style type="text/css">
        #div {
            text-align: center;
            margin: 0px auto;
        }

        .imgs {
            margin-top: 50px;
            width: 780px;
            height: 585px;
        }
    </style>
</head>

<body>
<div id="div">
    <h1 id="h1">昨晚你梦到我了吗！</h1>
    <button id="success">YES</button>
    <button id="nosuccess">NO</button>
    <h2 id="remember" style="color: red">谢谢你还念着我</h2>
    <div class="words">
        <h1 id="miss" style="color: red">可我梦到你了</h1>
        <div class="h1">
            <h3 id="word1"></h3>
            <h3 id="word2"></h3>
            <h3 id="word3"></h3>
            <h3 id="word4"></h3>
            <h3 id="word5"></h3>
            <h3 id="word6"></h3>
        </div>
    </div>
    <div>
        <img src="file/1702/40.jpg" id="img" class="imgs">
        <h5 id="happy">哈哈哈哈哈</h5>
    </div>

    <div>
        <audio autoplay="true" loop="loop">
            <source src="file/215/youth.mp3" type="audio/mp3"/>
        </audio>
    </div>
</div>
<script type="text/javascript">
    $("#miss").hide()
    $(".imgs").hide()
    $("#remember").hide()

    $("#success").click(function () {
        $("#remember").show();
        setTimeout(function () {
            $("#img").show()
        }, 1500);
        $("#h1").hide();
        $("#nosuccess").hide();
        $("#success").hide();
    });

    $("#nosuccess").click(function () {
        loop();
    })

    $("#nosuccess").click(function () {
        $("#img").show()
        $("#miss").show()
        $("#h1").hide();
        $("#nosuccess").hide();
        $("#success").hide();
        if (!$("#img").is(":hidden")) {
            roll();
        }
    })

    function loop() {
        var wordArray = new Array(new Array("马大哈大姐", "魏帅", "刘晓瑞", "吴浩康", "晋统帅", "胡杰"),
            new Array("贺荆龙", "刘开鹏", "田隆隆", "李奕", "梁爽", "李望"),
            new Array("易蔚然", "李浩", "马迎浩", "陈佳奇", "许慧超", "薛祎龑"),
            new Array("张凯", "杨柳", "王乐乐", "孟泽民", "罗斌", "常海利"),
            new Array("徐婷婷", "黄浦毓", "陈婷婷", "史雪迎", "王伏", "马大哈大姐"));
        var len = wordArray.length;
        var space = 1200;
        var current = 0;

        function show() {
            var name1 = wordArray[current][0];
            var name2 = wordArray[current][1];
            var name3 = wordArray[current][2];
            var name4 = wordArray[current][3];
            var name5 = wordArray[current][4];
            var name6 = wordArray[current][5];

            $("#word1").html(name1);
            $("#word2").html(name2);
            $("#word3").html(name3);
            $("#word4").html(name4);
            $("#word5").html(name5);
            $("#word6").html(name6);

            current = ++current > len - 1 ? 0 : current;
        }

        show();
        setInterval(show, space);
    }

    function roll() {
        var imgArray = new Array("file/1702/1.jpg", "file/1702/2.jpg", "file/1702/3.jpg", "file/1702/4.jpg", "file/1702/5.jpg", "file/1702/6.jpg",
            "file/1702/7.jpg", "file/1702/8.jpg", "file/1702/9.jpg", "file/1702/10.jpg", "file/1702/11.jpg", "file/1702/12.jpg",
            "file/1702/13.jpg", "file/1702/14.jpg", "file/1702/15.jpg", "file/1702/16.jpg", "file/1702/17.jpg", "file/1702/18.jpg",
            "file/1702/19.jpg", "file/1702/20.jpg", "file/1702/21.jpg", "file/1702/22.jpg", "file/1702/23.jpg", "file/1702/24.jpg",
            "file/1702/25.jpg", "file/1702/26.jpg", "file/1702/27.jpg", "file/1702/28.jpg", "file/1702/29.jpg", "file/1702/30.jpg",
            "file/1702/31.jpg", "file/1702/32.jpg", "file/1702/33.jpg", "file/1702/34.jpg", "file/1702/35.jpg", "file/1702/36.jpg",
            "file/1702/37.jpg", "file/1702/38.jpg", "file/1702/39.jpg", "file/1702/40.jpg", "file/1702/41.jpg", "file/1702/42.jpg", "file/1702/43.jpg");

        var interval = 2000;
        var current = 0;
        var len = imgArray.length;

        function setImage() {
            img.src = imgArray[current];
            current = ++current > len - 1 ? 0 : current;
        }

        setImage();
        setInterval(setImage, interval);
    }

</script>


</body>
</html>
