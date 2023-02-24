package com.xworkz.testprogrammes;

public class SquareArrayElements {
	
	//square of array elements
	
	public static void main(String[] args) {
		
		int a[] = {2,8,4,5,9};
		System.out.println("length of array is: " + a.length);
		
		System.out.println("the array elements to be squared are:");
		for(int i=0; i<a.length; i++) {
			
			System.out.println(a[i]);
			
		}

		for(int i=0; i<a.length; i++) {
			
			a[i] = a[i]*a[i];
			
		}
		
		System.out.println("the squared array elements are:");
		for(int i =0; i<a.length; i++) {
			
			System.out.println(a[i]);
			
		}
		
	}

}
