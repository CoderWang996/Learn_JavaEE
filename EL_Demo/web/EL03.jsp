<%--
  Created by IntelliJ IDEA.
  User: Coder Wang
  Date: 2020/7/21
  Time: 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL表达式运算符</title>
</head>
<body>
<%
    String str1=null;
    String str2="";
    int[] arr={};
%>
${empty str1}<br/>
${empty str2}<br/>
${empty str3}<br/>
<% pageContext.setAttribute("gender","men");%>
<input type="radio" name="gender" value="men" ${gender=="men"?"checked":""}>男
<input type="radio" name="gender" value="women" ${gender=="women"?"checked":""}>女
</body>
</html>
