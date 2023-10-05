package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.EmployeeEntityt;
import com.example.service.EserInter;


import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/liki/thu/h")
@AllArgsConstructor
public class MyControlller {

	
	public EserInter ec;
	
	@PostMapping()
	public EmployeeEntityt save(@RequestBody EmployeeEntityt en) {
		System.out.println("controller");
		EmployeeEntityt ent = ec.save(en);
		return ent;
	}
	
	@GetMapping("/{id}")
	public EmployeeEntityt getAll(@PathVariable int id){
		return ec.getAll(id);
		
	}
	@PutMapping()
	public EmployeeEntityt update(@RequestBody EmployeeEntityt en) {
		
		return ec.update(en);
		
	}
	@DeleteMapping("/{id}")
	public EmployeeEntityt delete(@PathVariable int id) {
		
		return ec.delete(id);
	}
	
}
