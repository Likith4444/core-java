package com.xworkz.testprogrammes;

public class SumOfArray {
	
	public static void main(String[] args) {
		
		int a[] = {23,45,12,56,67,89,10};
		int sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			
			sum = sum + a[i];
			
		}
		
		System.out.println("the sum of this array is: " + sum);
	}

}
