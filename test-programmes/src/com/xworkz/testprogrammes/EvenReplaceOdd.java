package com.xworkz.testprogrammes;

public class EvenReplaceOdd {//replacing even no with next odd no and odd no with next even no//
	
	public static void main(String[] args) {
		
		int a[] = {2,4,9,5,2,3,1,8,6,10};
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]%2==0) {
				
				System.out.println(a[i] + " is an even number");
				int temp=a[i];
				
				System.out.println("the next odd number to " + a[i] + " is ");
				int odd = temp+1;
				a[i]=odd;
				
			}
			else
			{
				System.out.println(a[i] + "is an odd number" );
				int temp1 = a[i];
				
				System.out.println("the before even number to " + a[i] + " is");
				int even = temp1-1;
				a[i] = even;
				
			}
			
		}
		System.out.println("final array");
		for(int i=0; i<a.length; i++) {
			
			 System.out.println(a[i]);
		
		}
	}

}
