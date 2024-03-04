

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DB.Dboperations;
import POJO.EmpDemo;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	private String str="";
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		str+="Init Method";
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.setContentType("text/html");
//		PrintWriter p=response.getWriter();
//		str+="Service Method: ";
//		
//		p.write(str);
//	}

//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
////	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
//		response.setContentType("text/html");
//		PrintWriter p=response.getWriter();
//		str+="doGet Method: ";
//		
//		p.write(str);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
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
		  RequestDispatcher rd=request.getRequestDispatcher("/First.html");		 
		  rd.forward(request, response);
		  out.print(message);
		  
		
	}

	/**
 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
		//str+="Post Method: ";
		doGet(request, response);
//		response.setContentType("text/html");
//		PrintWriter p=response.getWriter();
//		str+="doPost Method: ";
//		
//		p.write(str);
	}

}
