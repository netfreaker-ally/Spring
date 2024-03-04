package com.techwave.models.Dao;

import java.util.Arrays;
import java.util.List;

import com.techwave.models.Pojos.Employee;

public class DataAccess {
		public List<Employee> getList() {
			List<Employee> list=Arrays.asList(
				
					new Employee(1,"net","male","23-01-01"),
					new Employee(2,"netfreak","female","2024-01-01"),
					new Employee(3,"nett","male","2024-01-01"),
					new Employee(4,"netfreaker","female","2024-01-01")
				);
			return list;
		}
}
