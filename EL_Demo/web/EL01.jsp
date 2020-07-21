<%--
  Created by IntelliJ IDEA.
  User: Coder Wang
  Date: 2020/7/21
  Time: 9:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL表达式</title>
</head>
<body>
<% request.setAttribute("username","zhangsan");%><br/>
<% out.println(request.getAttribute("username"));%><br/>
<%=request.getAttribute("username")%><br/>
${username}
</body>
</html>
