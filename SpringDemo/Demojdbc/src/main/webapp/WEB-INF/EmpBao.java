package com.techwave.Models.Bao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.techwave.Models.Dao.IEmpDao;
import com.techwave.Models.Pojos.Emp;

public class EmpBao {
	@Autowired
	IEmpDao empDao;
	public List<Emp> getEmployees() {
		
		return empDao.getEmployess();		
	}
	public IEmpDao getEmpDao() {
		return empDao;
	}
	@Autowired
	public void setEmpDao(IEmpDao empDao) {
		this.empDao = empDao;
	}
	
}
