package com.techwave.controllers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.techwave.models.Bao.LogicLayer;
import com.techwave.models.Pojos.Employee;

@Controller
@RequestMapping("/sample")
public class SampleController {

	@RequestMapping("/display")
	public String display() {

		return "First";
	}

	// Send the data from controller to view Using Model Object

	@RequestMapping("/modelex")
	public String Modelex(Model M) {
		String s = "Hanu";
		M.addAttribute("var", s);
		return "ModelEx";
	}
	// Send the data from controller to view Using Modelandview Object
	@RequestMapping("/mv")
	public ModelAndView modelviewEx() {
		ModelAndView m = new ModelAndView("modelandview");
		m.addObject("var2", "Dead");
		return m;
	}
//	@RequestMapping("/so")
//	public String sendObject(Model m) {
//		Employee e=new Employee(1,"net","male",LocalDate.parse("2023-01-01"));
//		m.addAttribute("emp",e);
//		return "receiveObject";
//		
//	} 
//	@RequestMapping("/sos")
//	public String sendObjects(Model m) {
//		List<Employee> list=Arrays.asList(
//		
//			new Employee(1,"net","male",LocalDate.parse("2023-01-01")),
//			new Employee(2,"netfreak","female",LocalDate.parse("2024-01-01")),
//			new Employee(3,"nett","male",LocalDate.parse("2025-01-01")),
//			new Employee(4,"netfreaker","female",LocalDate.parse("2026-01-01"))
//		);
//		
//		m.addAttribute("emp",list);
//		return "receiveObjects";		
//	} 
	/*
	 * @RequestMapping("/ac") public String AcceptEmp() { return "acceptemp"; }
	 */
	
	  @RequestMapping(value = "getdata")
	  public String getData(@ModelAttribute("emp") Employee e,Model m)
	  { m.addAttribute("emp",e);
	  
	  return "receiveObject"; }
	  
	  @RequestMapping("/ae")
	  public String AcceptEmp() {
		  
		  return "acceptemployee";
	  }
	  @RequestMapping("/getEmployee")
	  public String getEmployee(@RequestParam("empid") int empid,
			  @RequestParam("ename") String ename,
			  @RequestParam("gender") String gender,
			  @RequestParam("dob") String dob,Model m) {
		  Employee e=new Employee(empid, ename, gender, dob);
		  m.addAttribute("emp",e);
		  return "receiveObject";
	  }
	  @RequestMapping("/pathVariable")
	  public String getPathVariable() {
		
		  return "getPathVariable";
	}
	  @RequestMapping("/printPathVariable/{eno}/{en}")
	  public String printPathVariable(@PathVariable int eno,@PathVariable String en) {
		  System.out.println("Emp No "+eno);
		  System.out.println("Emp Name "+en);
		  return "getPathVariable";
	}
	  @RequestMapping("/sob")
	  public String sendObjectss(Model m) {
		  LogicLayer l=new LogicLayer();
		  List<Employee> list=l.getList();
		  m.addAttribute("emp",list);
		  return "receiveObjects";
	  }
	 
}
