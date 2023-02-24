package com.xworkz.collectionframe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Collect {
	
	public static void main(String[] args) {
		
		/*Object object[] = {"abc",'d',12,1234.43};
		object class array can store heterogenous type of data but it isnt dynamic in nature
		for(Object obj: object) {
			System.out.println(obj);*/
			
			Collection list = new ArrayList();
			
			System.out.println("is list empty :" + list.isEmpty());
			
			list.add("aa");
			list.add(13);
			list.add(22);
			list.add('a');
			list.add('d');
			list.add(123l);
			list.add(66l);
			list.add(72.12);
			list.add(1000);
			list.add("liki");
			list.add('e');
			list.add('i');
			list.add('p');
			list.add('Q');
			list.add("la");
			list.add("AoBoC");
			list.add(11);
			list.add(12345.01);
			list.add(910101l);
			list.add(91919191.91);
			list.add("LIKITH RM");
			
			System.out.println(list);
			System.out.println("size of list before remove is " + list.size());
			list.remove('a');
			list.remove(11);
			System.out.println(list);
			System.out.println("size of list after remove is " + list.size());
			System.out.println("is list empty :" + list.isEmpty());
			
			System.out.println(list.contains("aa"));
			System.out.println(list.contains("liki"));
			System.out.println(list.contains('i'));
			System.out.println(list.contains(733.1));
			System.out.println(list.contains('u'));
			
			Collection que = new LinkedList();
			
			System.out.println("is que empty :" + que.isEmpty());
			
			que.add("aane");
			que.add(921);
			que.add(2092);
			que.add('v');
			que.add('u');
			que.add(13l);
			que.add(600l);
			que.add(7.012);
			que.add(1);
			que.add("oooo");
			que.add('h');
			que.add('i');
			que.add('z');
			que.add('M');
			que.add("LaLa");
			que.add("BoB");
			que.add(10203040.5060);
			que.add(99999.01);
			que.add(11l);
			que.add(112311.91);
			que.add("LIKI_RM");
			
			System.out.println(que);
			System.out.println("size of que before remove is " + que.size());
			que.remove('z');
			que.remove(13l);
			System.out.println(que);
			System.out.println("size of que after remove is " + que.size());
			System.out.println("is que empty :" + que.isEmpty());
			
			System.out.println(que.contains("BoB"));
			System.out.println(que.contains("LIKI_RM"));
			System.out.println(que.contains('x'));
			System.out.println(que.contains(3.1));
			System.out.println(que.contains(7215));
			
			System.out.println("==============================BULK OPERATIONS=====================================");
			
			System.out.println(que.containsAll(list));
			System.out.println(que.addAll(list));
			
			System.out.println(que);
			System.out.println(que.size());
			
			System.out.println(que.removeAll(list));
			System.out.println(que);
			System.out.println(que.size());
			
		}
		
	}

//it is a collection or group of interfaces and classes is called frameworks
//collections in java is an interface(it is an object in java)
//java.util package
//collection is the root interface in the collection hierchary
//collection framework syntax: interface ref = new Implclass();


