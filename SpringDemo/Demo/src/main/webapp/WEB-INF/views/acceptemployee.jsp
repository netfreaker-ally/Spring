<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="getEmployee" method="post">
		<table>
			<tr>
				<td>EMployee No</td>
				<td><input type="text" name="empid"></td>
			</tr>
			<tr>
				<td>EMmployee Name</td>
				<td><input type="text" name="ename"></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><input type="text" name="gender"></td>
			</tr>
			<tr>
				<td>Date of Bith</td>
				<td><input type="text" name="dob"></td>
			</tr>
			<tr>
				
				<td><input type="submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>