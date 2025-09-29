<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Categories List</title>
    <style>
        ul {
            list-style-type: none;
            padding: 0;
        }
        li {
            margin: 10px 0;
        }
        a {
            text-decoration: none;
            color: blue;
        }
        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
<h2>Categories</h2>
<ul>
    <c:forEach var="category" items="${categories}">
        <li>
            <a href="${pageContext.request.contextPath}/news/category/${category.id}">
                    ${category.name}
            </a>
        </li>
    </c:forEach>
</ul>
</body>
</html>
