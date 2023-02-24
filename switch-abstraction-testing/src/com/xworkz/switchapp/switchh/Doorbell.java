package com.xworkz.switchapp.switchh;

public class Doorbell implements Switch{
	
	@Override
	public boolean switchOnOrOff() {
		
		boolean doorbellSwitch = true; 
		System.out.println("THE DOORBELL SWITCHED ON....DING DONG...OPEN THE DOOR");
		return doorbellSwitch;
	}
	

}
