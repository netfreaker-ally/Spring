package com.techwave.Models.Dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import com.techwave.Models.Bao.DeptMapper;
import com.techwave.Models.Bao.EmpMapper;
import com.techwave.Models.Pojos.Dept;
import com.techwave.Models.Pojos.Emp;

public class EmpOperations implements IEmpDao{
	JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Emp> getEmployess() {
		// TODO Auto-generated method stub
		
		String query="SELECT * from empdemo";
		List<Emp> list= jdbcTemplate.query(query, new EmpMapper());
		return list;
	}

	@Override
	public Emp getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String insertEmp(Emp e) {
		//DateTimeFormatter D=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		//and for date SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		// String d=sdf.format(e.getHireDate);
		//String d=D.format(e.getHireDate());
		//String query="insert into empdemo values("+e.getEmpno+",'"+e.getEname+"',..);
		String query="insert into empdemo values(?,?,?,?,?,?,?,?)";
		Object[] o= {e.getEmpno(),e.getEname(),e.getJob(),e.getMgr(),e.getHiredate(),e.getSal(),e.getComm(),e.getDeptno()};
		//Object[] o= {e.getEmpno(),e.getEname(),e.getJob(),e.getMgr(),d,e.getSal(),e.getComm(),e.getDeptno()};
		/*
		 * int r=jdbcTemplate.execute(query,new PreparedStatementCallback() {
		 * 
		 * @Override public Object doInPreparedStatement(PreparedStatement ps) throws
		 * SQLException, DataAccessException { // TODO Auto-generated method stub
		 * ps.setInt(1, e.getEmpno()); ps.setString(2, e.getEname());
		 * 
		 * 
		 * return ps.executeUpdate(); } });
		 */
		
		
		int r=jdbcTemplate.update(query,o);
		
		// TODO Auto-generated method stub
		return r+" row inserted ";
	}

	@Override
	public String updateEmp(Emp e, int empno) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		String d=sdf.format(e.getHiredate());
		String query="update empdemo set empno=?,ename=?,job=?,"
				+ "mgr=?,hiredate=?,sal=?,comm=?,deptno=? where empno=?";
		Object[] o= {e.getEmpno(),e.getEname(),e.getJob(),e.getMgr(),d,e.getSal(),e.getComm(),e.getDeptno(),empno};
		int r=jdbcTemplate.update(query,o);
		return r+ " row updated";
	}

	@Override
	public String deleteEmp(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Dept> getByDept() {
		// TODO Auto-generated method stub
		String query="SELECT * from Dept";
		List<Dept> list= jdbcTemplate.query(query, new DeptMapper());
		return list;
	}
	@Override
	public List<Emp> getByDept(int deptno) {
		// TODO Auto-generated method stub
		String query="SELECT * from empdemo where deptno=?";
		List<Emp> list=jdbcTemplate.query(query, new EmpMapper(),deptno);
		return list;
	}
	@Override
	public String insertEmpPrepared(final Emp e) {
		// TODO Auto-generated method stub
		String query="insert into empdemo values(?,?,?,?,?,?,?,?)";
		return jdbcTemplate.execute(query, new PreparedStatementCallback<String>() {

			@Override
			public String doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
				ps.setInt(1, e.getEmpno());
				ps.setString(2, e.getEname());
				ps.setString(3, e.getJob());
				ps.setInt(4, e.getMgr());
				ps.setString(5, sdf.format(e.getHiredate()));
				ps.setInt(6, e.getSal());
				ps.setInt(7, e.getComm());
				ps.setInt(8, e.getDeptno());
				try {
					 ps.execute();
					 return "1 row inserted: ";
				} catch (Exception e2) {
					// TODO: handle exception
					return e2.getMessage();
				}
			}
		});
		
		
	}
	@Override
	public List<Emp> getByEmpNo(int empno) {
		// TODO Auto-generated method stub
		String query="Select * from empdemo where empno=?";
		List<Emp> list=jdbcTemplate.query(query, new EmpMapper(),empno);
		
		return list;
	}

}
