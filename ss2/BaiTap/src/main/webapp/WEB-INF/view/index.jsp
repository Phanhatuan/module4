<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/make">
    <input type="checkbox" value="Lettuce" name="condiment" >Lettuce
    <input type="checkbox" value="Tomato" name="condiment">Tomato
    <input type="checkbox" value="Mustard" name="condiment">Mustard
    <input type="checkbox" value="Sprouts" name="condiment">Sprouts
    <input type="submit"> Click me
</form>
<h3> <c:forEach var="cls" items="${condiment}">
    <h3>${cls}</h3>
</c:forEach></h3>
</body>
</html>
