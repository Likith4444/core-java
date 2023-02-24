package com.xworkz.someapp;

import java.util.Scanner;

import com.xworkz.someapp.Factorial.Npr;

public class NprProgramTester {
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("enter values for n and r");
		int n = scan.nextInt();
		int r = scan.nextInt();
		
		Npr n1 = new Npr();
		n1.nprFact(n, r);
		
		scan.close();
	}
	
}
