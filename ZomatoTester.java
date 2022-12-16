class ZomatoTester{

     public static void main(String z[]){
		 
		 System.out.println("the main method is started");
	 
        double price = Zomato.searchItem("pulao");
		
		 System.out.println("The cost of the item is: " + price );
		
		double itemWithQuantity = Zomato.searchItem("pulao", 3 );
		
	    System.out.println("The cost of the item is: " + itemWithQuantity);
		
		
	 System.out.println("the main method is ended");
	} 
}