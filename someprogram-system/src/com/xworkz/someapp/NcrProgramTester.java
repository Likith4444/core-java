package com.xworkz.someapp;

import java.util.Scanner;

import com.xworkz.someapp.Factorial.Ncr;

public class NcrProgramTester {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the n and r values");
		int n = scan.nextInt();
		int r = scan.nextInt();
		Ncr n1 = new Ncr();
		n1.ncrFact(n, r);
		scan.close();
	}

}
