package com.xworkz.someapp.Factorial;

public class Factorial {
	
	 public long facto(long num){
		   
		   long fact = 1;
		   for(long i = num; i >= 1; i--){
		   
		   fact = fact*i;
		   
		   }
		   System.out.println("factorial of " + num + "is: " + fact);
		   return fact;
		   }

}
