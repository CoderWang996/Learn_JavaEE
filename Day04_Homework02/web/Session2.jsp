<%--
  Created by IntelliJ IDEA.
  User: Coder Wang
  Date: 2020/7/20
  Time: 20:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Session2</title>
</head>
<body>
<%
    HttpSession session1 = request.getSession();
    Object username2 = session1.getAttribute("username");
    response.setContentType("text/html;charset=UTF-8");
    response.getWriter().write(username2+"");
%>
</body>
</html>
