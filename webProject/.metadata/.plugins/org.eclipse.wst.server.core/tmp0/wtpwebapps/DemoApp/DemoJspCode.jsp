<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="POJO.EmpDemo,DB.Dboperations,java.time.LocalDate,java.time.format.DateTimeFormatter"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
EmpDemo e=new EmpDemo();
e.setEmpno(Integer.parseInt(request.getParameter("empno")));
e.setEname(request.getParameter("ename"));
e.setJob(request.getParameter("job"));
e.setMgr(Integer.parseInt(request.getParameter("mgr")));
DateTimeFormatter d=DateTimeFormatter.ofPattern("yyyy-MM-dd");
DateTimeFormatter d1=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
LocalDate l=LocalDate.parse(request.getParameter("hiredate"), d);	 
e.setHiredate(l);
e.setSal(Integer.parseInt(request.getParameter("sal")));
e.setComm(Integer.parseInt(request.getParameter("comm")));
e.setDeptno(Integer.parseInt(request.getParameter("deptno")));
Dboperations D=new Dboperations();
String message=D.Insert(e);	

RequestDispatcher rd=request.getRequestDispatcher("/FirstJspExample.html");
rd.include(request, response);
out.write(message);
%>
</body>
</html>