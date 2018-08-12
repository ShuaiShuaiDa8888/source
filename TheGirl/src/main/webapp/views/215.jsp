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

        #img {
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
    <h3 id="h0" class="h">我来告诉你</h3>
    <h3 id="h1" class="h">老大孟祥磊</h3>
    <h3 id="h2" class="h">老二时圣磊</h3>
    <h3 id="h3" class="h">老三葛庆龙</h3>
    <h3 id="h4" class="h">老四狄东亚</h3>
    <h3 id="h5" class="h">老五商俊豪</h3>
    <h3 id="h6" class="h">老六魏帅</h3>
    <h3 id="h7" class="h">老七张鲁</h3>
    <h3 id="h8" class="h">老八谷世飞</h3>
    <h3 id="h9" class="h">老九夏万霜</h3>
    <h3 id="h10" class="h">老十杨润静</h3>

    <div id="hidden">
        <img src="215.jpeg" id="img"><br>
        <h3>哈哈哈哈哈</h3>
    </div>

    <div>
        <audio autoplay="true" loop="loop" controls id="isNotPC">
            <source src="youth.mp3" type="audio/mp3"/>
        </audio>

        <audio autoplay="true" loop="loop" id="isPC">
            <source src="youth.mp3" type="audio/mp3"/>
        </audio>
    </div>
</div>
<script>
    $(document).ready(function () {
        $(".h").hide()
    })

    $(document).ready(function IsPC() {
            $("#isPC").hide();
            $("#isNotPC").hide();
            var flag = true;
            var userAgentInfo = navigator.userAgent;
            var Agents = new Array("Android", "iPhone", "SymbianOS", "Windows Phone", "iPad", "iPod");
            for (var v = 0; v < Agents.length; v++) {
                if (userAgentInfo.indexOf(Agents[v]) > 0) {
                    flag = false;
                    break;
                }
            }
            return flag;

            if (flag) {
                $("#isPC").show();
            } else {
                $("#isNotPC").show();
            }
        }
    )


    $(document).ready(function () {
        var time = 1;
        $("#hidden").hide();
        $("#nosuccess").click(function () {
            $("#success").hide();
            switch (time) {
                case 1:
                    $("#h0").show();
                    $("#nosuccess").text("还有呢")
                    break;
                case 2:
                    $("#h0").hide();
                    $("#h1").show();
                    break;
                case 3:
                    $("#h2").show();
                    break;
                case 4:
                    $("#h3").show();
                    break;
                case 5:
                    $("#h4").show();
                    break;
                case 6:
                    $("#h5").show();
                    break;
                case 7:
                    $("#h6").show();
                    break;
                case 8:
                    $("#h7").show();
                    break;
                case 9:
                    $("#h8").show();
                    break;
                case 10:
                    $("#h9").show();
                    break;
                case 11:
                    $("#h10").show();
                    $("#nosuccess").hide();
                    $("#hidden").show();
                    break;
            }

            time++;
        });
        $("#success").click(function () {
            window.confirm("记得好像是215");
            $("#hidden").show();
            $("#nosuccess").hide();
            $("#success").hide();
        });
    });
</script>


</body>
</html>
