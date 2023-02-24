package com.xworkz.arrays;

import java.util.Arrays;

public class ArraysMethodsAndFinilize {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("calling finalize method to clean object after making the object null");
	}
	
	public static void main(String[] args) {
	
	int  a[] = {1,6,9,2,99,44,3};
	int b[] = {56,23,50,91,11,5};
	
	System.out.println("creating object of Testing");
	ArraysMethodsAndFinilize test = new ArraysMethodsAndFinilize();
	/*System.out.println("ref test is made null");
	test  = null;
	System.out.println("gc is called and internally it calls the finilize method");
	System.gc();*/ 
	
	System.out.println("creating another object of Testing");
	ArraysMethodsAndFinilize test1 = new ArraysMethodsAndFinilize();
	System.out.println("initilizing newly created object to the older object");
    test=test1;
	
    System.out.println("calling the gc and internally finalize method is called");
	System.gc();
	
	
	/*for(int abc : a) {
		System.out.println(abc);
	}
	
	System.out.println(Arrays.binarySearch(a, 99));
    System.out.println(Arrays.binarySearch(b, 2, 4, 91));
	//System.out.println(Arrays.compare(a, b));
	//System.out.println(Arrays.compare(a, 1, 3, b, 2, 4));
	System.out.println(Arrays.equals(a, b));
	//System.out.println(Arrays.equals(a, 1, 4, b, 1, 4));
	System.out.println(Arrays.hashCode(a));
	System.out.println(Arrays.toString(a));
	//System.out.println(Arrays.mismatch(a, b));
	System.out.println(Arrays.copyOf(a, 4));
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	
	Arrays.sort(a, 2, 6);
	System.out.println(Arrays.toString(a));
	
	
	long c[] = {11,16,97,2,9,404,31};
	long d[] = {86,23,10,91,81,3,59};
	
	System.out.println(Arrays.binarySearch(c, 31));
    System.out.println(Arrays.binarySearch(d, 2, 4, 81));
	System.out.println(Arrays.compare(c, d));
	System.out.println(Arrays.compare(c, 1, 3, d, 2, 4));
	System.out.println(Arrays.equals(c, d));
	System.out.println(Arrays.equals(c, 1, 4, d, 1, 4));
	System.out.println(Arrays.hashCode(c));
	System.out.println(Arrays.toString(d));
	System.out.println(Arrays.mismatch(c, d));
	System.out.println(Arrays.copyOf(d, 5));
	Arrays.sort(c);
	System.out.println(Arrays.toString(c));
	Arrays.sort(d, 1, 5);
	System.out.println(Arrays.toString(d));
	
	
	
	double e[] = {123.1,52.1,0.23,81.72,91.01};
	double f[] = {5.10,1.99,50.78,9.91,59.99};
	
	System.out.println(Arrays.binarySearch(e, 123.22));
    System.out.println(Arrays.binarySearch(f, 2, 4, 9.91));
	System.out.println(Arrays.compare(e,f));
	System.out.println(Arrays.compare(e, 1, 3, f, 2, 4));
	System.out.println(Arrays.equals(e, f));
	System.out.println(Arrays.equals(e, 1, 3, f, 1, 3));
	System.out.println(Arrays.hashCode(e));
	System.out.println(Arrays.toString(f));
	System.out.println(Arrays.mismatch(e, f));
	System.out.println(Arrays.copyOf(f, 4));
	
	Arrays.sort(e);
	System.out.println(Arrays.toString(e));
	Arrays.sort(f, 2, 6);
	System.out.println(Arrays.toString(f));
	
	
	
	char g[] = {'a','b','c','d'};
	char h[] = {'A','B','C','D'};
	
	System.out.println(Arrays.binarySearch(g, 'c'));
    System.out.println(Arrays.binarySearch(h, 1, 3, 'B'));
	System.out.println(Arrays.compare(g, h));
	System.out.println(Arrays.compare(g, 1, 3, h, 2, 3));
	System.out.println(Arrays.equals(g, g));
	System.out.println(Arrays.equals(e, 1, 3, h, 1, 3));
	System.out.println(Arrays.hashCode(g));
	System.out.println(Arrays.toString(h));
	System.out.println(Arrays.mismatch(g, h));
	System.out.println(Arrays.copyOf(g, 2));
	Arrays.sort(g);
	System.out.println(Arrays.toString(g));
	Arrays.sort(h, 1, 3);
	System.out.println(Arrays.toString(h));
	
	}*/
	}
}
