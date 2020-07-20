<%--
  Created by IntelliJ IDEA.
  User: Coder Wang
  Date: 2020/7/20
  Time: 20:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Session1</title>
</head>
<body>
<%
    String username = request.getParameter("username");
    HttpSession session1 = request.getSession();
    session1.setAttribute("username",username);
%>
</body>
</html>
