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
<c:out value="${emp.empno }"></c:out>
<c:out value="${emp.ename }"></c:out>
<c:out value="${emp.gender }"></c:out>
<c:out value="${emp.dob }"></c:out>
</body>
</html>