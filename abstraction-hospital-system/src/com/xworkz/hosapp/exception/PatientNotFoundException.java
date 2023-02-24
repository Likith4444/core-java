package com.xworkz.hosapp.exception;

public class PatientNotFoundException extends Exception{
	
	String msg1;
	
	public PatientNotFoundException(String msg1) {
		super(msg1);
	}
	
	/*@Override
	public String toString() {
		
		return "INVALID EMAIL ID ENTERED...";
	}*/

}
