package com.xworkz.hospiexception.exception;

public class PatientNotFoundException extends Exception{
	
	String msg;
	
	public PatientNotFoundException(String msg) {
		super(msg);
	}
	
	/*@Override
	public String toString() {
		
		return "invalid name";
	}*/

}
