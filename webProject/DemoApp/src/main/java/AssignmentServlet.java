import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DB.DboperationsAssignment;

@WebServlet("/AssignmentServlet")
public class AssignmentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public AssignmentServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        int deptno = 0;
        LocalDate startDate = null;
        LocalDate endDate = null;
        String selectedDept = request.getParameter("dept");

        try {
            DboperationsAssignment db = new DboperationsAssignment();
            RequestDispatcher rd = request.getRequestDispatcher("/Assignment.html");
            rd.include(request, response);

            if (selectedDept != null) {
                if (selectedDept.equals("dept10")) {
                    deptno = 10;
                } else if (selectedDept.equals("dept20")) {
                    deptno = 20;
                } else if (selectedDept.equals("dept30")) {
                    deptno = 30;
                }

                List<String> resultset = db.select(deptno);
                for (String string : resultset) {
                    out.write(string + "<br/>");
                }
            }

            String startDateStr = request.getParameter("hiredate1");
            String endDateStr = request.getParameter("hiredate2");

            if (startDateStr != null && endDateStr != null ) {
                startDate = LocalDate.parse(startDateStr);
                endDate = LocalDate.parse(endDateStr);

                List<String> output = db.betweenDates(startDate, endDate);
                out.write("<br/>");
                out.write("By Dates <br/>");
                if(output.isEmpty()) {
                	out.write("No dates are between "+startDate+"and "+endDate);
                }
                else
                {
                for (String string : output) {
                    out.write(string + "<br/>");
                	}
                }
            }
        } catch (Exception e) {
            System.out.println("Error in accessing: " + e.getMessage());
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
