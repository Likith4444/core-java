package com.xworks.hospitalapp;


import java.util.Scanner;

import com.xworks.hospitalapp.hospital.Hospital;
import com.xworks.hospitalapp.patient.Patient;

public class HospitalTester {
	
	public static void main(String b[]){
		  
		  System.out.println("METHOD HAS STARTED");
		  
		    Scanner scan = new Scanner(System.in);
			System.out.println("ENTER THE SIZE");
			int size = scan.nextInt();
			Hospital hos = new Hospital(size);
		  
		 // ApolloHospital apo1 = new ApolloHospital();    //variable can be used for child class ApolloHospital
		  
			for(int i = 0; i < size; i++) {
				
				//System.out.println("ENTER PATIENT ID");
				//int patientId1 = scanner.nextInt();
				//System.out.println("ENTER PATIENT NAME");
				//String patientName1 = scanner.next();
				//System.out.println("ENTER PATIENT BLOOD GROUP");
				//String bloodGroup = scanner.next();
				//System.out.println("ENTER PATIENT GENDER");
				//String gender1 = scanner.next();
				//System.out.println("ENTER PATIENT AGE");
				//int age1 = scanner.nextInt();
				
				//Patient pat1 = new Patient(patientId1 ,patientName1 ,bloodGroup,gender1,age1);
				//hos.admit(pat1);
				

				Patient pat = new Patient();
				
				System.out.println("ENTER PATIENT ID");
				int patientId = scan.nextInt();
				pat.setPatientId(patientId);
				
				System.out.println("ENTER PATIENT NAME");
				String patientName = scan.next();
				pat.setPatientName(patientName);
				
				System.out.println("ENTER PATIENT BLOOD GROUP");
				String bloodGroup = scan.next();
				pat.setBloodGroup(bloodGroup);
				
				System.out.println("ENTER PATIENT GENDER");
				String gender = scan.next();
				pat.setGender(gender);
				
				System.out.println("ENTER PATIENT AGE");
				int age = scan.nextInt();
				pat.setAge(age);
				
			    hos.admit(pat);
			}
		    
			int option = 0;
            String enter = "no";
			do {
			System.out.println("enter 1 to get all patients details");
			System.out.println("enter 2 to get patient details by patient id");
			System.out.println("enter 3 to update patient name by patient id");
			System.out.println("enter 4 to get patient details by patient age");
			System.out.println("enter 5 to get patient details by patient name");
			System.out.println("enter 6 to get patient details by patient blood group");
			System.out.println("enter 7 to get patient details by patient gender");
			System.out.println("enter 8 to EXIT");
			
			option = scan.nextInt();
			switch(option) {               //all the data is coming in the runtime only not compile time
			
			case 1: hos.getAllPatients();
			break;
			
			case 2: System.out.println("enter the patient id");
			int  id = scan.nextInt();
			hos.getPatientByPatientId(id);
			break;
			
			case 3: System.out.println("enter the patient id");
			int id1 = scan.nextInt();
			System.out.println("enter the new name to be updated");
			String newName = scan.next();
			hos.updateByPatientId(newName, id1);
			break;
			
			case 4: System.out.println("enter the patient age");
			int age = scan.nextInt();
			hos.getPatientByPatientagAge(age);
			break;
			
			case 5: System.out.println("enter the patient name");
			String patientName = scan.next();
			hos.getPatientByPatientName(patientName);
			break;
			
			case 6: System.out.println("enter the patient blood group");
			String bloodGroup = scan.next();
			hos.getPatientByPatientbloodGroup(bloodGroup);
			break;
			
			case 7: System.out.println("enter the patient gender");
			String gender = scan.next();
			hos.getPatientByPatientGender(gender);
			break;
			
			case 8:System.out.println("DO U WANT TO CONTINUE");
			break;
			
			default: System.out.println("PLEASE ENTER A VALID NUMBER");
			break;
			}
			
			System.out.println("TYPE -- yes / no");
			enter = scan.next();
			}
			
			while(enter .equals("yes"));
			
		  System.out.println("METHOD HAS ENDED");
		  scan.close();

		  }
	
}
