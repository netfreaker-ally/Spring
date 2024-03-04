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
<a:out value="${requestScope.firstname}"></a:out>
<a:out value="${requestScope.lastname}"></a:out>
<a:out value="${'paGE 3'}"></a:out>
</body>
</html>