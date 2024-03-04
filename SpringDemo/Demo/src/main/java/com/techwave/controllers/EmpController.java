package com.techwave.controllers;

import java.sql.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techwave.models.Bao.EmpBao;
import com.techwave.models.Pojos.empdemo;

@Controller
@RequestMapping("/emp")
public class EmpController {
	@RequestMapping("/insertemp")
	public String insertEmp() {
		
		return "insert";
	}
	@RequestMapping("/getemp")
	public String getemp(@ModelAttribute("e") empdemo e,Model m) {
		EmpBao eb=new EmpBao();		
		m.addAttribute("output",eb.insertEmp(e));
		
		return "insert";
	}
	
	
}
