package com.xworkz.apartmentapp;

import java.util.Scanner;

import com.xworkz.apartmentapp.apartment.Apartment;
import com.xworkz.apartmentapp.apartment.PrestigeApartment;
import com.xworkz.apartmentapp.exception.RoomNotFoundException;
import com.xworkz.apartmentapp.exception.RoomNotUpdatedException;
import com.xworkz.apartmentapp.rooms.Rooms;

public class PrestigeApartmentTester {
	
	public static void main(String[] args) {
		
		System.out.println("another main method started");
		
	     Scanner scan = new Scanner(System.in);
	     System.out.println("enter the size");
		 int size = scan.nextInt();
		 Apartment apart = new PrestigeApartment(size);
		 for(int i = 0; i < size; i++) {
			 
			 Rooms r1 = new Rooms();
			 
			 System.out.println("enter the room id");
			 int roomId = scan.nextInt();
			 r1.setRoomId(roomId);
			 
			 System.out.println("enter the room no");
			 int roomNo = scan.nextInt();
			 r1.setRoomNo(roomNo);
			 
			 System.out.println("enter the bhk");
			 int bhk = scan.nextInt();
			 r1.setBhk(bhk);
			 
			 System.out.println("enter the owner name");
			 String ownerName = scan.next();
			 r1.setOwnerName(ownerName);
			 
			 System.out.println("enter the owner contact no");
			 long ownerContactNo = scan.nextLong();
			 r1.setOwnerContactNo(ownerContactNo);
			 
			 apart.addRooms(r1);
			 
		 }
		 
		 apart.getAllRooms();
		 
		 try {
			 
		 System.out.println("enter the room id");
		 int  roomId = scan.nextInt();
		 apart.getRoomByRoomId(roomId);
		 
		 System.out.println("enter the room number");
	     int  roomNo = scan.nextInt();
		 apart.getRoomByRoomNo(roomNo);
		 
		 System.out.println("enter the room bhk");
		 int bhk = scan.nextInt();
		 apart.getRoomByBhk(bhk);
		
		 } catch (RoomNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 System.out.println("enter the room id");
		 int roomId1 = scan.nextInt();
		 System.out.println("enter the new contact no to update");
		 long newContactNo = scan.nextLong();
		 try {
			apart.updateContactNoByRoomId(newContactNo, roomId1);
		} catch (RoomNotUpdatedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		 
		 finally {
		    if(scan != null) {
			scan.close();
		    }
		 }
		 
	}

}
