class GroceryShopTester{

       public static void main(String g[]){
		   
	   
	   System.out.println("MAIN METHOD IS STARTED");
	   
	   String items[] = {"RICE","WHEAT","SPICES","SALT","SUGAR","JUICE","CHOCOLATE","SHAMPOO"} ;
	  
	   GroceryShop shop1 = new GroceryShop( 1, "Ganesh Store", "1ST BLOCK,RAJAJINAGAR,BANGLORE - 5736547" ,"Ganesha", items);
	   shop1.display();
	   
	   System.out.println("MAIN METHOD ENDED");
       }

}