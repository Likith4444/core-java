package com.xworkz.patientDetails.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.xworkz.patientDetails.dto.PatientsDTO;
import com.xworkz.patientDetails.service.PatientsService;

@Component
@Controller
@RequestMapping("/")
public class PatientsController {
	
	@Autowired
	PatientsService service;

	public PatientsController() {
		
		System.out.println(this.getClass() + "object is created");
	}
	
	@PostMapping("/registerPatients")
	public String registerPatient(@ModelAttribute PatientsDTO dto, HttpServletRequest req) {
		
		System.out.println("inside registerPatient method");
		if(dto != null) {
			
			service.validateAndRegisterPatient(dto);
			req.setAttribute("name", dto.getPatientName());
			
			return "entryPage";
		}
		return "failure";
	}
	
	@GetMapping("/listOfPatients")
	public String getAllPatients( HttpServletRequest req) {
		
		System.out.println("Inside getAllPatients method");
		List<PatientsDTO> dto = service.getAllPatientsSer();
		req.setAttribute("patients", dto);
	             
		return "entryPage";
	}
	
	@GetMapping("/searchByPatientName")
	public String getLaptopByCompanyName(@RequestParam("patientName")String patientName, HttpServletRequest req1){
		
		System.out.println("Inside getLaptopByCompanyName method");
		List<PatientsDTO> d1 = service.getPatientByPatientNameSer(patientName);

	    req1.setAttribute("patients", d1);
	             
		return "entryPage";
		
	}
	
	@GetMapping("/update/{id}")
	public String getPatientById(@PathVariable("id")int id, HttpServletRequest req1){
		
		System.out.println("Inside getLaptopById method");
		PatientsDTO dto = service.getPatientByIdSer(id);
	    req1.setAttribute("patient", dto);
	             
		return "updatePage";
		
	}
	
	@PostMapping("/updatee")
	public String updateLaptopById(@ModelAttribute PatientsDTO dto, HttpServletRequest req2) {
		
		System.out.println("inside updateLaptopById method");
		PatientsDTO dtos = service.updatePatientByIdServ(dto);
		req2.setAttribute("patient", dtos);
		
		return "entryPage";
		
	}
	
	@GetMapping("/delete/{id}")
	public  RedirectView deleteById(@PathVariable("id") int id,HttpServletRequest req) {
	List<PatientsDTO> list = service.deleteByPatientIdServ(id);
		
		req.setAttribute("patient", list);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(req.getContextPath());
		redirectView.setUrl(req.getContextPath() + "/listOfPatients");
		return redirectView;
		
    }
		
	
}
