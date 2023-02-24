package com.xworkz.switchapp.switchh;

public class Socket implements Switch{

	@Override
	public boolean switchOnOrOff() {
		boolean isSwitchOn = true;
		System.out.println("THE SWITCH FOR THE SOCKET IS ON");
		return isSwitchOn;
	}
	
}
