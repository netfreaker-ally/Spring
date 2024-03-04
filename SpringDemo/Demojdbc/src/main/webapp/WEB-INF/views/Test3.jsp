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
	Session Variable<a:out value="${sessionScope.FN}"></a:out><br>
	RequestScope<a:out value="${requestScope.FN}"></a:out><br>
	RequestScope<a:out value="${requestScope.lastname}"></a:out><br>
<a:out value="${'We are in Test3'}"></a:out>
<a href="test4">test4</a>
</body>
</html>