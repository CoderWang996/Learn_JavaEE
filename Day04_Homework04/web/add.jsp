<%--
  Created by IntelliJ IDEA.
  User: Coder Wang
  Date: 2020/7/20
  Time: 21:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学生信息</title>
</head>
<body>
<form action="/stu/add" method="get" autocomplete="off">
    姓名：<input type="text" name="name"><br/>
    年龄：<input type="number" name="age"><br/>
    分数：<input type="number" name="score"><br/>
    <button type="submit">保存</button>
</form>
</body>
</html>
