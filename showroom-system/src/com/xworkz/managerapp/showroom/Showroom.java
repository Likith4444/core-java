package com.xworkz.managerapp.showroom;

import com.xworkz.managerapp.manager.Manager;

public class Showroom {
	
	Manager manager[] ;  //
	int index;
	
	public Showroom() {
		
		
	}
	
	public Showroom(int size) {
		
		System.out.println("Showroom object is created");
		manager = new Manager[size];

	}
	
	
	public boolean saveManager(Manager manager) {
		
		System.out.println("save manager method started");
		boolean isSaveManager = false;
		
		if(manager.managerName != null && !(manager.managerName.isEmpty())) {
			
			System.out.println("manager name is matching");
			this.manager[index++] = manager;
			isSaveManager = true;
			
		}
		System.out.println("save manager method ended");
		return isSaveManager;
		
	}
	
	public void getAllManagers() {
		
		System.out.println("ALL MANAGER LIST ARE:");
		for(int i = 0; i < this.manager.length ;i++) {
			
			System.out.println(manager[i].managerId + " " + manager[i].managerName + " " + manager[i].age + " " + manager[i].gender + " " + manager[i].contactNo + " " + manager[i].address + " " + manager[i].qualification);
		}
	}
	
	public Manager getManagerDetailsByManagerId(int managerId) {
		
		System.out.println("INSIDE getManagerDetailsByManagerId METHOD");
		for(int a = 0; a < manager.length; a++ ) {
			
			if( manager[a].managerId == managerId ) {
				
				System.out.println("managerId " + manager[a].managerId + " managerIS MATCHING");
				System.out.println(manager[a].managerId + " " + manager[a].managerName + " " + manager[a].age + " " + manager[a].gender + " " + manager[a].contactNo + " " + manager[a].address + " " + manager[a].qualification);
				return manager[a];
			}
		}
		System.out.println("END OF getManagerDetailsByManagerId METHOD");
		return null;
		
	}
	
	public Manager updateAdressByManagaerId(String newAddress , int managerId ) {
		
		System.out.println("INSIDE updateAdressByManagaerId METHOD");
		for(int b = 0; b < manager.length; b++ ) {
			
			if(manager[b].managerId == managerId ) {
				
				System.out.println("the current address is: " + manager[b].address);
				manager[b].address = newAddress;
				System.out.println("THE UPDATED DETAILS OF THE MANAGER IS: ");
				System.out.println(manager[b].managerId + " " + manager[b].managerName + " " + manager[b].age + " " + manager[b].gender + " " + manager[b].contactNo + " " + manager[b].address + " " + manager[b].qualification);

			}
		}
		System.out.println("END OF updateAdressByManagaerId METHOD");
		return null;
	}

}
