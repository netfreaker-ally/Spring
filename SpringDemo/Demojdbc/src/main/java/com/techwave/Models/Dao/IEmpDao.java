package com.techwave.Models.Dao;

import java.util.List;

import com.techwave.Models.Pojos.Dept;
import com.techwave.Models.Pojos.Emp;

public interface IEmpDao {
	public List<Emp> getEmployess();
	public Emp getEmployeeById(int id);
	public String insertEmp(Emp e);
	public String updateEmp(Emp e,int empno);
	public String deleteEmp(int id);
	List<Dept> getByDept();
	List<Emp> getByDept(int deptno);
	public String insertEmpPrepared(Emp e);
	List<Emp> getByEmpNo(int empno);

}
