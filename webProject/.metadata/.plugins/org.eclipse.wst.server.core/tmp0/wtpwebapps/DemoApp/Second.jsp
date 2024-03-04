<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
Connection con=null;
%>
<% 
int a=10;

out.write("Hello "+a); 
%>
<h1>Your Score is <%=a %></h1>
</body>
</html>