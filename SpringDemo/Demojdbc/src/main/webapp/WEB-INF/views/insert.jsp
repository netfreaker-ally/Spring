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
<form action="insertMain" >
<table>
	<tr><td>Empno</td><td><input type="text" name="empno"></tr>
	<tr><td>EName</td><td><input type="text" name="ename"></tr>
	<tr><td>Job</td><td><input type="text" name="job"></tr>
	<tr><td>Mgr</td><td><input type="text" name="mgr"></tr>
	<tr><td>Hiredate</td><td><input type="date" name="hiredate"></tr>
	<tr><td>Salary</td><td><input type="text" name="sal"></tr>
	<tr><td>Commission</td><td><input type="text" name="comm"></tr>
	<tr><td>DeptNo</td><td><input type="text" name="deptno"></tr>
	<tr><td><input type="submit">
</table>
<table>
<a:out value="${output}"></a:out>
</table>
</form>
</body>
</html>