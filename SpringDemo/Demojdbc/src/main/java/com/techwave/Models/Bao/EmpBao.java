package com.techwave.Models.Bao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.techwave.Models.Dao.IEmpDao;
import com.techwave.Models.Pojos.Dept;
import com.techwave.Models.Pojos.Emp;

public class EmpBao {
	IEmpDao empDao;

    public List<Emp>getEmployees(){

        return empDao.getEmployess();

        

    }

    public IEmpDao getEmpDao() {

        return empDao;

    }

    @Autowired

    public void setEmpDao(IEmpDao empDao) {

        this.empDao = empDao;

    }
    public List<Dept> getByDept() {

        return empDao.getByDept();

    }
    public List<Emp> getByDept(int deptno) {
		return empDao.getByDept(deptno);
	}
    public String insert(Emp e) {
		return empDao.insertEmp(e);
	}
    public List<Emp> getByEmpNo(int empno) {
		return empDao.getByEmpNo(empno);
	}
    public String updateEmp(Emp e, int empno) {
    	return empDao.updateEmp(e, empno);
    }
    
}
