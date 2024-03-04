<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib tagdir="/WEB-INF/tags/" prefix="a"%>
<a:master title="Login">
	<jsp:attribute name="head">
	<script
			src="${pageContext.request.contextPath}/Scripts/LoginValidation.js"
			type="text/javascript">
			var msg = document.getElementById("msg");

	</script>
	
	
	</jsp:attribute>
	<jsp:attribute name="content">
    <form action="home" method="post">
    <div id="msg"></div>
    <table>
    <tr>
					<td>Login</td>
					<td><input type="text" name="username" ></td>
					<td></td>
				</tr>
	<tr>
					<td>Password</td>
					<td><input type="password" name="password"></td>
					<td></td>
				</tr>
   <tr>
   <td><input type="hidden" name="msg" value="${msg}"></td>
   		<td><input type="submit" onclick="return Validate();"></td>
   		<td><input type="reset"></td>
   		<%-- <td><input type="text" value="${msg}" id="msg"></td> --%>
   		</tr>
   
    </table>
    
    </form>
  </jsp:attribute>
</a:master>