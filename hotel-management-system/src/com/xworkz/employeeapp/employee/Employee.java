package com.xworkz.employeeapp.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	private int employeeId;
	private String employeeName;
	private int age;
	private String gender;
	private long contactNo;

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", age=" + age + ", gender="
				+ gender + ", contactNo=" + contactNo + "]";
	}
	
	/*public Employee ( int employeeId, String employeeName, int age, String gender, long contactNo) {
		
	     this.employeeId = employeeId;
		 this.employeeName = employeeName;
		 this.age = age;
		 this.gender = gender;
		 this.contactNo = contactNo;
		 
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public void setEmployeeId(int employeeId) {
		
		this.employeeId = employeeId;
	}
	
	public int getEmployeeId() {
		
		return employeeId;
	}
	
	public void setEmployeeName(String employeeName) {
		
		this.employeeName = employeeName;
	}
	
	public String getEmployeeName() {
		
		return employeeName;
	}
	
	public void setAge(int age) {
		
		this.age = age;
	}
	
	public int getAge() {
		
		return age;
	}
	
	public void setGender(String gender) {
		
		this.gender = gender;
	}
	
	public String getGender() {
		
		return gender;
	}
	
	public void setContactNo(long contactNo) {
		
		this.contactNo = contactNo;
	}
	
	public long getContactNo() {
		
		return contactNo;
	}*/

}
