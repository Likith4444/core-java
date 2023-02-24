package com.xworkz.testprogrammes;

public class ReverseArray {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		
		System.out.println("the reversed array:");
		for(int i = (a.length-1); i >= 0; i--) {
			
			System.out.println(a[i]);
			
		}
		
	}

}
