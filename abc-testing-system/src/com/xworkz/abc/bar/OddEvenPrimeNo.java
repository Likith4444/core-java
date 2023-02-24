package com.xworkz.abc.bar;

public class OddEvenPrimeNo {
	
	static int a[] = {33,6,78,7,11,44,91};
	public static void evenOdd() {
		
		System.out.println("Checking array numbers are odd or even");
		for(int i=0; i < a.length; i++) {
			if(a[i]%2==0) {
				System.out.println(a[i] + " the number is even");
				int even = (a[i]+2);
				int even1 = even*even;
				System.out.println(even1);
			}else {
				
				System.out.println(a[i] + " the number is odd");
				int odd = (a[i]-2);
				int odd1 = odd*odd;
				System.out.println(odd1);
			}
		}
	}
	
	public static void prime() {
		
		System.out.println("Checking array numbers are prime or not");
		for(int i=0; i <a.length; i++) {
			int count = 0;
			
		for(int j=1; j <= a[i]; j++) {
			
			if(a[i]%j == 0 ) {
				
				count = count+1;	
			}
		}
		if(count ==2) {
			
			System.out.println(a[i] + " is a prime number");
			int prime = a[i]*a[i];
			System.out.println(prime);
			
		}else {
			
			System.out.println(a[i] +" is not a prime number");
		}
		}
	}

	public static void main(String[] args) {
	
		Program.evenOdd();
		Program.prime();
		
		}
		
	
}
