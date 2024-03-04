package com.techwave.controllers;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techwave.Models.Bao.EmpBao;
import com.techwave.Models.Pojos.Emp;
@Controller
public class EmpController {

	EmpBao empBao;

	public EmpBao getEmpBao() {
		return empBao;
	}
	@Autowired
	public void setEmpBao(EmpBao empBao) {
		this.empBao = empBao;
	}
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		//binder.setDisallowedFields(new String[] {"hiredate"});
		//for date
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class,"hiredate",new CustomDateEditor(sdf,false));
	}
	@RequestMapping("/")

    public String getEmployees()

    {        
        return "GetAll";

    }

    @RequestMapping("getall")

    public String getall(Model M)

    {
 
        M.addAttribute("list",empBao.getEmployees());

        return "GetAll";

    }
    
    @RequestMapping("getDeptData")
    public String getDeptData(Model m) {
    	m.addAttribute("dlist",empBao.getByDept());
    	return "getByDept";
    }
    @RequestMapping("fetchByDeptNo")
    public String getBydept(@RequestParam("deptno") int deptno,Model m) {
    	m.addAttribute("dlist",empBao.getByDept());
    	m.addAttribute("elist", empBao.getByDept(deptno));
    	m.addAttribute("dno", deptno);
    	return "getByDept";
	}
    @RequestMapping("insert")
    public String ins() {
    	return "insert";
    }
//    @RequestMapping("insertMain")
//    public String insert(@RequestParam("empno") int empno,@RequestParam("ename") String ename,
//    		@RequestParam("job") String job,@RequestParam("mgr") int mgr,@RequestParam("hiredate") String hiredate,
//    		@RequestParam("sal") int sal,@RequestParam("comm") int comm,@RequestParam("deptno") int deptno,Model m) throws ParseException {
//    	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//    	Date d= sdf.parse(hiredate);
//    	
//    	m.addAttribute("output", empBao.insert(new Emp(empno, ename, job, mgr, d, sal, comm, deptno)));
//		return "insert";
//    }
    @RequestMapping("insertMain")
    public String insert(@ModelAttribute("emp") Emp emp,@RequestParam("hiredate") String hr,Model m) throws ParseException {
    	//SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
    	
    	//emp.setHireDate(LocalDate.parse(hr)) for LocalDate
    	
    	// emp.setHiredate(sdf.parse(hr)); //or //for date,time see above in init binder
    		
    	 m.addAttribute("output", empBao.insert(emp));
    	return "insert";
    }
    @RequestMapping("update")
    public String update() {
    	return "update";
    }
    @RequestMapping("updatebyEmpNo")
    public String updateByEmpNo(@RequestParam("empid") int empid,Model m) {
		m.addAttribute("list", empBao.getByEmpNo(empid));
    	return "update";
    	
    }
    @RequestMapping("updateDetails")
    public String updateDetails(@ModelAttribute("emp") Emp emp,Model m) {
    	System.out.println(emp.getSal());
    	m.addAttribute("output", empBao.updateEmp(emp, emp.getEmpno()));
    	return "update";
    }
    
    
}
