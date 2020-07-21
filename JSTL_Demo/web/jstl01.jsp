<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>流程控制</title>
</head>
<body>
    <%--向域对象中添加成绩数据--%>
    ${pageContext.setAttribute("score","T")}

    <%--对成绩进行判断--%>
    <c:if test="${score eq 'A'}">
        优秀
    </c:if>

    <%--对成绩进行多条件判断--%>
    <c:choose>
        <c:when test="${score eq 'A'}">优秀</c:when>
        <c:when test="${score eq 'B'}">良好</c:when>
        <c:when test="${score eq 'C'}">及格</c:when>
        <c:when test="${score eq 'D'}">较差</c:when>
        <c:otherwise>成绩非法</c:otherwise>
    </c:choose>
</body>
</html>
