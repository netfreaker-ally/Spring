package com.techwave.models.Dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.dao.DataAccessException;
import org.springframework.format.datetime.joda.LocalDateParser;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import com.techwave.models.Pojos.empdemo;

public class EmployeeDao implements IEmployee {
JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@SuppressWarnings("unchecked")
	@Override
	public String insertEmp(final empdemo e) {
		// TODO Auto-generated method stub
		//Date dt = new Date(e.getHiredate().toEpochDay());

		String query="insert into empdemo values(?,?,?,?,?,?,?,?)";
		//String query="insert into empdemo values("+e.getEmpno+",'"+e.getEname+"',..);
		
		Object[] o= {e.getEmpno(),e.getEname(),e.getJob(),e.getMgr(),e.getHiredate(),e.getSal(),e.getComm(),e.getDeptno()};
		
		int r=jdbcTemplate.update(query,o);
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
		
		return r+"1 row inserted";
	}
	

}
