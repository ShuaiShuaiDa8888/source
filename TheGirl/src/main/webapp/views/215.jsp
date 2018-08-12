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
    <script type="text/javascript" src="../js/jquery-3.3.1.min.js"></script>
    <style type="text/css">
        #div {
            text-align: center;
            margin: 0px auto;
        }

        .imgs {
            margin-top: 50px;
            width: 830px;
            height: 640px;
        }
    </style>
</head>

<body>
<div id="div">
    <h1>你还记得当年的我们吗？</h1>
    <button id="success">记得</button>
    <button id="nosuccess">不记得</button>
    <h2 id="remember">记得好像是215</h2>
    <div>
        <h3 id="h0" class="words">我来告诉你</h3>
        <h3 id="h1" class="words">老大孟祥磊</h3>
        <h3 id="h2" class="words">老二时圣磊</h3>
        <h3 id="h3" class="words">老三葛庆龙</h3>
        <h3 id="h4" class="words">老四狄东亚</h3>
        <h3 id="h5" class="words">老五商俊豪</h3>
        <h3 id="h6" class="words">老六魏帅</h3>
        <h3 id="h7" class="words">老七张鲁</h3>
        <h3 id="h8" class="words">老八谷世飞</h3>
        <h3 id="h9" class="words">老九夏万霜</h3>
        <h3 id="h10" class="words">老十杨润静</h3>
    </div>
    <div>
        <img src="file/215/215.jpg" id="img" class="imgs">
        <h3 id="happy" class="words">哈哈哈哈哈</h3>
    </div>

    <div>
        <audio autoplay="true" loop="loop">
            <source src="file/215/youth.mp3" type="audio/mp3"/>
        </audio>
    </div>
</div>
<script type="text/javascript">
    $(document).ready(function () {
        $(".words").hide()
        $(".imgs").hide()
        $("#remember").hide()
    })

    $(document).ready(function () {
        showWords();
    });
    $("#success").click(function () {
        $("#remember").show();
        setTimeout(function(){$("#img").show()}, 1500);
        $("#nosuccess").hide();
        $("#success").hide();
    });

    function showWords() {
        var time = 1;
        $("#nosuccess").click(function () {
            $("#success").hide();
            if (time === 1) {
                $("#h0").show();
            } else if (time === 2) {
                $("#h0").hide();
                $("#h1").show();
                $("#nosuccess").text("还有呢")
            } else if (time === 3) {
                $("#h2").show();
            } else if (time === 4) {
                $("#h3").show();
            } else if (time === 5) {
                $("#h4").show();
            } else if (time === 6) {
                $("#h5").show();
            } else if (time === 7) {
                $("#h6").show();
            } else if (time === 8) {
                $("#h7").show();
            } else if (time === 9) {
                $("#h8").show();
            } else if (time === 10) {
                $("#h9").show();
            } else if (time === 11) {
                $("#h10").show();
                $("#nosuccess").hide();
                $("#img").show();
                if (!$("#img").is(":hidden")) {
                    roll();
                }
            }
            time++;
        });

        function roll() {
            var imgArray = new Array();
            imgArray[0] = "file/215/215.jpg";
            imgArray[1] = "file/215/dg.jpg";
            imgArray[2] = "file/215/da.jpg";
            imgArray[3] = "file/215/san.jpg";
            imgArray[4] = "file/215/liu.jpg";
            imgArray[5] = "file/215/qi.jpg";
            imgArray[6] = "file/215/ba.jpg";
            imgArray[7] = "file/215/jiu.jpg";
            imgArray[8] = "file/215/shi.jpg";
            imgArray[9] = "file/215/wb.jpg";
            imgArray[10] = "file/215/hsh.jpg";
            imgArray[11] = "file/215/dj.jpg";
            imgArray[12] = "file/215/wb.jpg";

            var interval = 2000;
            var current = 0;
            var len = imgArray.length;
            var setImage = function () {
                img.src = imgArray[current];
                current = ++current > len - 1 ? 0 : current;
            };
            setImage();
            setInterval(setImage, interval);
        }
    }

</script>


</body>
</html>
