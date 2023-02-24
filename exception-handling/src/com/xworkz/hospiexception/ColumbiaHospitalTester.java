package com.xworkz.hospiexception;

import java.util.Scanner;

import com.xworkz.hospiexception.exception.PatientNotFoundException;
import com.xworkz.hospiexception.hospital.ColumbiaHospitalImpl;
import com.xworkz.hospiexception.hospital.Hospi;

public class ColumbiaHospitalTester {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the size");
		int size = scan.nextInt();
		
		Hospi hos = new ColumbiaHospitalImpl();
		
		for(int i = 0; i < size; i++) {
			
		Patient pat = new Patient();
		
		System.out.println("enter id");
		int id = scan.nextInt();
		pat.setId(id);
		System.out.println("enter the name");
		String name = scan.next();
		pat.setName(name);
		System.out.println("enter the age");
		int age = scan.nextInt();
		pat.setAge(age);
		
		hos.admit(pat);
		
		}
		
		hos.getAllPatients();
		
		try {
		int id1 = scan.nextInt();
		hos.getPatientById(id1);
		
		String name1 = scan.next();
		hos.getPatientByName(name1);
		
		int age1 = scan.nextInt();
		hos.getPatientByAge(age1);
		}
		
		catch(PatientNotFoundException e) {
			
			System.out.println("invalid data");
			e.printStackTrace();
		}
		
		finally {
		    if(scan != null) {
			scan.close();
		    }
		 }
		}

}
