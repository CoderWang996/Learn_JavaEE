<%--
    1.page指令
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="/error.jsp" %>

<%--
    2.include指令
--%>
<%@ include file="/include.jsp"%>
<html>
<head>
    <title>jsp指令</title>
</head>
<body>
    <%--<% int result = 1 / 0; %>--%>
    <%=s%>
    <% out.println("aa");
    %>
</body>
</html>
