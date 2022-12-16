class BagTester{

      public static void main(String b[]){
	  
	  Bag b1 = new Bag();
	  
	  b1.brand = "GEAR ";
	  System.out.println( b1.brand + "BAG  DESCRIPTION: ");
	  b1.typeOfBag = "SCHOOL BAG ";
	  b1.color = "BLUE";
	  b1.capacity =  26;
	  b1.cost =  890.00;
	  System.out.println(b1.brand + "\n" + b1.typeOfBag + "\n" + b1.color + "\n" + b1.capacity + "L" + "\n" + b1.cost + "\n" );
	  
      
	  Bag b2 = new Bag();
	  
	  b2.brand = "SKYBAGS ";
	  System.out.println( b2.brand + "BAG  DESCRIPTION: ");
	  b2.typeOfBag = "OFFICE BAG ";
	  b2.color = "BLACK";
	  b2.capacity =  33;
	  b2.cost =  1190.00;
	  System.out.println(b2.brand + "\n" + b2.typeOfBag + "\n" + b2.color + "\n" + b2.capacity + "L" + "\n" + b2.cost + "\n" );
	  

	  
	  Bag b3 = new Bag();
	  
	  b3.brand = "AMERICAN TOURISTER ";
	  System.out.println( b3.brand + "BAG  DESCRIPTION: ");
	  b3.typeOfBag = "LAPTOP BAG ";
	  b3.color = "YELLOW";
	  b3.capacity =  30;
	  b3.cost =  990.00;
	  System.out.println(b3.brand + "\n" + b3.typeOfBag + "\n" + b3.color + "\n" + b3.capacity + "L" + "\n" + b3.cost + "\n" );
	  

	  
	  Bag b4 = new Bag();
	  
	  b4.brand = "HRX ";
	  System.out.println( b4.brand + "BAG  DESCRIPTION: ");
	  b4.typeOfBag = "GYM BAG ";
	  b4.color = "RED";
	  b4.capacity =  20;
	  b4.cost =  590.00;
	  System.out.println(b4.brand + "\n" + b4.typeOfBag + "\n" + b4.color + "\n" + b4.capacity + "L" + "\n" + b4.cost + "\n" );
	  

}
}