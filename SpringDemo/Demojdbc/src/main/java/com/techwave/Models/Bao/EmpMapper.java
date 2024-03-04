package com.techwave.Models.Bao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.techwave.Models.Pojos.Emp;

public class EmpMapper implements RowMapper<Emp>{

	@Override
	public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Emp E=new Emp();
		E.setEmpno(rs.getInt("empno"));

        E.setEname(rs.getString("ename"));

        E.setJob(rs.getString("job"));

        E.setMgr(rs.getInt("mgr"));

        E.setHiredate(rs.getDate("hiredate"));
        //E.setHiredate(rs.getDate.toDate("hiredate"));

        E.setComm(rs.getInt("comm"));

        E.setSal(rs.getInt("sal"));

        E.setDeptno(rs.getInt("Deptno"));

        return E;
	}

}
