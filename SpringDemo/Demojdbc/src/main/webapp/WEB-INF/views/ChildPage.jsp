<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib tagdir="/WEB-INF/tags/" prefix="m" %>
<m:master title="ChildPage">

<jsp:attribute name="head">
<!-- In case if we want to write java or css or js code we can write -->


</jsp:attribute>
<jsp:attribute name="content">
<h1>
Hello
</h1>

<form  >
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

</form>

</jsp:attribute>
</m:master>