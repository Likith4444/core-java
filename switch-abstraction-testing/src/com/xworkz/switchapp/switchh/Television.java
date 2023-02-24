package com.xworkz.switchapp.switchh;

public class Television implements Switch{

	@Override
	public boolean switchOnOrOff() {

		boolean tvSwitch = false;
        System.out.println("LET'S WATCH TV...ON IT");
        tvSwitch = true;
        System.out.println("THE TV IS ON...LET'S ENJOY");
		return tvSwitch;
	}
	
}
