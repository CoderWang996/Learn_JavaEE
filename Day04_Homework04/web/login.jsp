<%--
  Created by IntelliJ IDEA.
  User: Coder Wang
  Date: 2020/7/20
  Time: 21:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form action="/stu/login" method="get" autocomplete="off">
    用户名：<input type="text" name="username"><br/>
    密码：  <input type="password" name="password"><br/>
    <button type="submit">登录</button>
</form>
</body>
</html>
