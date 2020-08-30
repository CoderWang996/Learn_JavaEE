<%--
  Created by IntelliJ IDEA.
  User: Coder Wang
  Date: 2020/8/30
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>param</title>
</head>
<body>
<form action="/param/test2"method="get">
    username:<input type="text" name="username"/><br/>
    age:<input type="text" name="age"/><br/>
<%--    &lt;%&ndash;list集合存储&ndash;%&gt;
    address1:<input type="text" name="list[0].city"><br/>
    address2:<input type="text" name="list[1].city"><br/>
    address3:<input type="text" name="list[2].city"><br/>
    address4:<input type="text" name="list[3].city"><br/>
    address5:<input type="text" name="list[4].city"><br/>--%>
    <%--map集合存储--%>
    address6:<input type="text" name="map['anhui'].city"><br/>
    address7:<input type="text" name="map['jiangsu'].city"><br/>
    address8:<input type="text" name="map['shanghai'].city"><br/>
    address9:<input type="text" name="map['hainan'].city"><br/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
