<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <%--遍历所有的用户信息--%>
    <title>主页面</title>
</head>
<body>
    <table border="1" align="center" width="800px">
        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>密码</td>
        </tr>
        <c:forEach items="${pageInfo.list}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.password}</td>
            </tr>
        </c:forEach>
        <%--分页信息--%>
        <tr>
            <td colspan="3">
                总共${pageInfo.pages}页
                共计${pageInfo.total}条
                <c:if test="${pageInfo.hasPreviousPage}">
                    <a href="${pageContext.request.contextPath}/user/list?pageNum=${pageInfo.pageNum-1}">上一页</a>
                </c:if>
                <c:forEach begin="1" end="${pageInfo.pages}" var="i">
                    <a href="${pageContext.request.contextPath}/user/list?pageNum=${i}">${i}</a>
                </c:forEach>
                <c:if test="${pageInfo.hasNextPage}">
                    <a href="${pageContext.request.contextPath}/user/list?pageNum=${pageInfo.pageNum+1}">下一页</a>
                </c:if>
            </td>
        </tr>
    </table>
</body>
</html>
