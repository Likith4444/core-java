class BigBasketTester{

       public static void main(String b[]){
	   
	   int cost = BigBasket.searchItem("Egg");
	   System.out.println("The cost of the searched item is: " + cost);
	   
	   int costWithQuantity = BigBasket.searchItem("Egg", 5);
	   System.out.println("The cost of the searched item is: " + costWithQuantity);
	   
	  
	   }

}