package com.xworkz.testprogrammes;

public class ArrayOPrime {
	
	public static void main(String[] args) {
		
		int a[] = {23,45,12,56,67,89,10};
	
		
		for(int i=0; i <a.length; i++) {
			int count = 0;
			
		for(int j=1; j <= a[i]; j++) {
			
			if(a[i]%j == 0 ) {
				
				count = count+1;
				
			}
			
		}
		
		if(count ==2) {
			
			System.out.println(a[i] + " " + "is a prime number");
			
		}else {
			
			System.out.println(a[i] + " " + "is not a prime number");
		}
		System.out.println("count= " + count);
		
		}
		
		
	}

}
