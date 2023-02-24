package com.xworkz.someapp;

public class Stat {
	
	static int a = 10;
	
	public static int test() {
		
		
		System.out.println("inside static int test method");
		return 100;
	}
	
	public static void main(String[] args) {
		
		Stat s = new Stat();
		s.test();
		s.a;
		Stat.a;
	}

}
