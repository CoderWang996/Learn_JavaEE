<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>循环</title>
</head>
<body>
    <%--向域对象中添加集合--%>
    <%
        ArrayList<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        pageContext.setAttribute("list",list);
    %>

    <%--遍历集合--%>
    <c:forEach items="${list}" var="str">
        ${str} <br>
    </c:forEach>
</body>
</html>
