package com.xworkz.cityapp;

import java.util.Scanner;

import com.xworkz.cityapp.area.Area;
import com.xworkz.cityapp.city.BengaluruCity;
import com.xworkz.cityapp.city.City;

public class BengaluruCityTester {

	  public static void main(String[] args) {
		
		 System.out.println("ANOTHER METHOD HAS STARTED");
		 
		 Scanner scan = new Scanner(System.in);
		 System.out.println("ENTER THE SIZE");
		 int size = scan.nextInt();
		 
		 //upcasting also called polymorphism
		  City c1 = new BengaluruCity(size); 
		  for(int i = 0; i < size; i++) {
			  
			    Area a1 = new Area();
				
				System.out.println("ENTER AREA ID");
				int areaId = scan.nextInt();
				a1.setAreaId(areaId);
				
				System.out.println("ENTER AREA NAME");
				String areaName = scan.next();
				a1.setAreaName(areaName);
				
				System.out.println("ENTER AREA POULATION");
				int areaPopulation = scan.nextInt();
				a1.setAreaPopulation(areaPopulation);
				
				System.out.println("ENTER  AREA SQFT");
				int areaSqFt = scan.nextInt();
				a1.setAreaSqFt(areaSqFt);
				
				
				c1.saveArea(a1); 
			  
		  }
		  
		  //down casting (done manually)---parent class instance variable is used to access child class methods
		  BengaluruCity beng = (BengaluruCity)c1;
		  beng.abc();
		  System.out.println(beng.isDeveloped);
		  
		
		  c1.getAllAreas();
		  scan.close();
		  System.out.println("END OF ANOTHER METHOD");
	}
	
}
