package com.xworkz.abc;

public class Testerr {
	
	public Testerr() {

	System.out.println("object is created ");
	//this()//compile time error constructor 
	Testerr test = new Testerr();
	System.out.println(test);
	
	}
	
	public static void main(String[] args) {
		
		System.out.println("main started");
		Testerr test = new Testerr();
		System.out.println(test);
		System.out.println("main started");

		
	}

}
