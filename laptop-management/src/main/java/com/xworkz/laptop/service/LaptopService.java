package com.xworkz.laptop.service;

import java.util.List;

import com.xworkz.laptop.dto.LaptopDTO;

public interface LaptopService {
	
	boolean sendMail(String emailId);
	
	 LaptopDTO  validateAndRegisterLaptop(LaptopDTO dto);

	 List<LaptopDTO> getAllLaptopsSer();

	List<LaptopDTO> getLaptopByCompanyNameSer(String companyName);

	LaptopDTO getLapatopByIdSer(int id);

	LaptopDTO updateLaptopByIdServ(LaptopDTO dto);
}
