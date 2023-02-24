package com.xworkz.testprogrammes;

public class StringCompare {
	
	public static void main(String[] args) {
		
		String str1 = "null";
		String str2 = new String("null");
		String str3 = "null";
		
		System.out.println("compare 2 strings by ==");
		System.out.println(str1 == str2);
		
		System.out.println("compare 2 strings by equals method");
		System.out.println(str1.equals(str2));
		
		String name = "LIKITH";
		String name1 = "likith";
		String a ="1";
		
		System.out.println("name = " + name);
		System.out.println("is equals ignore case = " + name.equalsIgnoreCase(name1));
		System.out.println("substring = " + name.substring(3,6));
		System.out.println(name + " contains " + "LIKI" + " " + name.contains("LIKI"));
		System.out.println("length = " + name.length());
		//name = name + " R";
		//name = name.concat("M");
		System.out.println("index = " + name.indexOf('L'));
		System.out.println(a.hashCode());

		
		//System.out.println("name = " + name);
		
		StringBuffer buff = new StringBuffer();
		buff.append(name).append(name1);
		System.out.println("name = " + buff);

		
	}

}
