package com.xworkz.testprogrammes;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String str = "    likith  ";
		String str1 = "liKI";
		
		System.out.println("contains method");
		System.out.println(str.contains(str1));
		
		System.out.println("substring method");
		System.out.println(str.substring(0 , 3));
		
		System.out.println(str.compareTo(str1));
		
		System.out.println(str.join(str1, args));
		
		System.out.println(str.replace('l', 'n'));
		
		System.out.println(str.replaceAll(str, "abc"));
		
		System.out.println(str.replaceFirst(str, str1));
		
		System.out.println(str.charAt(1));
		
		System.out.println(str.getBytes());
		
		System.out.println(str.indexOf("t"));
		
		System.out.println(str.compareTo(str1));
		
		System.out.println(str.compareToIgnoreCase(str1));
		
		System.out.println(str.trim());
		
		System.out.println(str.format(str1, args));
		
	}

}
