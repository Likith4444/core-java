package com.xworkz.abc.bar;

public class StringReverse {
	
	public static void main(String[] args) {
		
		String a = "abc";
		char[] c = a.toCharArray();
		//System.out.println(c);
		for(int i= c.length-1; i>=0; i--) {
			
			System.out.print(c[i]);
			
		}
		
	}

}
