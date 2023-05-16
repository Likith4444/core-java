package com.xworkz.patientDetails.repository;

import java.util.List;

import com.xworkz.patientDetails.dto.PatientsDTO;

public interface PatientsRepository {

	PatientsDTO savePatient(PatientsDTO dto);

	List<PatientsDTO> getAllPatientsRepo();

	List<PatientsDTO> getPatientByPatientNameRepo(String patientName);

	PatientsDTO getPatientByIdRepo(int id);

	PatientsDTO updatePatientByIdRepo(PatientsDTO dto);

	List<PatientsDTO> deleteByPatientIdServ(int id);

}
