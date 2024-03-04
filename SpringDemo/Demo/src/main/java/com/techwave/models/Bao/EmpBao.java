package com.techwave.models.Bao;

import com.techwave.models.Dao.EmployeeDao;
import com.techwave.models.Pojos.empdemo;

public class EmpBao {
	public String  insertEmp(empdemo e) {
		EmployeeDao ed=new EmployeeDao();
		return ed.insertEmp(e);
	}
}
