package com.xworks.java8.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ReadData {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(437);
		list.add(88);
		list.add(2436);
		list.add(4678);
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			int inte = itr.next();
			if(inte%2==0) {
				System.out.println(inte);
			}
		}
		
		list.stream().forEach(inte -> System.out.println(inte));
		List<Integer> listOdd = list.stream().filter(inte -> (inte%2!=0)).collect(Collectors.toList());
		System.out.println("odd numbers in list" + listOdd);
		
	}

}
