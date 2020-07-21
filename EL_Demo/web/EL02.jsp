<%@ page import="bean.Servlet.Student" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.io.CharArrayReader" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Coder Wang
  Date: 2020/7/21
  Time: 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL表达式获取不同类型数据</title>
</head>
<body>
<%--获取基本数据类型--%>
<%pageContext.setAttribute("num", 10);%>
${num}<br/>
<%--获取自定义类型--%>
<%
    Servlet.Student student = new Servlet.Student("zahngsan", 21, 100);
    pageContext.setAttribute("Stu", student);
%>
${Stu}<br/>
${Stu.name}
${Stu.age}
<%--获取数组--%>
<%
    String[] arr = {"hello", "world"};
    pageContext.setAttribute("arr", arr);
%>
${arr}<br/>
${arr[0]}<br/>
<%--获取list集合--%>
<%
    ArrayList<String> list = new ArrayList<>();
    list.add("aa");
    list.add("bbb");
    pageContext.setAttribute("list", list);
%>
${list}<br/>
${list[0]}<br/>
<%--获取Map集合--%>
<%
    HashMap<String,Servlet.Student> map=new HashMap<>();
    map.put("hm01",new Servlet.Student("张三",21,100));
    map.put("hm02",new Servlet.Student("李四",23,99));
    pageContext.setAttribute("map",map);
%>
${map}<br/>
${map.hm01}<br/>
${map.hm02.name}
</body>
</html>
