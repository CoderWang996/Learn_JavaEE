<%--
  Created by IntelliJ IDEA.
  User: Coder Wang
  Date: 2020/7/22
  Time: 14:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加页面</title>
</head>
<body>
<form action="/add" method="get" autocomplete="off">
    姓名：<input type="text" name="name" placeholder="在此输入姓名"><br/>
    年龄：<input type="number" name="age" placeholder="在此输入年龄"><br/>
    姓名：<input type="number" name="score" placeholder="在此输入分数"><br/>
    <button type="submit">保存</button>
</form>
</body>
</html>
