<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="create" method="post" modelAttribute="declaration">
    <table>
        <tr>
            <td><form:label path="name">Name: </form:label></td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>Birthday:
                <form:select path="birthYear">
                    <form:options items="${years}"/>
                </form:select></td>
        </tr>
        <tr>
            <td>Gender:
                <form:select path="gender">
                    <form:options items="${genders}"/>
                </form:select></td>
        </tr>
        <tr>
            <td>Nationality:
                <form:select path="nationality">
                    <form:options items="${nationalities}"/>
                </form:select></td>
        </tr>
        <tr>
            <td><form:label path="id">Id: </form:label></td>
            <td><form:input path="id"/></td>
        </tr>
        <tr>
            <td><form:label path="infoMoving">Info moving: </form:label></td>
            <td><form:radiobuttons path="infoMoving" items="${vehicles}"/></td>
        </tr>
        <tr>
            <td><form:label path="idVehicle">Id of vehicle: </form:label></td>
            <td><form:input path="idVehicle"/></td>
        </tr>
        <tr>
            <td><form:label path="seatNumber">Number of seat: </form:label></td>
            <td><form:input path="seatNumber"/></td>
        </tr>
        <tr>
            <td><form:label path="startDay">Start day: </form:label></td>
            <td><form:input path="startDay"/></td>
        </tr>
        <tr>
            <td><form:label path="endDay">End day: </form:label></td>
            <td><form:input path="endDay"/></td>
        </tr>
        <tr>
            <td><form:label path="recentMove">Recent move: </form:label></td>
            <td><form:input path="recentMove"/></td>
        </tr>
        <tr>
            <td>Cities:
                <form:select path="city">
                    <form:options items="${cities}"/>
                </form:select></td>
        </tr>
        <tr>
            <td>Districts:
                <form:select path="district">
                    <form:options items="${districts}"/>
                </form:select></td>
        </tr>
        <tr>
            <td>Wards:
                <form:select path="ward">
                    <form:options items="${wards}"/>
                </form:select></td>
        </tr>
        <tr>
            <td><form:label path="street">Street: </form:label></td>
            <td><form:input path="street"/></td>
        </tr>
        <tr>
            <td><form:label path="phoneNumber">Phone number: </form:label></td>
            <td><form:input path="phoneNumber"/></td>
        </tr>
        <tr>
            <td><form:label path="email">Email: </form:label></td>
            <td><form:input path="email"/></td>
        </tr>
        <tr>
            <td><form:label path="fever">Fever: </form:label></td>
            <td><form:checkbox  path="fever"></form:checkbox></td>
        </tr>
        <tr>
            <td><form:label path="cough">Cough: </form:label></td>
            <td><form:checkbox  path="cough"></form:checkbox></td>

        </tr>
        <tr>
            <td><form:label path="breathless">Breathless: </form:label></td>
            <td><form:checkbox  path="breathless"></form:checkbox></td>

        </tr>
        <tr>
            <td><form:label path="soreThroat">Sore Throat: </form:label></td>
            <td><form:checkbox  path="soreThroat"></form:checkbox></td>

        </tr>
        <tr>
            <td><form:label path="vomiting">Vomiting: </form:label></td>
            <td><form:checkbox  path="vomiting"></form:checkbox></td>

        </tr>
        <tr>
            <td><form:label path="diarrhea">Diarrhea: </form:label></td>
            <td><form:checkbox  path="diarrhea"></form:checkbox></td>

        </tr>
        <tr>
            <td><form:label path="skinHemorrhage">SkinHemorrhage: </form:label></td>
            <td><form:checkbox  path="skinHemorrhage"></form:checkbox></td>

        </tr>
        <tr>
            <td><form:label path="rash">Rash: </form:label></td>
            <td><form:checkbox  path="rash"></form:checkbox></td>

        </tr>
        <tr>
            <td><form:label path="animalExposure">Animal Exposure: </form:label></td>
            <td><form:checkbox  path="animalExposure"></form:checkbox></td>

        </tr>
        <tr>
            <td><form:label path="patientExposure">Patient Exposure: </form:label></td>
            <td><form:checkbox  path="patientExposure"></form:checkbox></td>

        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form>

</body>
</html>
