package com.xworkz.apartmentapp.rooms;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Rooms {
	
	private int roomId;
	private int roomNo;
	private int bhk;
	private String ownerName;
	private long ownerContactNo;
	
	@Override
	public String toString() {
		return "Rooms [roomId=" + roomId + ", roomNo=" + roomNo + ", bhk=" + bhk + ", ownerName=" + ownerName
				+ ", ownerContactNo=" + ownerContactNo + "]";


	}
	
	

	/*public Rooms(int roomId,int roomNo,int bhk,String ownerName,long ownerContactNo) {
		
		this.roomId = roomId;
	    this.roomNo = roomNo;
		this.bhk = bhk;
		this.ownerName = ownerName;
		this.ownerContactNo = ownerContactNo;	
		
	}

	public Rooms() {
		// TODO Auto-generated constructor stub
	}

	public void setRoomId(int roomId) {
		
		this.roomId = roomId;
	}
	
	public int getRoomId() {
		
		return roomId;
	}
	
	public void setRoomNo(int roomNo) {
		
		this.roomNo = roomNo;	
	}
	
	public int getRoomNo() {
		
		return roomNo;
	}
	
	public void setBhk(int bhk) {
		
		this.bhk = bhk;
	}
	
	public int getBhk() {
		
		return bhk;
	}
	
	public void setOwnerName(String ownerName) {
		
		this.ownerName = ownerName;
	}
	
	public String getOwnerName() {
		
		return ownerName;
	}
	
	public void setOwnerContactNo(long ownerContactNo) {
		
		this.ownerContactNo = ownerContactNo;	
	}
	
	public long getOwnerContactNo() {
		
		return ownerContactNo;
	}*/

}
