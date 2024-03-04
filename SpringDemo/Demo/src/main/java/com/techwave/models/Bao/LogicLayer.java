package com.techwave.models.Bao;

import java.util.List;

import com.techwave.models.Dao.DataAccess;
import com.techwave.models.Pojos.Employee;

public class LogicLayer {
	public List<Employee> getList(){
		DataAccess d=new DataAccess();
		return d.getList();
	}
}
