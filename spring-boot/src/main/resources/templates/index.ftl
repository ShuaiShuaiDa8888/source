<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/html">
<head lang="en">
    <meta charset="UTF-8"/>
    <title></title>
</head>
<body>
${name}<br>
<#if sex == 0>
    男
<#elseif sex == 1>
    女
<#else >
    其他
</#if><br>
<#list userList as user>
    ${user}<br>
</#list>
</body>
</html>
