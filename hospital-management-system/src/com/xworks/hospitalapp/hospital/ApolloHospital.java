package com.xworks.hospitalapp.hospital;

import com.xworks.hospitalapp.patient.Patient;

public class ApolloHospital extends Hospital{
	
	public boolean isFormFilled = true;
	
	
	public ApolloHospital(int size) {
		
		patient = new Patient[size];
		System.out.println("apollo hospital object is created");
		
	}
	
	@Override
	public boolean admit(Patient patient) {
		
		System.out.println("inside admit method of Apollo hospital");
		if(isFormFilled == true) {
			
			System.out.println("the form is filled...admit the patient");
			return super.admit(patient);
		}
		return false;
		
	}
	
	
	public String canteen() {
		
		System.out.println("uta madu");
		return "utaaa";
		
	}

}
