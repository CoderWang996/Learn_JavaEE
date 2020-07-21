<%--
  Created by IntelliJ IDEA.
  User: Coder Wang
  Date: 2020/7/21
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL表达式11个隐士对象</title>
</head>
<body>
${pageContext.request.contextPath}<br/>
<% request.setAttribute("username","zhangsan");%>
${requestScope.username}<br/>
${header[connection]}<br/>
${headerValues["username"][0]}<br/>
${param.username}<br/>
${paramValues.hobby[0]}`
</body>
</html>
