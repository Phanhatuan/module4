<%--
  Created by IntelliJ IDEA.
  User: BOSS
  Date: 08/03/2023
  Time: 7:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/calculate">
    <input type="text" name="numb1">
    <input type="text" name="numb2">
    <input type="submit" value="+" name="operator">Add
    <input type="submit" value="-" name="operator">Sub
    <input type="submit" value="*" name="operator">Mul
    <input type="submit" value="/" name="operator">Div
</form>
<h3>Result: ${rs}</h3>
</body>
</html>
