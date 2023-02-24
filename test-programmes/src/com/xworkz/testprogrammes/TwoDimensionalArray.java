package com.xworkz.testprogrammes;

public class TwoDimensionalArray {
	
	public static void main(String[] args) {
		
		int twod[][] = {{2,4,1,6,7,},{11,15,12,19,14}};
		//int a[][] = new int[4][5];
		int mult[][] = new int[5][5];
		for(int i=0; i<twod.length; i++) {
			
			
			System.out.println("length of 1st array is " + twod[i].length);
			for(int j=0;j<5; j++) {
				
				//System.out.println(twod[i][j]);
				int temp;
				System.out.println(twod[i][j]*twod[i][j]);
				mult[i][j] =0;
				for(intk=0;k<5;k++) {
					
					mult[i][j]
					
				}
				
			}
			
		}
		
	}

}
