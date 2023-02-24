package com.xworkz.hospiexception.hospital;

import com.xworkz.hospiexception.Patient;
import com.xworkz.hospiexception.exception.PatientNotFoundException;

public class ColumbiaHospitalImpl implements Hospi {

	
	Patient patient[] ;
	int index = 0;
	
	public ColumbiaHospitalImpl(int size) {
		
	System.out.println("ColumbiaHospitalImpl object is created");	
	patient = new Patient[size];	
	
	}
	
	public ColumbiaHospitalImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean admit(Patient patient) {
		System.out.println("Admit process started");
		   boolean isAdmitted = false;
		   
		   
		   if(patient.getName() != null){
		   
		   this.patient[index++] = patient;
		   System.out.println("Patient admitted succesfully");
		   isAdmitted = true;
		   }
		   System.out.println("Admit process ended");
		   
		   return isAdmitted;
	}

	@Override
	public void getAllPatients() {
		
		System.out.println("LIST OF PATIENTS ARE: ");
		   for(int i = 0; i < this.patient.length ; i++){
			   
		   System.out.println(patient[i]);
			   
		   }  
		
	}

	@Override
	public Patient getPatientById(int id) throws PatientNotFoundException{
		
		System.out.println("INSIDE getPatientById METHOD");
    	for(int in=0; in< patient.length; in++) {
    		
    		if(patient[in].getId() == id ) {
    			
    			System.out.println("PATIENT ID IS MATCHING...PROCEED THE DATA");
    			System.out.println(patient[in]);
    			return patient[in];
    		}
    		else {
    			
    			throw new PatientNotFoundException("invalid patient id entered");
    		}
    		
    	}
    		System.out.println("END OF getPatientById METHOD");
    		return null; 
	}

	@Override
	public Patient getPatientByName(String name) throws PatientNotFoundException {
		
		System.out.println("INSIDE getPatientByName METHOD");
    	for(int j=0; j < patient.length; j++) {
    		
    		if(patient[j].getName() .equals(name)) {
    			
    			System.out.println("PATIENT NAME IS MATCHING...PROCEED THE DATA");
    			System.out.println(patient[j]);
    			return patient[j];
    		}
    		else {
    			
    			throw new PatientNotFoundException("invalid patient name entered");
    		}
    	}
    		System.out.println("END OF getPatientByName METHOD");
    		return null;
		
	}

	@Override
	public Patient getPatientByAge(int age) throws PatientNotFoundException{
		

		System.out.println("INSIDE getPatientByAge METHOD");
		for(int m=0; m < patient.length; m++) {
			
			if(patient[m].getAge() == age) {
				
				System.out.println("PATIENT  AGE IS MATCHING...PROCEED THE DATA");
				System.out.println(patient[m]);
				return patient[m];
			}
			else {
    			
    			throw new PatientNotFoundException("invalid age entered");
    		}
		}
			System.out.println("END OF getPatientByAge METHOD");
			return null;
		
	}

	

}
