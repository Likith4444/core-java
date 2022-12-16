class Zomato{

        public static double searchItem(String item){
	  
	 System.out.println("invoked searchItemItem method");
	  
	  
	     if(item == "pulao"){  
	     System.out.println("The Item Searched Is :" + item );  
	     return 50.00;
	     }
	  
	  
	     if(item == "fried rice"){  
	     System.out.println("The Item Searched Is :" + item );  
	     return 125.20;
	     }
	  
	     if(item == "chicken 65"){  
	     System.out.println("The Item Searched Is :" + item ); 
	     return 120.50;
	     }
	  
	  
	     if(item == "Biryani"){  
	     System.out.println("The Item Searched Is :" + item ); 
	     return 160.00;
	     }
	  
	     if(item == "paroto"){  
	     System.out.println("The Item Searched Is :" + item ); 
	     return 123.00;
	     }
	  
	     else{
	     System.out.println("ITEM IS NOT AVAILABLE");
	     }
		 
	     System.out.println("end of searchItem method");
	     return 0.00;
	  
	     }
	  
	     public static double searchItem(String item, int quantity){
		  
		  System.out.println("invoked searchItemItem2 method");
		  if (item == "pulao"){
			  
		   System.out.println("The Item Searched Is :" + item );
		    System.out.println("the no of quantity is :" + quantity);
		   return 50.00 * quantity;
		  }
		  
		  if(item == "fried rice"){  
	       System.out.println("The Item Searched Is :" + item );  
		   System.out.println("the no of quantity is :" + quantity);
	     return 125.20 * quantity;
	     }
	  
	      if(item == "chicken 65"){  
	      System.out.println("The Item Searched Is :" + item ); 
		  System.out.println("the no of quantity is :" + quantity);
	        return 120.50 * quantity;
	     }
	  
	  
	      if(item == "Biryani"){  
	       System.out.println("The Item Searched Is :" + item ); 
		   System.out.println("the no of quantity is :" + quantity);
	       return 160.00 * quantity;
	     }
	  
	       if(item == "paroto"){  
	     System.out.println("The Item Searched Is :" + item ); 
		 System.out.println("the no of quantity is :" + quantity);
	       return 123.00 * quantity;
	     }
	  
	     else{
	     System.out.println("ITEM IS NOT AVAILABLE");
	     }
	     System.out.println("end of searchItem2 method");
	     return 0.00;
		  
		  
		  
		  
		  
		  
	  }
}