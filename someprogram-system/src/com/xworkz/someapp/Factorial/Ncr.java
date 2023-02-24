package com.xworkz.someapp.Factorial;

public class Ncr {
	
	//ncr = n!/((n-r)!*r!)
	
	public int ncrFact(int n, int r) {
		
		int numerator,denominator,total;
		 numerator = n;
		 for(int i=n-1; i >= 1;i-- ) {
				
				numerator = numerator*i;
			}
			System.out.println("numerator = " + numerator);
			
		int a;
		a = n-r;
		denominator = a;
		for(int j = a-1; j >= 1; j--) {
			
			denominator = denominator*j;
		}
		System.out.println("before r!...denominator = " + denominator);
		
		for(int k = r-1; k >= 1; k--) {
		
			r=r*k;
			
		}
		int deno = denominator*r;
		
		System.out.println( "denominator = " + deno);
		total = numerator / deno;
		System.out.println("ncr of " + total);
		return total;
		}
		
	}


