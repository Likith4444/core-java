package com.xworkz.abc;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CompiletimeException {
	
	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		
		try {
			Class cls = Class.forName("com.xworkz.abc.CompiletimeException");
			System.out.println(cls);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<11; i++) {
		
		System.out.println("enter the file name to be created");	
		File file = new File(scan.next());
	
		try {
		
			file.createNewFile();
		
		}catch(IOException e) {
			System.out.println("new file not created");
		}
		}
			System.out.println("main method ended");
		    scan.close();
	}//exception handled during compile time 

}
