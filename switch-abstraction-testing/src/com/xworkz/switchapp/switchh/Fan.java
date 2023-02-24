package com.xworkz.switchapp.switchh;

public class Fan implements Switch{
	
	@Override
	public boolean switchOnOrOff() {
		
		boolean isSwitchOn = true;
		System.out.println("the fan switch is turned on...enjoy the breeze");
		return isSwitchOn;
	}

}
