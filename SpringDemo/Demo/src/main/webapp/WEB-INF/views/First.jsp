<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:out value="${'Hello' }"></c:out>
	<c:set var="V" value="${40654 }"></c:set>
	<c:out value="${V }"></c:out>
	<c:if test="${V>100 }">
		<c:out value="${'More than 100' }"></c:out>

	</c:if>
	<c:choose>
		<c:when test="${V>80 }">
			<c:out value="${'value more than 80' }"></c:out>
		</c:when>
			<c:otherwise>
			<c:out value="${'value less than 70' }"></c:out>
		</c:otherwise>
	</c:choose>
	<c:forEach var="i" begin="0" end="10" step="1">
		<c:out value="${i }"></c:out>
	
	</c:forEach>
	
	
</body>
</html>