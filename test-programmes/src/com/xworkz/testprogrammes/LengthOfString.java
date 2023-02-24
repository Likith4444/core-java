package com.xworkz.testprogrammes;

public class LengthOfString {
	
	
	public static void main(String[] args) {
		
		String a="ddgjb";
		int count=0;
		System.out.println("the string length to be counted is= " + a);
		char ch[] =a.toCharArray();
		for(int i=0; i<ch.length;i++) {
			
			
			count= count + 1;
		}
		
		System.out.println("the no of characters in string is= " + count);
	}

}
