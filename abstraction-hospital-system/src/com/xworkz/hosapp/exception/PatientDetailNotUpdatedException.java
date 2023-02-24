package com.xworkz.hosapp.exception;

public class PatientDetailNotUpdatedException extends Exception {

	String msg;
	
	public PatientDetailNotUpdatedException(String msg) {

		super(msg);
	}
	
}
