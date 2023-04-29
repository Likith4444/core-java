package com.xworkz.laptop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.laptop.dto.LaptopDTO;
import com.xworkz.laptop.exception.LaptopException;
import com.xworkz.laptop.repository.LaptopRepository;

@Service
public class LaptopServiceImpl implements LaptopService{
	
	
	     @Autowired
	     LaptopRepository laptopRepo ; 

	@Override
	public LaptopDTO validateAndRegisterLaptop(LaptopDTO dto) {
		
		System.out.println("inside validateAndSave method of LaptopServiceImpl");
		try {
		
		boolean isCompanyNamePresent = false;
		boolean isModelNoPresent = false;
		boolean isColorPresent = false;
		boolean isProcessorPresent = false;
		boolean isRamPresent = false;
		
		
		if(dto.getCompanyName() != null && !dto.getCompanyName().isEmpty()) {
			System.out.println("comapanyName is not empty");
			isCompanyNamePresent = true;
		}
		if(dto.getModelNo() != null && !dto.getModelNo().isEmpty()) {
			System.out.println("modelNo is not empty");
			isModelNoPresent = true;
		}
		if(dto.getColor() != null && !dto.getColor().isEmpty()) {
			System.out.println("color is not empty");
			isColorPresent = true;
		}
		if(dto.getProcessor() != null && !dto.getProcessor().isEmpty()) {
			System.out.println("processor is not empty");
			isProcessorPresent = true;
		}
		if(dto.getRam() != null && !dto.getRam().isEmpty()) {
			System.out.println("ram is not empty");
			isRamPresent = true;
		}
		
		if( isCompanyNamePresent==true && isModelNoPresent==true && isColorPresent==true && isProcessorPresent==true && isRamPresent==true) {
	    laptopRepo.saveLaptop(dto);
		
		}
		
		return dto;
		
	}catch (Exception e) {
		System.out.println("invalid data...exception occured");
		e.printStackTrace();
		throw new LaptopException();
	}

	}

	@Override
	public List<LaptopDTO> getAllLaptopsSer() {
		
		System.out.println("Inside getAllLaptopsSer method");
		
		return laptopRepo.getAllLaptopsRep();
	}
}
