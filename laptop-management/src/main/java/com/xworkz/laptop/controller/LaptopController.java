package com.xworkz.laptop.controller;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.laptop.dto.LaptopDTO;
import com.xworkz.laptop.service.LaptopService;

@RequestMapping("/")
@Controller
@Component
public class LaptopController {
	
	@Autowired
	LaptopService service ; 
	
	public LaptopController() {
		System.out.println(this.getClass() + "object is created");
	}
	
	//@RequestMapping(value = "/registerLaptop",method = RequestMethod.POST)
	
	@PostMapping("/registerLaptop")
	public String registerLaptop(@ModelAttribute LaptopDTO dto , HttpServletRequest req) {
		
		//@ModelAttribute helps to convert form fields into object
		System.out.println("inside controller's registerLaptop method");
		if(dto != null) {
			
			service.validateAndRegisterLaptop(dto);
			req.setAttribute("name", dto.getCompanyName());
			
			return "success";
		}
		return "failure";
	}
	
	@GetMapping("/listOfLaptops")
	public String getAllLaptops( HttpServletRequest req) {
		
		System.out.println("Inside getAllLaptops method");
			
		List<LaptopDTO> dtos = service.getAllLaptopsSer();

	            	 req.setAttribute("laptops", dtos);
	             
		return "success";
		
		
	}
	
}
