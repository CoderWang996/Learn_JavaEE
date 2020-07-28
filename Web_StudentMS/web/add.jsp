<%--
  Created by IntelliJ IDEA.
  User: Coder Wang
  Date: 2020/7/28
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加</title>
</head>
<body>
<form action="/add" method="get" autocomplete="off">
    姓名：<input type="text" name="name" placeholder="输入姓名" required/><br/>
    年龄：<input type="number" name="age" placeholder="输入年龄" required/><br/>
    <div>
        <label for="gender">性别:</label>
        男<input type="radio" name="gender" id="gender" value="男"/>
        女<input type="radio" name="gender" value="女"/>
    </div><br/>
    分数：<input type="number" name="score" placeholder="输入分数" required/><br/>
    <button type="submit">保存</button>
</form>
</body>
</html>
