package com.xworks.java8.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Lesser {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(437);
		list.add(88);
		list.add(2436);
		list.add(4678);
		list.add(1);
		list.add(47);
		list.add(8);
		list.add(26);
		list.add(47);
		list.add(120);
		list.add(370);
		list.add(1288);
		list.add(36);
		list.add(98);
		list.add(3095);
		list.add(70);
		list.add(981);
		list.add(96);
		list.add(981);
		
		System.out.println("printing numbers lesser than 100:");
		System.out.println("using iterator");
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			Integer inte = itr.next();
			if(inte<=100) {
			
				System.out.println(inte);
			}
		}
		
		System.out.println("displaying all elements using stream");
		list.stream().forEach(inte -> System.out.println(inte));
		System.out.println("printing numbers lesser than 100:");
		System.out.println("using stream");
		List<Integer> less = list.stream().filter(inte -> inte<=100).collect(Collectors.toList());
		System.out.println(less);
		
	}

}
