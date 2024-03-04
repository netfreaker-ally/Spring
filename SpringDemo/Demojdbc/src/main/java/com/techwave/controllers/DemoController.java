package com.techwave.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
@SessionAttributes({"FN","lastname"})
@Controller
public class DemoController {
	@RequestMapping("/page1")
	public String demo() {
		return "page1";
	}
	@RequestMapping("/page2")
	public String demo2(Model m,@RequestParam("firstname") String firstname,@RequestParam(
			"lastname") String lastname) {
		
		m.addAttribute("firstname",firstname );
		m.addAttribute("lastname", lastname);
		return "page1";
	}
	@RequestMapping("/page3")
	public String demo3() {
		return "page3";
	}
	@RequestMapping("/test1")
	public String Test1() {
		return "Test1";
	}
	@RequestMapping("/test2")
	public String Test2(Model m,@RequestParam("firstname") String firstname,@RequestParam(
			"lastname") String lastname) {
		m.addAttribute("FN",firstname );
		m.addAttribute("lastname", lastname);
		return "Test1";
	}
	@RequestMapping("/test3")
	public String Test3() {
		return "Test3";
	}
	@RequestMapping("/test4")
	public String Test4() {
		return "Test4";
	}
}
