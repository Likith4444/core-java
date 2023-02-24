package com.xworkz.testprogrammes;

public class ProductOfArray {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6};
		int pro = 1;
		
		for(int i = 0; i < a.length; i++) {
			
			pro = pro * a[i];
			
		}
		
		System.out.println("the product of this array is: " + pro);
		
	}

}
