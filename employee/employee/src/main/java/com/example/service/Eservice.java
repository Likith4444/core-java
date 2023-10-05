package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.EmployeeEntityt;
import com.example.repo.Erepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class Eservice implements EserInter{

	public Erepo re;

	@Override
	public EmployeeEntityt save(EmployeeEntityt en) {
		
			System.out.println("service");
			return re.save(en);
		}

	@Override
	public EmployeeEntityt getAll(int id) {

		return re.findById(id).orElse(null);
	}


	@Override
	public EmployeeEntityt update(EmployeeEntityt ent) {
		// TODO Auto-generated method stub
		EmployeeEntityt entity = re.findById(ent.getId()).orElse(null);
		entity.setE_name(ent.getE_name());
		entity.setSalary(ent.getSalary());
		
		return re.save(entity) ;
	}

	@Override
	public EmployeeEntityt delete(int id ) {
		re.deleteById(id);
		return null;
	}

		

}
	
	
	
	

