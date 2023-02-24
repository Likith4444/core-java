package com.xworkz.testprogrammes;

public class AdditionTwoArray {
	
	//addition of 2 array elements
	
	public static void main(String[] args) {
		
		
		int a[] = {1,2,3};
		int b[] = {4,5,6};
		int c[] = new int[3];
		
		for(int i=0; i<a.length; i++) {
			
			for(int j=0; j<b.length; j++) {
				
				c[i] = a[i]+b[j];
				
			}
			
			
		}
	
		System.out.println("the added array elements are:");
		for(int i=0; i<c.length; i++) {
			
			System.out.println(c[i]);
			
		}
		
	}

}
