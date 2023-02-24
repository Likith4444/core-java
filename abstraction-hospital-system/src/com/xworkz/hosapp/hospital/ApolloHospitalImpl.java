package com.xworkz.hosapp.hospital;

import com.xworkz.hosapp.exception.PatientDetailNotUpdatedException;
import com.xworkz.hosapp.exception.PatientNotFoundException;
import com.xworkz.hosapp.patientt.Patientt;

public class ApolloHospitalImpl implements Hospitall{
	
	Patientt patient[];  
    int index=0;
      

    public ApolloHospitalImpl(int size){
	   
	   System.out.println("ApolloHospitalImpl object is created");
	   patient = new Patientt[size];
	   }


	@Override
	public boolean admit(Patientt patient) {
		
		System.out.println("Admit process started");
		   boolean isAdmitted = false;
		   
		   
		   if(patient.getPatientName() != null){
		   
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
	public Patientt getPatientByPatientId(int patientId) throws PatientNotFoundException {
		

    	System.out.println("INSIDE getPatientByPatientId METHOD");
    	for(int in=0; in< patient.length; in++) {
    		
    		if(patient[in].getPatientId() == patientId ) {
    			
    			System.out.println("PATIENT ID IS MATCHING...PROCEED THE DATA");
    			System.out.println(patient[in]);
    			return patient[in];
    		}
    		else {
				
				throw new PatientNotFoundException("invalid patient id entered");
    		}
    	}
    		System.out.println("END OF getPatientByPatientId METHOD");
    		return null; 
		
	}


	@Override
	public Patientt getPatientByPatientName(String patientName) throws PatientNotFoundException {
		
		System.out.println("INSIDE getPatientByPatientName METHOD");
    	for(int j=0; j < patient.length; j++) {
    		
    		if(patient[j].getPatientName() .equals(patientName)) {
    			
    			System.out.println("PATIENT NAME IS MATCHING...PROCEED THE DATA");
    			System.out.println(patient[j]);
    			return patient[j];
    		} 
    		else {
				
				throw new PatientNotFoundException("invalid patient name entered");
    		}
    	}
    		System.out.println("END OF getPatientByPatientName METHOD");
    		return null;
		
	}


	@Override
	public Patientt getPatientByPatientbloodGroup(String bloodGroup) throws PatientNotFoundException {
		
		System.out.println("INSIDE getPatientByPatientbloodGroup METHOD");
		for(int k=0; k < patient.length; k++) {
			
			if(patient[k].getBloodGroup().equals(bloodGroup)) {
				
				System.out.println("PATIENT BLOOD GROUP IS MATCHING...PROCEED THE DATA");
				System.out.println(patient[k]);
				return patient[k];
			}
			else {
				
				throw new PatientNotFoundException("invalid bloodgroup entered");
    		}
		}
			System.out.println("END OF getPatientByPatientbloodGroup METHOD");
			return null;	
		
	}


	@Override
	public Patientt getPatientByPatientGender(String gender) throws PatientNotFoundException {
		
		System.out.println("INSIDE getPatientByPatientgender METHOD");
		for(int l=0; l < patient.length; l++) {
			
			if(patient[l].getGender() .equals(gender)) {
				
				System.out.println("PATIENT  GENDER IS MATCHING...PROCEED THE DATA");
				System.out.println(patient[l]);
				return patient[l];
			} 
			else {
				
				throw new PatientNotFoundException("invalid gender entered");
    		}
		}
			System.out.println("END OF getPatientByPatientgender METHOD");
			return null;
		
	}


	@Override
	public Patientt getPatientByPatientagAge(int age) throws PatientNotFoundException {
		
		System.out.println("INSIDE getPatientByPatientage METHOD");
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
			System.out.println("END OF getPatientByPatientage METHOD");
			return null;
		
	}


	@Override
	public Patientt updateByPatientId(String newName, int patientId) throws PatientDetailNotUpdatedException{
		
		System.out.println("INSIDE updateNameByPatientId METHOD");
		for(int b = 0; b < patient.length; b++ ) {
			
			if(patient[b].getPatientId() == patientId ) {
				
				System.out.println("the current patient name is: " + patient[b].getPatientName());
				patient[b].setPatientName(newName) ;
				System.out.println("the new updated name of patient is" + patient[b].getPatientName());
				System.out.println("THE UPDATED DETAILS OF THE PATIENT IS: ");
				System.out.println(patient[b]);

			}
			else {
				
				throw new PatientDetailNotUpdatedException("invalid id, patient details not updated");
			}
		}
		System.out.println("END OF updateNameByPatientId METHOD");
		return null;
		
	}


	@Override
	public Patientt getPatientByEmail(String email) throws PatientNotFoundException {
		
		System.out.println("INSIDE getPatientByEmail METHOD");
		for(int m=0; m < patient.length; m++) {
			
			if(patient[m].getEmail() .equals(email)) {
				
				System.out.println("PATIENT  EMAIL IS MATCHING...");
				System.out.println(patient[m]);
				return patient[m];
			}
			else {
				
				throw new PatientNotFoundException("invalid email id entered");
             /* EmailNotFoundException x = new EmailNotFoundException();
				throw EmailNotFoundException;  */
				
			}
		}
			System.out.println("END OF getPatientByEmail METHOD");
			return null;
		
	}

}
