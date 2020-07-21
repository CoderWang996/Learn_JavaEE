<%--
  Created by IntelliJ IDEA.
  User: Coder Wang
  Date: 2020/7/21
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL表达式使用细节</title>
</head>
<body>
<%--获取四大域对象中的数据--%>
<%
    pageContext.setAttribute("username","zangsan");
    request.setAttribute("username","张三");
    session.setAttribute("username","李四");
    application.setAttribute("username","王五");
%>
${username}<br/>
<%--获取JSP中其他八大隐世对象--%>
<%=request.getContextPath()%>
${pageContext.request.contextPath}
</body>
</html>
