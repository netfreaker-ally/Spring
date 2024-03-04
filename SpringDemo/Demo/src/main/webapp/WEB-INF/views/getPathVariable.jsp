<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html>

<head>

<meta charset="ISO-8859-1">

<title>Insert title here</title>

<script>
	function check() {

		var eno = document.getElementsByName("empno")[0].value;
		var en = document.getElementsByName("ename")[0].value;

		if (eno.trim().length != 0)

		{

			window.location.href = "/Demo/sample/printPathVariable/" + eno
					+ "/" + en;
		}

		else

		{

			alert("plz enter");

		}

		return false;

	}
</script>
</head>
<body>
	<form>
		<table>
			<tr>
				<td>Empno</td>
				<td><input type="text" name="empno"></td>
				<td>eName</td>
				<td><input type="text" name="ename"></td>
				<td><input type="submit" onclick="return check();"></td>
			</tr>
		</table>
	</form>
</body>
</html>


