package DB;
import java.util.*;

import POJO.EmpDemo;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dboperations {
	Scanner S=new Scanner(System.in);
    Connection Con=null;
    PreparedStatement Pstmt=null;
public  String Insert(EmpDemo E) {
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
    	 DateTimeFormatter d1=DateTimeFormatter.ofPattern("dd-MMM-yyyy");


        Pstmt=Con.prepareStatement("insert into empdemo values(?,?,?,?,?,?,?,?)");
        Pstmt.setInt(1, E.getEmpno());
        Pstmt.setString(2, E.getEname());
        Pstmt.setString(3, E.getJob());
        Pstmt.setInt(4, E.getMgr());
        Pstmt.setString(5, d1.format(E.getHiredate()));
        Pstmt.setInt(6, E.getSal());
        Pstmt.setInt(7, E.getComm());
        Pstmt.setInt(8, E.getDeptno());
        int R =Pstmt.executeUpdate();
        return R+" rows inserted";
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        return e.getMessage();
    }
    finally {
        try {
            Con.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

 

    
    }

    }
}
