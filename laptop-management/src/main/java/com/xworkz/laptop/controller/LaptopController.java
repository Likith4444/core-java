package com.xworkz.laptop.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

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
		
	@GetMapping("/searchByCompanyName")
	public String getLaptopByCompanyName(@RequestParam("companyName")String companyName, HttpServletRequest req1){
		
		System.out.println("Inside getLaptopByCompanyName method");
		List<LaptopDTO> d1 = service.getLaptopByCompanyNameSer(companyName);

	    req1.setAttribute("laptops", d1);
	             
		return "success";
		
	}
	
	@GetMapping("/update/{id}")
	public String getLaptopById(@PathVariable("id")int id, HttpServletRequest req1){
		
		System.out.println("Inside getLaptopById method");
		LaptopDTO dto = service.getLapatopByIdSer(id);

	    req1.setAttribute("laptop", dto);
	             
		return "update";
		
	}
	
	@PostMapping("/updatee")
	public String updateLaptopById(@ModelAttribute LaptopDTO dto, HttpServletRequest req2) {
		
		System.out.println("inside updateLaptopById method");
		LaptopDTO dtos = service.updateLaptopByIdServ(dto);
		req2.setAttribute("laptop", dtos);
		
		return "success";
		
	}
	
	@GetMapping("/delete/{id}")
	public  RedirectView deleteById(@PathVariable("id") int id,HttpServletRequest req) {
	List<LaptopDTO> list = service.deleteByLaptopIdServ(id);
		
		req.setAttribute("laptop", list);
		RedirectView rd = new RedirectView();
		System.out.println("....!!!!!!!...");
		rd.setUrl(req.getContextPath());
		rd.setUrl(req.getContextPath() + "/listOfLaptops");
		return rd;
		//redirect view
		//return "success";
		//css for register page
		//mail - jee
		//types of servers - 3 - web,application,database server
		//@WebServlet
		//JEE container is the one who will create the context servlet and config file (Servlet container)
		//context is an object created and this context contains the url and application name when method getContext is called
		//context is an url of the web application deployed
    }
		
	
	
}
