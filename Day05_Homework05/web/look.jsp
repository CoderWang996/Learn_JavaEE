<%@ page import="java.util.ArrayList" %>
<%@ page import="bean.Student" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>查看页面</title>
</head>
<body>
<table width="600px" border="1px">
    <tr>
        <th>姓名</th>
        <th>年龄</th>
        <th>分数</th>
    </tr>
    <c:forEach items="${list}" var="s">
        <tr align="center">
            <td>${s.name}</td>
            <td>${s.age}</td>
            <td>${s.score}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
