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

<form action="getall" >

<input type="submit">

<table>
<tr><td>Empno</td><td>ename</td></tr>
<a:forEach items="${list}" var="e">
<tr><td>${e.empno}</td><td>${e.ename}</td></tr>

 

 

 

 

 

</a:forEach>

 

</table>

 

</form>

</body>

</html>