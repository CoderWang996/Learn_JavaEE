<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Coder Wang
  Date: 2020/7/21
  Time: 20:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a"%>
<html>
<head>
    <title>Demo</title>
</head>
<body>
<% pageContext.setAttribute("score","C");%>
<a:if test="${score eq 'A'}">
    优秀<br/>
</a:if>
<a:if test="${score eq 'B'}">
    良好<br/>
</a:if>
<a:choose>
    <a:when test="${score eq 'A'}">
        优秀<br/>
    </a:when>
    <a:when test="${score eq 'B'}">
        良好<br/>
    </a:when>
    <a:otherwise>
        垃圾<br/>
    </a:otherwise>
</a:choose>
<%
    ArrayList<String> list=new ArrayList<>();
    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    list.add("ddd");
    list.add("eee");
    pageContext.setAttribute("list",list);
%>
<a:forEach items="${list}" var="str" begin="1" end="5" step="2">
    ${str}<br/>
</a:forEach>

</body>
</html>
