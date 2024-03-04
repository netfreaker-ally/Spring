<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="updatebyEmpNo">
<table>
	<tr><td>EmpNo</td><td><input type="number" name="empid" ></td> </tr>
	<tr><td><input type="submit"></td></tr>

</table>

</form>
<form action="updateDetails">
<a:choose>
<a:when test="${list.size()==0}">
		<a:out value="${'No Employees Found'}"></a:out>
</a:when>
<a:otherwise>
<table>
	<a:forEach items="${list}" var="e">
				<tr>
					<td>EmpNo</td>
					<td><input type="number" name="empno" value="${e.empno}" readonly="readonly" ></td>
				</tr>
				<tr>
					<td>EName</td>
					<td><input type="text" name="ename" value="${e.ename}"></td>
				</tr>
				<tr>
					<td>Job</td>
					<td><input type="text" name="job" value="${e.job}"></td>
				</tr>
				<tr>
					<td>Mgr</td>
					<td><input type="number" name="mgr" value="${e.mgr}"></td>
				</tr>
				<tr>
					<td>HireDate</td>
					<td><input type="date" name="hiredate" value="${e.hiredate}"></td>
				</tr>
				<tr><td>Salary</td>
					<td><input type="number" name="sal" value="${e.sal}"></td>
				</tr>
				<tr>
					<td>Commission</td>
					<td><input type="number" name="comm" value="${e.comm}"></td>
				</tr>
				<tr>
					<td>DeptNo</td>
					<td><input type="number" name="deptno" value="${e.deptno}"></td>
				</tr>
				<tr><td><input type="submit"></td></tr>
			</a:forEach>
			

</table>
</a:otherwise>

</a:choose>
<a:out value="${output}"></a:out>
</form>

</body>
</html>