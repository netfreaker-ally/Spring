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
	<form action="fetchByDeptNo">
	<table>
	<tr>
		<td>Enter DeptNo</td>
		<td><select name="deptno">
			<a:forEach items="${dlist}" var="d">
				<option value="${d.deptno}" ${d.deptno==dno?'selected':''}>${d.dname}</option> 
			</a:forEach>
		
		</select></td>
		<td><input type="submit">
	</tr>
	</table>
	<table>
	<a:choose>
		<a:when test="${elist.size()!=0}">
			<tr>
						<td>Empno</td>
						<td>Ename</td>
					</tr>
					<a:forEach items="${elist}" var="e">
						<tr>
							<td>${e.empno}</td>
							<td>${e.ename}</td>
						</tr>
					</a:forEach>
		
		</a:when>
		<a:otherwise>
			<a:out value="${'No emp with this dept'}"></a:out>
		</a:otherwise>
	</a:choose>
	
	</table>
	</form>
</body>
</html>