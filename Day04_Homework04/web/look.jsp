<%@ page import="java.util.ArrayList" %>
<%@ page import="bean.Student" %><%--
  Created by IntelliJ IDEA.
  User: Coder Wang
  Date: 2020/7/20
  Time: 21:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查看学生信息</title>
</head>
<body>
<table width="600px" border="1px">
    <tr>
        <th>姓名</th>
        <th>年龄</th>
        <th>分数</th>
    </tr>
    <%
        ArrayList<Student> students = (ArrayList<Student>) session.getAttribute("students");
        for (Student student : students) {
    %>
    <tr align="center">
        <td><%=student.getName()%></td>
        <td><%=student.getAge()%></td>
        <td><%=student.getScore()%></td>
    </tr>
    <%}%>
</table>
</body>
</html>
