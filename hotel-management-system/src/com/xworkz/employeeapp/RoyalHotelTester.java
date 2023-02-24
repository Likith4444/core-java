package com.xworkz.employeeapp;

import java.util.Scanner;

import com.xworkz.employeeapp.employee.Employee;
import com.xworkz.employeeapp.hotel.Hotel;
import com.xworkz.employeeapp.hotel.RoyalHotel;

public class RoyalHotelTester {
	
	public static void main(String[] args) {
		
		System.out.println("ANOTHER METHOD HAS STARTED");
		 
		 Scanner scan = new Scanner(System.in);
		 System.out.println("ENTER THE SIZE");
		 int size = scan.nextInt();
		 
		 //upcasting also called polymorphism
		  Hotel hot = new RoyalHotel(size); 
		  for(int i = 0; i < size; i++) {
			  
			    Employee emp = new Employee();
			    System.out.println("ENTER EMPLOYEE ID");
				int employeeId1 = scan.nextInt();
				emp.setEmployeeId(employeeId1);
				
				System.out.println("ENTER EMPLOYEE NAME");
				String employeeName1 = scan.next();
				emp.setEmployeeName(employeeName1);
				
				System.out.println("ENTER EMPLOYEE AGE");
				int age1 = scan.nextInt();
				emp.setAge(age1);
				
				System.out.println("ENTER EMPLOYEE GENDER");
				String gender1 = scan.next();
				emp.setGender(gender1);
				
				System.out.println("ENTER EMPLOYEE CONTACT NO");
				long contactNo1 = scan.nextLong();
				emp.setContactNo(contactNo1);
				
				hot.saveEmployee(emp);  
		  }
		  
		  hot.getAllEmployee();
			
	      System.out.println("MAIN METHOD HAS ENDED");
	      scan.close();
		
		
	}

}
