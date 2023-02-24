package com.xworkz.employeeapp;

import java.util.Scanner;

import com.xworkz.employeeapp.employee.Employee;
import com.xworkz.employeeapp.hotel.Hotel;

public class HotelTester {
	
	public static void main(String[] args) {
		
        System.out.println("MAIN METHOD HAS STARTED");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER THE SIZE");
		int size = scanner.nextInt();
		Hotel h1 = new Hotel(size);
		
        for(int i = 0; i < size; i++) {
        	
        	Employee emp = new Employee();
			
			System.out.println("ENTER EMPLOYEE ID");
			int employeeId1 = scanner.nextInt();
			emp.setEmployeeId(employeeId1);
			
			System.out.println("ENTER EMPLOYEE NAME");
			String employeeName1 = scanner.next();
			emp.setEmployeeName(employeeName1);
			
			System.out.println("ENTER EMPLOYEE AGE");
			int age1 = scanner.nextInt();
			emp.setAge(age1);
			
			System.out.println("ENTER EMPLOYEE GENDER");
			String gender1 = scanner.next();
			emp.setGender(gender1);
			
			System.out.println("ENTER EMPLOYEE CONTACT NO");
			long contactNo1 = scanner.nextLong();
			emp.setContactNo(contactNo1);
			
			h1.saveEmployee(emp);
			
		}
        
        System.out.println("enter 1 to get details of all employees");
        System.out.println("enter 2 to get employee details by employee id");
        System.out.println("enter 3 to update emplyoee age by using employee id");
        
        int option = scanner.nextInt();
        switch(option) {
        
        case 1: h1.getAllEmployee();;
		break;
		
		case 2: System.out.println("enter the employee id");
		int  employeeId = scanner.nextInt();
		h1.getEmployeeByEmployeeId(employeeId);
		break;
		
		case 3: System.out.println("enter the employee id");
		int employeeId1 = scanner.nextInt();
		System.out.println("enter the new age to update");
		int newAge = scanner.nextInt();
		h1.updateAgeByEmployeeId(newAge, employeeId1);
		break;
        
        }
        
        
        System.out.println("MAIN METHOD HAS ENDED");
        scanner.close();
	}

}
