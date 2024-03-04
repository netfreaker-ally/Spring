package com.techwave.Models.Bao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.techwave.Models.Pojos.Dept;

public class DeptMapper implements RowMapper<Dept> {

	@Override
	public Dept mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Dept d=new Dept();
		d.setDeptno(rs.getInt(1));
		d.setDname(rs.getString(2));
		d.setLoc(rs.getString(3));
		
		
		return d;
	}

}
