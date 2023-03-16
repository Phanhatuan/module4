<%--
  Created by IntelliJ IDEA.
  User: BOSS
  Date: 16/03/2023
  Time: 11:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${message != null}">
    <c:out value="${message}"/>
    <c:out value="${declaration.toString()}"/>
</c:if>
</body>
</html>
