package com.xworkz.apartmentapp.apartment;

import com.xworkz.apartmentapp.rooms.Rooms;

public class PrestigeApartment extends Apartment{
	
	boolean isRepaired = true;

	public PrestigeApartment(int size) {
		
		rooms = new Rooms[size];
		System.out.println("Prestige apartment constructor is created");
		
	}
	
	@Override
	public boolean addRooms(Rooms rooms) {
		
		System.out.println("inside addrooms method of PrestigeApartment class");
		if(isRepaired == true) {
			
			System.out.println("Room is repaired ...so room can be added");
			super.addRooms(rooms);
			
		}
		return false;
		
	}
	
		
		
		
	
}
