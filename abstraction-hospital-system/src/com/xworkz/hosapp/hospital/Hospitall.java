package com.xworkz.hosapp.hospital;

import com.xworkz.hosapp.exception.PatientDetailNotUpdatedException;
import com.xworkz.hosapp.exception.PatientNotFoundException;
import com.xworkz.hosapp.patientt.Patientt;

public interface Hospitall {

	 public boolean admit(Patientt patient);
	               
	 public void getAllPatients();	
	     
	 public Patientt getPatientByPatientId (int patientId) throws PatientNotFoundException;
	    
	 public Patientt getPatientByPatientName (String patientName) throws PatientNotFoundException;

	 public Patientt getPatientByPatientbloodGroup (String bloodGroup) throws PatientNotFoundException;
	 
	 public Patientt getPatientByPatientGender (String gender) throws PatientNotFoundException;
	 
	 public Patientt getPatientByPatientagAge(int age) throws PatientNotFoundException;
	 
	 public Patientt getPatientByEmail(String email) throws PatientNotFoundException;	 
	 
	 public Patientt updateByPatientId(String newName , int patientId ) throws PatientDetailNotUpdatedException;

	
}
