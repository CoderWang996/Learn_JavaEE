<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp语法</title>
</head>
<body>
    <%--
        1. 这是注释
    --%>

    <%--
        2.java代码块
        System.out.println("Hello JSP"); 普通输出语句，输出在控制台
        out.println("Hello JSP");
            out是JspWriter对象，输出在页面上
    --%>
    <%
        System.out.println("Hello JSP");
        out.println("Hello JSP<br>");
        String str = "hello<br>";
        out.println(str);
    %>

    <%--
        3.jsp表达式
        <%="Hello"%>  相当于 out.println("Hello");
    --%>
    <%="Hello<br>"%>

    <%--
        4.jsp中的声明(变量或方法)
        如果加!  代表的是声明的是成员变量
        如果不加!  代表的是声明的是局部变量
    --%>
    <%! String s = "abc";%>
    <% String s = "def";%>
    <%=s%>
    <%! public void getSum(){}%>
    <%--<% public void getSum2(){}%>--%>
</body>
</html>
