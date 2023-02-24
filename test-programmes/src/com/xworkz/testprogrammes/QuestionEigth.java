package com.xworkz.testprogrammes;

public class QuestionEigth {
	
	public static void main(String[] args) {
		
		for(int num = 0; num < 100; num++) {
			
			if(num % 5 == 0 && num % 10 == 0) {
				
				System.out.println("the number " + num + " is multiple of 5 and 10");
				
			}
			else {  //if required can remove else statement to get only output for only multiples of 5 & 10
				
				System.out.println("the number " + num + " is not a multiple of 5 and 10");
				
			}
			
			
		}
		
		
	}

}
