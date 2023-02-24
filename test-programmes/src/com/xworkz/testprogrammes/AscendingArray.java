package com.xworkz.testprogrammes;

public class AscendingArray {
	
	public static void main(String[] args) {
		
		int a[] = {5,1,3,2,4,0};
		int temp;
		
		for(int i=0; i<a.length; i++) {
			
			for(int j=i+1; j<a.length; j++) {
				
				if(a[i] > a[j]) {
					
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					
				}
				
			}
			
		}
	
		System.out.println("ascending order array: ");
		for(int i=0;i<a.length; i++) {
			
			System.out.println(a[i]);
			
		}
		
	}

}
