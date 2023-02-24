package com.xworkz.hosapp;

import java.util.Scanner;

import com.xworkz.hosapp.exception.EmailNotFoundException;
import com.xworkz.hosapp.exception.PatientNotFoundException;
import com.xworkz.hosapp.hospital.ApolloHospitalImpl;
import com.xworkz.hosapp.hospital.Hospitall;
import com.xworkz.hosapp.patientt.Patientt;

public class ApolloHosTester {
	
	public static void main(String[] args) {
		
		System.out.println("main method started");
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size");
		int size = scan.nextInt();
		
		//this represents abstraction
        Hospitall hos = new ApolloHospitalImpl(size);
		
		for(int i = 0; i < size; i++) {
			
			Patientt pat = new Patientt();
			
			System.out.println("enter the patient id");
			int patientId = scan.nextInt();
			pat.setPatientId(patientId);
			
			System.out.println("enter patient name");
			String patientName = scan.next();
			pat.setPatientName(patientName);
			
			System.out.println("enter patient bloodgroup");
			String bloodGroup = scan.next();
			pat.setBloodGroup(bloodGroup);
			
			System.out.println("enter patient age");
			int age = scan.nextInt();
			pat.setAge(age);
			
			System.out.println("enter patient gender");
			String gender = scan.next();
			pat.setGender(gender);
			
			System.out.println("enter email id");
			String email = scan.next();
			pat.setEmail(email);
			
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
		System.out.println("enter 8 to get patient details by email id");
		System.out.println("enter 9 to EXIT");
		
		option = scan.nextInt();
		switch(option) {               //all the data is coming in the runtime only, not compile time
		
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
		
		case 8: System.out.println("enter the patient email");
		String email = scan.next();
		try {
		hos.getPatientByEmail(email);
		}
		catch(PatientNotFoundException e) {
			System.out.println("INVALID EMAIL ID...ENTER THE CORRECT EMAIL ID");
			e.printStackTrace();
		}
		break;
		
		
		case 9:System.out.println("DO U WANT TO CONTINUE");
		break;
		
		default: System.out.println("PLEASE ENTER A VALID NUMBER");
		break;
		}
		System.out.println("DO U WANT 2 CONTINUE");
		System.out.println("TYPE -- yes / no");
		enter = scan.next();
		}
		
		while(enter .equals("yes"));
		
	  	
	  System.out.println("METHOD HAS ENDED");
	  
		
	}

}
