class Zomato{

        public static double searchItem(String item){
	  
	 System.out.println("invoked searchItemItem method");
	  
	  
	     if(item == "pulao"){  
	     System.out.println("The Item Searched Is :" + item );  
	   return 50.00;
	    }
	  
	  if(item == "pav bhaji"){  
	      System.out.println("The Item Searched Is :" + item );  
	     return 80.00;
	  }
	  
	      if(item == "roti"){  
	     System.out.println("The Item Searched Is :" + item );  
	  return 140.00;
	  }
	  
	  if(item == "french fries"){  
	      System.out.println("The Item Searched Is :" + item ); 
	    return 100.00;
	  }
	  
	    if(item == "fried rice"){  
	  System.out.println("The Item Searched Is :" + item );  
	   return 125.20;
	  }
	  
	   if(item == "chicken 65"){  
	     System.out.println("The Item Searched Is :" + item ); 
	    return 120.50;
	  }
	  
	  if(item == "masala dosa"){  
	      System.out.println("The Item Searched Is :" + item );   
	    return 90.00;
	  }
	  
	    if(item == "rajma chawal"){  
	      System.out.println("The Item Searched Is :" + item ); 
	     return 100.00;
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
}