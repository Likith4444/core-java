package com.xworkz.someapp;

import java.util.Scanner;

import com.xworkz.someapp.Factorial.Factorial;

public class FactorialTester {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		   
		   Factorial fff = new Factorial();
		   System.out.println("enter the number");
		   long num = scan.nextLong();
		   
		   fff.facto(num);
		scan.close();
	}

}
