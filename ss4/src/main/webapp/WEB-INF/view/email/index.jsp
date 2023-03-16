
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="save" method="post" modelAttribute="emailConfig">
    <table>
        <tr>
            <th>Language: </th>
            <td>
                <form:select path="language">
                    <form:options items="${languages}"/>
                </form:select>
            </td>
        </tr>
        <tr>
            <th>Pages: </th>
            <td><form:select path="pageSize" items="${pages}"/></td>
        </tr>
        <tr>
            <th>Spam Filter: </th>
            <td>
                <form:select path="spamFilter">
                    <form:option value="true">Enable</form:option>
                    <form:option value="false">Disable</form:option>
                </form:select>
            </td>
        </tr>
        <tr>
            <th>Signature: </th>
            <td><form:textarea path="signature"/></td>
        </tr>
        <tr>
            <th></th>
            <td>
                <input type="submit" role="button" value="Update">
                <input type="reset" role="button"  value="Cancel">
            </td>
        </tr>
    </table>
</form:form>
<c:if test="${message != null}">
    <div style="color: red">
        <c:out value="${message}"/>
        <c:out value="${emailConfig.toString()}"/>
    </div>
</c:if>
</body>
</html>
