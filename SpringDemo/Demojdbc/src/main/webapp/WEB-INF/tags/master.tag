<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ attribute name="title" rtexprvalue="true" required="true"%>
<%@ attribute name="head" fragment="true"%>
<%@ attribute name="content" fragment="true"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="m"%>

<!DOCTYPE html>
<html>
<head>
<style type="text/css">
ul {
	list-style-type: none;
	margin: 0;
	padding: 10;
	overflow: hidden;
	background-color: #333;
}

li {
	float: left;
}

li a {
	display: block;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

li a:hover {
	background-color: #999;
}

body {
	margin: 0;
}
</style>
<meta charset="ISO-8859-1">
<title>Master</title>

</head>
<body>
	<div
		style="position: up; width: 100%; height: 20%; background-color: yellow">
		<img src="${pageContext.request.contextPath}/images/pic3.png"
			style="width: 100%; height: 120px">
	</div>
	<div
		style="position: absolute; width: 100%; height: 10%; left: 0%; right: 15%">
		<ul>
			<li><a href="aboutus">About Us</a></li>
			<li><a href="services">Services</a></li>
			<li style="float: right; background-color: green"><a
				class="active" href="login">Login</a></li>
		</ul>
	</div>

	<jsp:invoke fragment="head"></jsp:invoke>
	<div
		style="position: absolute; width: 50%; height: 100%; left: 20%; top: 25%; margin: auto;padding 10px">
		<m:if test="${sessionScope.username!=null }">
			<h1>Welcome ${sessionScope.username}</h1>
		</m:if>
		<jsp:invoke fragment="content"></jsp:invoke>
		<!-- any data must be above or below these two files only -->
	</div>
</body>
</html>