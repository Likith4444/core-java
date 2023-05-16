package com.xworkz.patientDetails.service;

import java.util.List;

import com.xworkz.patientDetails.dto.PatientsDTO;

public interface PatientsService {

	PatientsDTO validateAndRegisterPatient(PatientsDTO dto);

	List<PatientsDTO> getAllPatientsSer();

	List<PatientsDTO> getPatientByPatientNameSer(String patientName);

	PatientsDTO getPatientByIdSer(int id);

	PatientsDTO updatePatientByIdServ(PatientsDTO dto);

	List<PatientsDTO> deleteByPatientIdServ(int id);
	
	

}
