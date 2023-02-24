package com.xworkz.someapp.Factorial;

public class PrimeNumber {
	
	public int prim(int num) {
	
	int count = 0;
	
	
	for(int i=1; i<= num;i++){
		
		if(num%i == 0){
			
			count = count+1;
			
		}
	}
	System.out.println("count = " + count);
	
	if(count ==2){
		
		System.out.println(num + "the num is prime no");
	}else{
		
		System.out.println(num + "is not a prime no");
	}
	System.out.println("count = " + count);
	return count;

	}
}
