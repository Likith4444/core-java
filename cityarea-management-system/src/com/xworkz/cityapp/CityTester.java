package com.xworkz.cityapp;

import java.util.Scanner;

import com.xworkz.cityapp.area.Area;
import com.xworkz.cityapp.city.City;
import com.xworkz.cityapp.exception.AreaNotFoundException;
import com.xworkz.cityapp.exception.AreaNotUpdatedException;

public class CityTester {
	
	public static void main(String[] args) {
		
		 System.out.println("METHOD HAS STARTED");
		 
		 Scanner scan = new Scanner(System.in);
		 System.out.println("ENTER THE SIZE");
		 int size = scan.nextInt();
		 
		  City c1 = new City(size);
		  //City aa = new BengaluruCity();//polymorphism
		  
		  for(int i = 0; i < size; i++) {
			  
			   // System.out.println("ENTER AREA ID");
			//  int areaId = scan.nextInt();
				//System.out.println("ENTER AREA NAME");
			//	String areaName = scan.next();
				//System.out.println("ENTER AREA POPULATION");
			//	int areaPopulation = scan.nextInt();
				//System.out.println("ENTER AREA SQFT");
			//	int areaSqFt = scan.nextInt();
				
				//Area a1 = new Area(areaId, areaName, areaPopulation, areaSqFt);
		 
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
		  
			System.out.println("enter 1 to get all area details");
			System.out.println("enter 2 to get area details by area id");
			System.out.println("enter 3 to update area population by area id");
			
			
			int option = scan.nextInt();
			switch(option) {
			
			case 1: c1.getAllAreas();;
			break;
			
			case 2: System.out.println("enter the room id");
			int  areaId = scan.nextInt();
				try {
					c1.getAreaByAreaId(areaId);
				} catch (AreaNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			break;
			
			case 3: System.out.println("enter the area id");
			int areaId1 = scan.nextInt();
			System.out.println("enter the new population to update");
			int newPopulation = scan.nextInt();
				try {
					c1.updateAreaPopulationByAreaId(newPopulation, areaId1);
				} catch (AreaNotUpdatedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			break;
			
			}
		  
		  
		  System.out.println("METHOD HAS ENDED");
		  scan.close();
		
	}

}
