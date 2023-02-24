package com.xworkz.switchapp.switchh;

public class Tubelight implements Switch{

	@Override
	public boolean switchOnOrOff() {
		boolean tubelightSwitch = true;
		System.out.println("THE TUBELIGHT IS TRUNED ON");
		return tubelightSwitch;
	}
	
}
