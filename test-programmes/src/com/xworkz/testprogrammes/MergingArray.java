package com.xworkz.testprogrammes;

public class MergingArray {
	
	//merging 2 arrays
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4};
		int b[] = {6,7,5};
		int n1 = a.length;
		int n2 = b.length;
		int n = n1+n2;
		int c[] = new int[n];
		
		for(int i=0; i<n1; i++) {
			
			c[i]=a[i];
			
		}
		
		for(int i=0; i<n2; i++) {
			
			c[n1+i] = b[i];
			
		}
		
		System.out.println("merged array elements are:");
		for(int i=0; i<n; i++) {
			
			System.out.println(c[i]);
			
		}
		
	}

}
