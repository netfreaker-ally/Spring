<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="DB.DboperationsAssignment,java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
    <% int deptno = 0;
    List<String> resultSet = null;

    try {
        String selectedDept = request.getParameter("dept");

        if (selectedDept != null) {
            if (selectedDept.equals("dept10")) {
                deptno = 10;
            } else if (selectedDept.equals("dept20")) {
                deptno = 20;
            } else if (selectedDept.equals("dept30")) {
                deptno = 30;
            }
        }

        DboperationsAssignment db = new DboperationsAssignment();
        resultSet = db.select(deptno);
        RequestDispatcher rd=request.getRequestDispatcher("/assignmentJsp.jsp");
        rd.include(request, response);
        for(String str:resultSet){
        	out.write(str+"<br/>");
        }
    } catch (NumberFormatException e) {
        out.println("Error in accessing: " + e.getMessage());
    }
    %>

   

</body>
</html>
