package com.xworkz.testtwo;

import com.xworkz.testtwo.shop.IcecreamShop;
import com.xworkz.testtwo.shop.Shop;

public class IcecreamShopTester {

	public static void main(String[] args) {
		
		Shop s2 = new IcecreamShop();
		long diss = s2.doBuisness();
		System.out.println(diss);
		
	}
	
}
