<%@ page import="ServletDemo.Student" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.TreeMap" %><%--
  Created by IntelliJ IDEA.
  User: Coder Wang
  Date: 2020/7/21
  Time: 21:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL表达式</title>
</head>
<%--使用EL表达式获取 基本类型string,自定义对象,map的值--%>
<body>
<%
    String s="我是一个字符串";
    Student student= new Student("张三", 21);
    TreeMap<String,Student> map=new TreeMap();
    map.put("no1",student);
    pageContext.setAttribute("s",s);
    pageContext.setAttribute("student",student);
    pageContext.setAttribute("map",map);
%>
${s}<br/>
${student}<br/>
${student.name}<br/>
${student.age}<br/>
${map.no1.toString()}<br/>
${map.no1.name}<br/>
</body>
</html>
