package com.xworkz.abc;

public class Divide {
	
	public static void main(String[] args) {
		
		System.out.println("main method started");
		div(1,0);
		System.out.println("main method ended");
		
		
	}

	private static void div(int i, int j) {

		System.out.println("div method started");
		
		try {
        System.out.println(i/j);
		}catch(ArithmeticException e) {
			
			System.out.println("cannot divide any number by zero");
		}
		System.out.println("div method ended");

	}

}
