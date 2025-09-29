<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>News List</title>
</head>
<body>
<h2>News Items</h2>
<table border="1" cellpadding="10">
    <tr>
        <th>ID</th>
        <th>Title</th>
    </tr>
    <c:forEach var="news" items="${newsList}">
        <tr>
            <td>${news.id}</td>
            <td>
                <a href="${pageContext.request.contextPath}/news/view/${news.id}">
                        ${news.title}
                </a>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="${pageContext.request.contextPath}/categories">Back to Categories</a>
</body>
</html>
