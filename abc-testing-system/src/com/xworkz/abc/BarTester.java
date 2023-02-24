package com.xworkz.abc;

import com.xworkz.abc.bar.Bar;
import com.xworkz.abc.bar.Stall;

public class BarTester {
	
	public static void main(String[] args) {
		
		Bar bar1 = new Bar(1, "NARAYANA WINE STORE", "RAJAJINAGAR", "RAJU");
		System.out.println(bar1.toString());

		Bar bar2 = new Bar(2, "MANJU WINE STORE", "YESHWANTPUR", "MANJUNATH");
		System.out.println(bar2.toString());
		
		Bar bar3 = new Bar(3, "shree WINE STORE", "jaynagar", "shivu");
		System.out.println(bar3.toString());
		
		System.out.println("comparing if any data in bar1 and bar2 are same");
		System.out.println(bar1.equals(bar2));//false-bcoz ref compare takes place and both have different ref
		System.out.println("comparing if any data in bar2 and bar2 are same");
		System.out.println(bar2.equals(bar2));
		
		Bar s1 = new Stall(1, "raghu store", "udupi", "raghu");
		
		System.out.println(bar1.equals(bar3));
		
		System.out.println(bar1.hashCode());
		System.out.println(bar2.hashCode());


		
	}

}
