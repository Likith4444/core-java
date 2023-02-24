package com.xworkz.someapp;

public class Riding extends Loading{
	
	/*@Override
     public double a(int y) {
		
		System.out.println("a method with is overridden");
		super.a(12);
		return 1234.0;
	}*/
	
    public double a(int x, int y) {
		
		System.out.println("a method with 2 parameters ...riding class");
		return 410;
	}
	
	public static void main(String[] args) {
		
		Loading l = new Riding();
		l.a(0);
		
		
	}

}
