package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class DboperationsAssignment {

	
	    
	public  List<String> select(int deptno) {
		Connection Con=null;
	    PreparedStatement Pstmt=null;
	    ResultSet resultSet=null;
	    List<String> results = new ArrayList<>();
	    try {
	        Class.forName("oracle.jdbc.driver.OracleDriver");
	    } catch (ClassNotFoundException e) {
	        // TODO Auto-generated catch block
	        System.out.println("Driver Error");
	    }
	    //Step 2
	    //Create Connection
	    try {
	        Con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Admin#123");
	    } catch (SQLException e) {
	        // TODO Auto-generated catch block
	        System.out.println("Connection Error");
	    }
	    try {
	    	String query="SELECT * from empdemo WHERE deptno=?";
	    	


	        Pstmt=Con.prepareStatement(query);
	        Pstmt.setInt(1, deptno);
	        resultSet=Pstmt.executeQuery();
	         while (resultSet.next()) {
					String result = "EmpNO: " + resultSet.getInt(1) + " EmployeeName: " + resultSet.getString(2) + " Job: "
							+ resultSet.getString(3) + " Mgr: " + resultSet.getInt(4) + " Date: " + resultSet.getDate(5)
							+ " Salary: " + resultSet.getInt(6) + " COMM: " + resultSet.getInt(7) + " DeptNO: "
							+ resultSet.getInt(8);
					results.add(result);
				}
	        	
	        
	        
	        
	    } catch (SQLException e) {
	        // TODO Auto-generated catch block
	        System.out.println("ERror in prepares statement: "+e.getMessage());
	    }
	    finally 
	    {
	        try {
	        	Pstmt.close();
	            Con.close();
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }

	 

	    
	    }
		return results;
		

	    }
	public List<String> betweenDates(LocalDate stdate,LocalDate edDate) {
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		
		Connection Con=null;
	    PreparedStatement Pstmt=null;
	    ResultSet resultSet=null;
	    List<String> results = new ArrayList<>();
	    try {
	        Class.forName("oracle.jdbc.driver.OracleDriver");
	    } catch (ClassNotFoundException e) {
	        // TODO Auto-generated catch block
	        System.out.println("Driver Error");
	    }
	    //Step 2
	    //Create Connection
	    try {
	        Con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Admin#123");
	    } catch (SQLException e) {
	        // TODO Auto-generated catch block
	        System.out.println("Connection Error");
	    }
	    try {

	    	String query="SELECT * from empdemo WHERE hiredate between ? and ?";
	        Pstmt=Con.prepareStatement(query);
	        Pstmt.setString(1,df.format(stdate));
	        Pstmt.setString(2,df.format(edDate));
	        resultSet=Pstmt.executeQuery();
	         while (resultSet.next()) {
					String result = "EmpNO: " + resultSet.getInt(1) + " EmployeeName: " + resultSet.getString(2) + " Job: "
							+ resultSet.getString(3) + " Mgr: " + resultSet.getInt(4) + " Date: " + resultSet.getDate(5)
							+ " Salary: " + resultSet.getInt(6) + " COMM: " + resultSet.getInt(7) + " DeptNO: "
							+ resultSet.getInt(8);
					results.add(result);
				}
	        	
	        
	        
	        
	    } catch (SQLException e) {
	        // TODO Auto-generated catch block
	        System.out.println("ERror in prepares statement: "+e.getMessage());
	    }
	    finally 
	    {
	        try {
	        	Pstmt.close();
	            Con.close();
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }

	 

	    
	    }
		return results;
		

	}
}
