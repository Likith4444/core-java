package com.xworkz.someapp;

import java.util.Scanner;

import com.xworkz.someapp.Factorial.PrimeNumber;

public class PrimeTester {
	
	public static void main(String[] args) {
		PrimeNumber p1 = new PrimeNumber();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scan.nextInt();
		p1.prim(num);
		scan.close();
		
	}

}
