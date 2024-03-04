<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="page2">
	<table>
	<tr><td>FirstName <input type="text" name="firstname"></td></tr>
	<tr><td>LastName <input type="text" name="lastname"></td></tr>
	<tr><td><input type="submit"></td></tr>
	
	
	</table>

<a:out value="${requestScope.firstname}"></a:out>
<a:out value="${requestScope.lastname}"></a:out>
<a href="test3">Test3</a>
</form>
</body>
</html>