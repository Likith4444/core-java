package com.xworkz.apartmentapp.exception;

public class RoomNotFoundException extends Exception {

	String msg;
	
	public RoomNotFoundException(String msg) {
		super(msg);
	}
}
