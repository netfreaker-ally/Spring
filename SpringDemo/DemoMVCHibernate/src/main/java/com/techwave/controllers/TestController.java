package com.techwave.controllers;

import java.util.Scanner;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techwave.Models.Dao.Service.IVendor;

import com.techwave.Models.Pojos.Vendor;

@Controller
public class TestController {
	
	@Autowired
	IVendor vendorServiceImpl;
		@RequestMapping("/")
		public String Test(Model m) {
			m.addAttribute("v",new Vendor());
			return "VendorPg";
		}
		@RequestMapping(value = "/insert",method = RequestMethod.POST )
		public String Test2(@Valid @ModelAttribute("v") Vendor v,BindingResult result) {
//			m.addAttribute("v",new Vendor());
			if(result.hasErrors()) {
				return "VendorPg";
			}else {
				vendorServiceImpl.insertVenodor(v);
				return "home";
			}
		
		}
		 
		@RequestMapping("getByVendorId")
		public String getById(Model m) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Id: ");
			int id = scanner.nextInt();
			scanner.nextLine();
			m.addAttribute("v",vendorServiceImpl.getByVendorId(id));
			scanner.close();
			return "getall";
		}            
		@RequestMapping("update")
		public String update(Model m) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Id: ");
			int id = scanner.nextInt();
			scanner.nextLine();
			m.addAttribute("v",vendorServiceImpl.getByVendorId(id));
			scanner.close();
			
			return "update2";
			
		}
		
		@RequestMapping("updateById")
		public String updatee(@ModelAttribute("v") Vendor v,Model m) 
		{
			m.addAttribute("msg",vendorServiceImpl.updateVenodor(v));
			return "update2";
		 
		 }
		 
		
}
