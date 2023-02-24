package com.xworkz.cityapp.city;

import com.xworkz.cityapp.area.Area;

public class BengaluruCity extends City{
	
	public boolean isDeveloped = true;
	
	public BengaluruCity(int size) {
		
		area = new Area[size];
		System.out.println("bengaluru city constructor is created");
		
	}
	
	@Override
	public boolean saveArea( Area area ) {
		
		System.out.println("inside save area method of Bengaluru city class");
		if( isDeveloped == true) {
			
			System.out.println("the area is developed ...u can add it under the city");
			super.saveArea(area);
			
		}
		
		System.out.println("end of save area method of bengaluru city class");
		return false;
	}
	
	public void abc() {
		
		System.out.println("abc something...bla bla bla");
	    System.out.println("abc method which is in child class is called using parent class");
	}

}
