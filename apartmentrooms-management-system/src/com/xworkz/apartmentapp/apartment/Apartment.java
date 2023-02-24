package com.xworkz.apartmentapp.apartment;

import com.xworkz.apartmentapp.exception.RoomNotFoundException;
import com.xworkz.apartmentapp.exception.RoomNotUpdatedException;
import com.xworkz.apartmentapp.rooms.Rooms;

public class Apartment {
	
	Rooms rooms[];
	int index;
	
	public Apartment() {
		// TODO Auto-generated constructor stub
	}
	
	public Apartment(int size) {
		
		System.out.println("APARTMENT OBJECT IS CREATED");
		rooms = new Rooms[size]; 
	}
	
	public boolean addRooms(Rooms rooms) {
		
		System.out.println("addRooms method started");
		boolean isAddRoom = false;
		
		if(rooms.getRoomNo() != 0 ) {
			
			System.out.println("ROOM IS ADDED");
			this.rooms[index++] = rooms;
			isAddRoom = true;
		}
		System.out.println("addRooms method ended");
		return isAddRoom;
	}
	
	public void getAllRooms() {
		
		System.out.println("inside getAllRooms method");
		System.out.println("ALL ROOMS LIST ARE:");
		for(Rooms ro : rooms) {
			
			System.out.println(ro);
		}
		  		
	}
	
    public Rooms getRoomByRoomNo (int roomNo) throws RoomNotFoundException {
    	
    	System.out.println("INSIDE getRoomByRoomNo METHOD");
    	for(int in=0; in< rooms.length; in++) {
    		
    		if(rooms[in].getRoomNo() == roomNo ) {
    			
    			System.out.println("ROOM NUMBER IS MATCHING...PROCEED WITH DISPLAYING THE DATA");
      			System.out.println(rooms[in]);
    			return rooms[in];
    		}
    		else {
      			
      			throw new RoomNotFoundException("invalid room no entered");
      		}
    	}
    		System.out.println("END OF getRoomByRoomNo METHOD");
    		return null;    
     
}
    
    public Rooms getRoomByRoomId (int roomId) throws RoomNotFoundException {
    	
    	System.out.println("INSIDE getRoomByRoomId METHOD");
    	for(int in=0; in< rooms.length; in++) {
    		
    		if(rooms[in].getRoomId() == roomId ) {
    			
    			System.out.println("ROOM ID IS MATCHING...PROCEED DISPLAYING THE DATA");
      			System.out.println(rooms[in]);
    			return rooms[in];
    		}
    		else {
      			
      			throw new RoomNotFoundException("invalid room id entered");
      		}
    	}
    		System.out.println("END OF getRoomByRoomId METHOD");
    		return null;    
     
}
        
      public Rooms updateContactNoByRoomId(long newContactNo , int roomId ) throws RoomNotUpdatedException {
    		
    		System.out.println("INSIDE updateContactNoByRoomId METHOD");
    		for(int b = 0; b < rooms.length; b++ ) {
    			
    			if(rooms[b].getRoomId() == roomId ) {
    				
    				System.out.println("the current contact no is: " + rooms[b].getOwnerContactNo());
    				rooms[b].setOwnerContactNo(newContactNo) ;
    				System.out.println("the new updated name of patient is" + rooms[b].getOwnerContactNo());
    				System.out.println("THE UPDATED OWNER SETAILS ARE : ");
          			System.out.println(rooms[b]);

    			}
    			else {
    				throw new RoomNotUpdatedException("invalid room id entered, contact no not updated");
    			}
    		}
    		System.out.println("END OF updateContactNoByRoomId METHOD");
    		return null;
    	} 
      
      public Rooms getRoomByBhk (int bhk) throws RoomNotFoundException {
      	
      	System.out.println("INSIDE getRoomByBhk METHOD");
      	for(int in=0; in< rooms.length; in++) {
      		
      		if(rooms[in].getBhk() == bhk ) {
      			
      			System.out.println("ROOM BHK IS MATCHING...PROCEED DISPLAYING THE DATA");
      			System.out.println(rooms[in]);
      			return rooms[in];
      		}
      		else {
      			
      			throw new RoomNotFoundException("invalid bhk entered");
      		}
      	}
      		System.out.println("END OF getRoomByBhk METHOD");
      		return null;    
       
  }

}
