package com.xworkz.hospiexception.hospital;

import com.xworkz.hospiexception.Patient;
import com.xworkz.hospiexception.exception.PatientNotFoundException;

public interface Hospi {
	
	public boolean admit(Patient patient);
	
	public void getAllPatients();
	
	public Patient getPatientById (int id) throws PatientNotFoundException;
    
	public Patient getPatientByName (String name) throws PatientNotFoundException;
	
	public Patient getPatientByAge(int age) throws PatientNotFoundException;
	
	
	
}