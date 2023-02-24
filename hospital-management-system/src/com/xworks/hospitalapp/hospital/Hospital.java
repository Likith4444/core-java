package com.xworks.hospitalapp.hospital;

import com.xworks.hospitalapp.patient.Patient;

public class Hospital {

	 Patient patient[];  
     int index=0;
       

     public Hospital(int size){
	   
	   System.out.println("Hospital object is created");
	   patient = new Patient[size];
	   }
     
     public Hospital() {
    	 
     }

     public boolean admit(Patient patient){       //implimentation...in industry           
	   
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
               
     public void getAllPatients(){
		   
		   System.out.println("LIST OF PATIENTS ARE: ");
		   for(Patient pat : patient) {
			   
			   System.out.println(pat);
		   }  
	   }	
     
    public Patient getPatientByPatientId (int patientId) {
    	
    	System.out.println("INSIDE getPatientByPatientId METHOD");
    	for(Patient pat:patient) {
    		
    		if(pat.getPatientId() == patientId ) {
    			
    			System.out.println("PATIENT ID IS MATCHING...PROCEED THE DATA");
    			   System.out.println(pat);
    			return pat;
    		}
    	}
    		System.out.println("END OF getPatientByPatientId METHOD");
    		return null;    
     
}
    
 public Patient getPatientByPatientName (String patientName) {
    	
    	System.out.println("INSIDE getPatientByPatientName METHOD");
    	for(int j=0; j < patient.length; j++) {
    		
    		if(patient[j].getPatientName() .equals(patientName)) {
    			
    			System.out.println("PATIENT NAME IS MATCHING...PROCEED THE DATA");
    			   System.out.println(patient[j]);
    			return patient[j];
    		}
    	}
    		System.out.println("END OF getPatientByPatientName METHOD");
    		return null;
    
}

 public Patient getPatientByPatientbloodGroup (String bloodGroup) {
	
	System.out.println("INSIDE getPatientByPatientbloodGroup METHOD");
	for(int k=0; k < patient.length; k++) {
		
		if(patient[k].getBloodGroup().equals(bloodGroup)) {
			
			System.out.println("PATIENT BLOOD GROUP IS MATCHING...PROCEED THE DATA");
			   System.out.println(patient[k]);
			return patient[k];
		}
	}
		System.out.println("END OF getPatientByPatientbloodGroup METHOD");
		return null;

}
 
 public Patient getPatientByPatientGender (String gender) {
		
		System.out.println("INSIDE getPatientByPatientgender METHOD");
		for(int l=0; l < patient.length; l++) {
			
			if(patient[l].getGender() .equals(gender)) {
				
				System.out.println("PATIENT  GENDER IS MATCHING...PROCEED THE DATA");
				   System.out.println(patient[l]);
				return patient[l];
			}
		}
			System.out.println("END OF getPatientByPatientgender METHOD");
			return null;

	}
 
 public Patient getPatientByPatientagAge(int age) {
		
		System.out.println("INSIDE getPatientByPatientage METHOD");
		for(int m=0; m < patient.length; m++) {
			
			if(patient[m].getAge() == age) {
				
				System.out.println("PATIENT  AGE IS MATCHING...PROCEED THE DATA");
				   System.out.println(patient[m]);
				return patient[m];
			}
		}
			System.out.println("END OF getPatientByPatientage METHOD");
			return null;
    
    }
 
 public Patient updateByPatientId(String newName , int patientId ) {
		
		System.out.println("INSIDE updateNameByPatientId METHOD");
		for(int b = 0; b < patient.length; b++ ) {
			
			if(patient[b].getPatientId() == patientId ) {
				
				System.out.println("the current patient name is: " + patient[b].getPatientName());
				patient[b].setPatientName(newName) ;
				System.out.println("the new updated name of patient is" + patient[b].getPatientName());
				System.out.println("THE UPDATED DETAILS OF THE PATIENT IS: ");
				   System.out.println(patient[b]);

			}
		}
		System.out.println("END OF updateNameByPatientId METHOD");
		return null;
	}
 
}

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 