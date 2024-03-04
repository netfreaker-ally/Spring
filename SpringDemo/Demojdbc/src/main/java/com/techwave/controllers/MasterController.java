package com.techwave.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
@SessionAttributes("username")
@Controller
public class MasterController {
	@RequestMapping("/master")
	public String masterpg() {
		return "ChildPage";
	}
	@RequestMapping("/aboutus")
	public String aboutus() {
		return "aboutus";
	}
	@RequestMapping("/services")
	public String services() {
		return "services";
	}
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/home")
	public String Home(@RequestParam("username") String username,@RequestParam("password") String password,@RequestParam("msg") String msg,Model m) {
		/*
		 * if(username.equals("xyz") && password.equals("abc")) {
		 * m.addAttribute("username", username); return "homepage"; }else { return
		 * "login"; }
		 */
		System.out.println(msg);
		if(msg.length()!=0)
		{
			
			 return "login";
		}
		else if (username == null || username.isEmpty()) {
			// The user did not enter a username
			return "login";
		}
		else
		{
			 m.addAttribute("username", username);
			 return "homepage"; 
		}
	}
}
