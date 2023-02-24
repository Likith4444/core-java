package com.xworkz.testprogrammes;

public class DuplicateElementsArray {
	
	//remove duplicate elements in an array
	
	public static void main(String[] args) {
		
		int a[] = {3,4,8,1,2,3,4,8,9,5};
		int n = a.length;
		
		for(int i=0; i<n; i++) {
			
			System.out.println(a[i]);
			
		}
		
		for(int i=0; i<n; i++) {
			
			for(int j=i+1; j<n; j++) {
				
				if(a[i] == a[j]) {
					
					
					
				} 	
				
			}
			
		}
	
		System.out.println("new array elements are:");
		for(int i=0; i<n; i++) {
			
			System.out.println(a[i]);
			
		}
		
	}
	
}
