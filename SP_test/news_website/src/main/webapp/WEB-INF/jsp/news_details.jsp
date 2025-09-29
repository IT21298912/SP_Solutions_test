<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>${news.title}</title>
</head>
<body>
<h2>${news.title}</h2>
<p><strong>ID:</strong> ${news.id}</p>
<p><strong>Category ID:</strong> ${news.category.id}</p>
<p><strong>Content:</strong></p>
<p>${news.content}</p>

<a href="${pageContext.request.contextPath}/news/category/${news.category.id}">Back to News List</a>
<a href="${pageContext.request.contextPath}/categories">Back to Categories</a>

<hr>
<h3>Comments</h3>

<!-- Display comments -->
<c:if test="${not empty comments}">
    <ul>
        <c:forEach var="comment" items="${comments}">
            <li><strong>${comment.userName}:</strong> ${comment.content}</li>
        </c:forEach>
    </ul>
</c:if>
<c:if test="${empty comments}">
    <p>No comments yet. Be the first to comment!</p>
</c:if>

<!-- Add new comment -->
<h4>Add a Comment</h4>
<form action="${pageContext.request.contextPath}/comments/news/${news.id}/add" method="post">
    <label for="userName">Name:</label><br>
    <input type="text" id="userName" name="userName" required><br><br>

    <label for="content">Comment:</label><br>
    <textarea id="content" name="content" rows="4" cols="50" required></textarea><br><br>

    <input type="submit" value="Add Comment">
</form>
</body>
</html>
