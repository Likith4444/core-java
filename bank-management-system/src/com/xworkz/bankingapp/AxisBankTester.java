package com.xworkz.bankingapp;

import java.util.Scanner;

import com.xworkz.bankingapp.bank.AxisBank;
import com.xworkz.bankingapp.bank.Bank;
import com.xworkz.bankingapp.customer.Customer;
import com.xworkz.bankingapp.exception.CityNotUpdatedException;
import com.xworkz.bankingapp.exception.CustomerNotFoundException;

public class AxisBankTester {
	
	public static void main(String[] args) {
		
        System.out.println("another method started");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size");
		int size = scan.nextInt();
		
		Bank b1 = new AxisBank(size);
		for(int i = 0; i  < size; i++) {
			
			Customer cust = new Customer();
			
			System.out.println("enter the customer id");
			int customerId = scan.nextInt();
			cust.setCustomerId(customerId);
			
			System.out.println("enter customer name");
			String customerName = scan.next();
			cust.setCustomerName(customerName);
			
			System.out.println("enter customer city");
			String city = scan.next();
			cust.setCity(city);
			
			System.out.println("enter customer contactno");
			long contactNo = scan.nextLong();
			cust.setContactNo(contactNo);
			
			b1.addCustomer(cust);
			
		}
		
		b1.getAllCustomer();
		
		System.out.println("enter the customerId and new city");
	    try {
			b1.updateCityByCustomerId(scan.nextInt(), scan.next());
		} catch (CityNotUpdatedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		try {
			System.out.println("enter customer id to get customer details");
			b1.getCustomerByCustomerId(scan.nextInt());
			
			System.out.println("enter customer id to get customer details");
			b1.getCustomerByCustomerName(scan.next());
	
		//casting-->only when polymorphism is done it comes.
		//AxisBank a1 = (AxisBank)b1;
		//a1.dis();
	} catch (CustomerNotFoundException e) {
		System.out.println("invalid entry");
		e.printStackTrace();
	}
	
    finally {
		
		if(scan != null) {
			scan.close();
		}
	}
         
		
		
		System.out.println("another method ended");
		
		
	}

}
