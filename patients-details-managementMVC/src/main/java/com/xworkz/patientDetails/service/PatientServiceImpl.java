package com.xworkz.patientDetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.patientDetails.dto.PatientsDTO;
import com.xworkz.patientDetails.exception.PatientsException;
import com.xworkz.patientDetails.repository.PatientsRepository;

@Service
public class PatientServiceImpl implements PatientsService{

	@Autowired
	PatientsRepository repo;
	
	@Override
	public PatientsDTO validateAndRegisterPatient(PatientsDTO dto) {
		
		System.out.println("inside validateAndRegisterPatient method");
		try {
		
		boolean isPatientNamePresent = false;
		boolean isRoomNoPresent = false;
		boolean isAddressPresent = false;
		boolean isGenderPresent = false;
		boolean isAgePresent = false;
		
		if(dto.getPatientName() != null && !dto.getPatientName().isEmpty()) {
			isPatientNamePresent = true;
		}
		if(dto.getRoomNo() > 0) {
			isRoomNoPresent = true;
		}
		if(dto.getPatientAddress() != null && !dto.getPatientAddress().isEmpty()) {
			isAddressPresent = true;
		}
		if(dto.getGender() != null) {
			isGenderPresent = true;
		}
		if(dto.getAge() > 0) {
			isAgePresent = true;
		}
		
		if( isPatientNamePresent==true && isRoomNoPresent==true && isAddressPresent==true && isGenderPresent==true && isAgePresent==true) {
			
			repo.savePatient(dto);
		
		}
		return dto;
		
	    }catch (Exception e) {
		   System.out.println("exception occured");
		   e.printStackTrace();
		   throw new PatientsException();
	      }
		
	}

	@Override
	public List<PatientsDTO> getAllPatientsSer() {
		
		return repo.getAllPatientsRepo();
	}

	@Override
	public List<PatientsDTO> getPatientByPatientNameSer(String patientName) {
		
		return repo.getPatientByPatientNameRepo(patientName);
	}

	@Override
	public PatientsDTO getPatientByIdSer(int id) {
		
		return repo.getPatientByIdRepo(id);
	}

	@Override
	public PatientsDTO updatePatientByIdServ(PatientsDTO dto) {
		
		return repo.updatePatientByIdRepo(dto);
	}

	@Override
	public List<PatientsDTO> deleteByPatientIdServ(int id) {
		
		return repo.deleteByPatientIdServ(id);
	}

	
	
}
