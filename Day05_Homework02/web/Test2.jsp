<%@ page import="java.util.ArrayList" %>
<%@ page import="java.sql.ClientInfoStatus" %><%--
  Created by IntelliJ IDEA.
  User: Coder Wang
  Date: 2020/7/21
  Time: 22:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Test2</title>
</head>
<body>
<%--if --%>
<% pageContext.setAttribute("score1", "A");%>
<a:if test="${score1=='A'}">
    Good<br/>
</a:if>
<a:if test="${score1=='B'}">
    Not Bad<br/>
</a:if>
<%--  choose 标签的使用--%>
<% pageContext.setAttribute("score2", "76");%>
<a:choose>
    <a:when test="${score2<60}">垃圾！<br/></a:when>
    <a:when test="${score2>=60&&score2<70}">你及格了啊！<br/></a:when>
    <a:when test="${score2>=70&&score2<80}">你可以更好！<br/></a:when>
    <a:when test="${score2>=80&&score2<90}">你已经很棒了！<br/></a:when>
    <a:when test="${score2>=80&&score2<=100}">你是真的强！<br/></a:when>
    <a:otherwise>你确定没输错？<br/></a:otherwise>
</a:choose>
<%--forEach 标签的使用--%>
<%
    ArrayList<String> list=new ArrayList<>();
    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    list.add("ddd");
    list.add("eee");
    list.add("fff");
    list.add("ggg");
    pageContext.setAttribute("list",list);

%>
<a:forEach items="${list}" var="str">
    ${str}<br/>
</a:forEach>
<a:forEach items="${list}" var="arr" begin="3" end="6">
    ${arr}<br/>
</a:forEach>
</body>
</html>
