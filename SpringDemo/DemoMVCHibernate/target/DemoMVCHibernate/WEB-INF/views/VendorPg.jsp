<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<f:form action="insert" method="post" modelAttribute="v">
		<table>
			<tr>
				<td>VendorId</td>
				<td><f:input path="vendorId" /></td>
				<td><f:errors path="vendorId"></f:errors></td>
			</tr>
			<tr>
				<td>VendorName</td>
				<td><f:input path="vendorName" /></td>
				<td><f:errors path="vendorName"></f:errors></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><f:input path="email" /></td>
				<td><f:errors path="email"></f:errors></td>
			</tr>
			<tr>
				<td>Pancard</td>
				<td><f:input path="pancard" /></td>
				<td><f:errors path="pancard"></f:errors></td>
			</tr>
			<tr>
				<td>DateOfRegistration</td>
				<td><f:input path="dateOfRegistration" type="date" /></td>
				<td><f:errors path="dateOfRegistration"></f:errors></td>
			</tr>
			<tr>
				<td>RegistrationFees</td>
				<td><f:input path="registrationFees" /></td>
				<td><f:errors path="registrationFees"></f:errors></td>
			</tr>

		<tr><td><input type="submit">  </td></tr>
		</table>


	</f:form>


</body>
</html>