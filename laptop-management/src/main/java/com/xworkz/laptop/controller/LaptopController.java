package com.xworkz.laptop.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.laptop.dto.LaptopDTO;
import com.xworkz.laptop.service.LaptopService;

@Controller
@RequestMapping("/")
public class LaptopController {
	
	@Autowired
	LaptopService service ; 

	@PostMapping("/registerLaptop")
	//@RequestMapping(value = "/registerLaptop",method = RequestMethod.POST)
	public String registerLaptop(@ModelAttribute LaptopDTO dto , HttpServletRequest req) {
		//@ModelAttribute helps to convert form fields into object
		System.out.println("inside controller's registerLaptop method");
		if(dto != null) {
			
			       service.registerLaptop(dto);
			req.setAttribute("name", dto.getCompanyName());
			return "/success.jsp";
		}
		return "failure";
	}
	
}
