package com.xworkz.laptop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.laptop.dto.LaptopDTO;
import com.xworkz.laptop.repository.LaptopRepository;

@Service
public class LaptopServiceImpl implements LaptopService{
	
	
	     @Autowired
	     LaptopRepository laptopRepo ; 

	@Override
	public LaptopDTO registerLaptop(LaptopDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
