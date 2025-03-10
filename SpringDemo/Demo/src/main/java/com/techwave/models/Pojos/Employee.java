package com.techwave.models.Pojos;

import java.time.LocalDate;

public class Employee {
	private int empno;
	private String ename;
	private String gender;
	private String dob;
	public Employee() {
		super();
	}
	
	public Employee(int empno, String ename, String gender, String dob) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.gender = gender;
		this.dob = dob;
	}

	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
	
}
