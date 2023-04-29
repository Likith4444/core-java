package com.xworkz.laptop.repository;

import java.util.List;

import com.xworkz.laptop.dto.LaptopDTO;

public interface LaptopRepository {

	LaptopDTO saveLaptop(LaptopDTO dto);
	
	List<LaptopDTO> getAllLaptopsRep();

}
