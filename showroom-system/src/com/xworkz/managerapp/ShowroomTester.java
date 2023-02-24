package com.xworkz.managerapp;

import java.util.Scanner;

import com.xworkz.managerapp.manager.Manager;
import com.xworkz.managerapp.showroom.Showroom;

public class ShowroomTester {
	
	public static void main(String[] args) {
		
		System.out.println("MAIN METHOD HAS STARTED");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER THE SIZE");
		int size = scanner.nextInt();
		Showroom show = new Showroom(size);
		
		//Showroom tvs1 = new TvsShowroom();
		
		for(int i = 0; i < size; i++) {
			
			System.out.println("ENTER MANAGER ID");
			int managerId1 = scanner.nextInt();
			System.out.println("ENTER MANAGER NAME");
			String managerName1 = scanner.next();
			System.out.println("ENTER MANAGER AGE");
			int age1 = scanner.nextInt();
			System.out.println("ENTER MANAGER GENDER");
			String gender1 = scanner.next();
			System.out.println("ENTER MANAGER CONTACT NO");
			long contactNo1 = scanner.nextLong();
			System.out.println("ENTER MANAGER ADDRESS");
			String address1 = scanner.next();
			System.out.println("ENTER MANAGER QUALIFICATION");
			String qualification1 = scanner.next();
			
			Manager man1 = new Manager(managerId1 ,managerName1 ,age1,gender1,contactNo1,address1,qualification1);
			show.saveManager(man1);
			
		}
		
		show.getAllManagers();
	    
		show.getManagerDetailsByManagerId(1);
	    
		show.updateAdressByManagaerId("MALLESHWARAM", 1);  //not required because data added during runtime
	   
		System.out.println("MAIN METHOD HAS ENDED");
  
		scanner.close();
		
	}

}
