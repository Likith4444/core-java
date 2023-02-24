package com.xworkz.employeeapp.hotel;

import com.xworkz.employeeapp.employee.Employee;

public class RoyalHotel  extends Hotel{

public boolean isExperienced = true;
	
	public RoyalHotel(int size) {
		
		employee = new Employee[size];
		System.out.println("royal hotel constructor is created");
		
	}
	
	@Override
	public boolean saveEmployee(Employee employee) {
		
		System.out.println("inside save employee method of royal hotel class");
		if( isExperienced == true) {
			
			System.out.println("the employee is Experienced ...u can add the employee");
			super.saveEmployee(employee);
			
		}
		
		System.out.println("end of save employee method of royal hotel class");
		return false;
	}

	

}
