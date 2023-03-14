package com.xworks.java8.lamdaexp;

import java.util.Scanner;

public class Tester {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//lambda exp
		//bufferreader
		//stream
		System.out.println("addition of 2 numbers");
		Addition ad = (a,b)-> 
		{System.out.println(a+b);
		System.out.println("enter 2 numbers to be added");
		};
		ad.add(scan.nextInt(), scan.nextInt());
		
		
		
		
		System.out.println("substraction of 2 numbers");
		Substraction sub = (c,d)-> 
		{System.out.println(c-d);
		System.out.println("enter 2 numbers to perform substraction");
		};
		sub.substraction(scan.nextInt(), scan.nextInt());
		
		System.out.println("multiplication of 2 numbers");
		Multiplication mul = (e,f)-> System.out.println(e*f);
		System.out.println("enter 2 numbers to be multiplied");
		mul.multiply(scan.nextInt(), scan.nextInt());
		
		System.out.println("division of 2 numbers");
		Division div = (g,h)-> System.out.println(g/h);
		System.out.println("enter 2 numbers to perform division");
		div.division(scan.nextInt(), scan.nextInt());
		
		System.out.println("modulus of 2 numbers");
		Modulus mod = (i,j)-> System.out.println(i%j);
		System.out.println("enter 2 numbers to perform modulus");
		mod.modulus(scan.nextInt(), scan.nextInt());
		
	}

}
