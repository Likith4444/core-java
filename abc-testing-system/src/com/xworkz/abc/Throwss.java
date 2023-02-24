package com.xworkz.abc;

import java.io.File;
import java.io.IOException;

public class Throwss {
	
	public static void main(String[] args)  {
		
		System.out.println("main method started");
		try {
			m1();
		}catch(ClassNotFoundException e) {
		e.printStackTrace();
		}

		aZz
		System.out.println("main method ended");
	}
	
	private static void m1() throws ClassNotFoundException{
		
		System.out.println("m1 method started");
		m2();
		System.out.println("m1 method ended");
		
	}
	
    private static void m2() throws ClassNotFoundException{
		
		System.out.println("m2 method started");
		m3();
	    /*File file = new File("abc");
	    file.createNewFile();*/
	    System.out.println("m2 method ended");

     }
    
     private static void m3() throws ClassNotFoundException{
		
		System.out.println("m3 method started");
        Class cls = Class.forName("com.xworkz.abc.Throw");
        System.out.println("m3 method ended");
     }
}