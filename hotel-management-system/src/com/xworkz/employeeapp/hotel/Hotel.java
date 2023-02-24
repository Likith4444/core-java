package com.xworkz.employeeapp.hotel;

import com.xworkz.employeeapp.employee.Employee;

public class Hotel {
	
	Employee employee[];
	int index;
	
	public Hotel() {
		
	}
	
	public Hotel(int size) {
		
		System.out.println("HOTEL OBJECT IS CREATED");
		employee = new Employee[size];
		
	}
	
public boolean saveEmployee(Employee employee) {
		
		System.out.println("save employee method started");
		boolean isSaveEmployee = false;
		
		if(employee.getEmployeeName() != null && !(employee.getEmployeeName().isEmpty())) {
			
			System.out.println("employee name is matching");
			this.employee[index++] = employee;
			isSaveEmployee = true;
			
		}
		System.out.println("save employee method ended");
		return isSaveEmployee;
		
	}

  public void getAllEmployee() {
	
	System.out.println("inside getAllEmployee method");
	System.out.println("ALL EMPLOYEE LIST ARE:");
	for(Employee emp : employee) {
		
		System.out.println(emp);
	}
}

  public Employee getEmployeeByEmployeeId (int employeeId) {
  	
  	System.out.println("INSIDE getEmployeeByEmployeeId METHOD");
  	for(int in=0; in< employee.length; in++) {
  		
  		if(employee[in].getEmployeeId() == employeeId ) {
  			
  			System.out.println("EMPLOYEE ID IS MATCHING...PROCEED DISPLAYING THE DATA");
  			System.out.println(employee[in]);
  			return employee[in];
  		}
  	}
  		System.out.println("END OF getEmployeeByEmployeeId METHOD");
  		return null;    
   
}
      
    public Employee updateAgeByEmployeeId(int newAge , int employeeId ) {
  		
  		System.out.println("INSIDE updateAgeByEmployeeId METHOD");
  		for(int b = 0; b < employee.length; b++ ) {
  			
  			if(employee[b].getEmployeeId() == employeeId ) {
  				
  				System.out.println("the current age is: " + employee[b].getAge());
  				employee[b].setAge(newAge) ;
  				System.out.println("the new updated name of patient is" + employee[b].getAge());
  				System.out.println("THE UPDATED EMPLOYEE DETAILS ARE : ");
  				System.out.println(employee[b]);

  			}
  		}
  		System.out.println("END OF updateAgeByEmployeeId METHOD");
  		return null;
  	} 

}
