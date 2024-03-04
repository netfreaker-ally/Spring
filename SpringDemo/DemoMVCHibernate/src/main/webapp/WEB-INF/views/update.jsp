<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="updateById">
<table>
<tr><td><input name="vendorId" type="text" value="${v.vendorId}"></td></tr>
<tr><td><input name="vendorname" type="text"  value="${v.vendorName}"></td></tr>
<tr><td><input type="submit"></td></tr> 
</table>

</form>