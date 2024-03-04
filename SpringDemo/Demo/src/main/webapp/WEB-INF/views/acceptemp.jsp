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
	<form action="getdata" method="post">
		<table>


			<tr>
				<td>Empno</td>
				<td><input type="text" name="empNumber"></td>
			</tr>


			<tr>
				<td>Ename</td>
				<td><input type="text" name="empName"></td>
			</tr>


			<tr>
				<td>Gender</td>
				<td><input type="text" name="gender"></td>
			</tr>


			<tr>
				<td>Date of Birth</td>
				<td><input type="text" name="dateOfBirth"></td>
			</tr>

			<tr>
				<td>Submit</td>
				<td><input type="submit">
			</tr>

		</table>


	</form>
</body>
</html>