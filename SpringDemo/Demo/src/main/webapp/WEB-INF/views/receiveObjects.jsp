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
	<table>
		<tr>
			<th>Empno</th>
			<th>Ename</th>
			<th>Gender</th>
			<th>Date of Birth</th>
		</tr>
		<c:forEach var="e" items="${emp}">
			<tr>
				<td>${e.empno}</td>
				<td>${e.ename}</td>
				<td>${e.gender}</td>
				<td>${e.dob}</td>
			</tr>

		</c:forEach>

	</table>
</body>
</html>