package com.techwave.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

//@SessionAttributes("FN")
@Controller
public class TestController {
	
	@RequestMapping("/test5")
	public String Test5(Model m,HttpSession s) {
		System.out.println(m.getAttribute("FN"));
		System.out.println(s.getAttribute("FN"));
		return "test5";
	}
	@RequestMapping("/test6")
	public String Test6(Model m,@SessionAttribute("FN") String s,@SessionAttribute("lastname") String l) {
		System.out.println(m.getAttribute("FN"));
		System.out.println(s+"  "+l);
		
		return "test6";
	}
}
