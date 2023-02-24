package com.xworkz.testprogrammes;

public class Wrapper {

	public static void main(String[] args) {
		
		byte q = 44;
		int q1 = q;   //widening or implicit casting//
		short q2 = (short)q1;  //explicit casting//
		
		
		byte b = 1;
		Byte b1 = b;
		System.out.println(b1);
		
		short s = 2;
		Short s1 = s;
		
		int i = 123;
		Integer i1 = i;  //boxing // and reverse is called unboxing//
		int a = i1.intValue();//unboxing using methods of wrapper class//
		
		
		long l = 22l; 
		Long l1 = l;
		l1.intValue();
		
		double d = 11.33;
		Double d1 = d;
		
		float f = 12.44f;
		Float f1 = f;
		
		char c = 'h';
		Character c1 = c;
		
		boolean bol = true;
		Boolean bol1 = bol;
	
		String age = "23";
		int age1 = Integer.parseInt(age);
		System.out.println("age = " + age1);  // similar to all types
		
	}
	
	
}
