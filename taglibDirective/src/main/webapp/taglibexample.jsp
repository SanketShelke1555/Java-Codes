<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Taglib Example</title>
</head>
<body>

<h2>JSTL Core Tags Example</h2>

<!-- c:set and c:out -->
<c:set var="a" value="100"/>
<c:set var="b" value="200"/>

<h3>Addition of a and b:</h3>
<c:out value="${a+b}"/>

<hr>

<!-- c:if -->
<c:set var="age" value="26"/>

<c:if test="${age >= 18}">
    <h3>You are Eligible for Voting.</h3>
</c:if>

<hr>

<!-- c:forEach -->
<h3>Numbers from 1 to 10</h3>

<c:forEach var="i" begin="1" end="10">
    <c:out value="${i}"/><br>
</c:forEach>

<hr>

<!-- c:choose -->
<c:set var="num" value="20"/>

<c:choose>

    <c:when test="${num > 0}">
        <h3>Number is Positive.</h3>
    </c:when>

    <c:when test="${num < 0}">
        <h3>Number is Negative.</h3>
    </c:when>

    <c:otherwise>
        <h3>Number is Zero.</h3>
    </c:otherwise>

</c:choose>

</body>
</html>