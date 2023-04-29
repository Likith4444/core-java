package com.xworkz.laptop.service;

import java.util.List;

import com.xworkz.laptop.dto.LaptopDTO;

public interface LaptopService {
	
	
	 LaptopDTO  validateAndRegisterLaptop(LaptopDTO dto);

	 List<LaptopDTO> getAllLaptopsSer();
}
