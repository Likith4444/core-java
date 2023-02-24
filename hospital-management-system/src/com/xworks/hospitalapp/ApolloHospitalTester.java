package com.xworks.hospitalapp;

import java.util.Scanner;

import com.xworks.hospitalapp.hospital.ApolloHospital;
import com.xworks.hospitalapp.hospital.Hospital;
import com.xworks.hospitalapp.patient.Patient;

public class ApolloHospitalTester {
	
	public static void main(String[] args) {
		
		System.out.println("another main method started");
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size");
		int size = scan.nextInt();
		
		//ApolloHospital apollo = new ApolloHospital(size);
		
		//up casting
		Hospital hos = new ApolloHospital(size);
		
		for(int i = 0; i < size; i++) {
			
			Patient pat = new Patient();
			
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
			
			hos.admit(pat);
			
		}
		
		//down casting
		ApolloHospital apollo = (ApolloHospital)hos;
		apollo.canteen();
		System.out.println(apollo.isFormFilled);
		
		
		apollo.getAllPatients();
		
		
		
		
		
		
	scan.close();	
	}

}
