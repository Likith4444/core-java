class Swiggy{

      public static void findItem(String item){
	  
	  System.out.println("invoked findItem method");
	  
	  
	  if(item == "Rice"){  
	  System.out.println("The Searched Item Is :" + item ); 
       System.out.println("The PRICE OF RICE IS 50" ); 
	  return ;
	  }
	  
	  if(item == "Chapati"){  
	  System.out.println("The Searched Item Is :" + item );  
	  System.out.println("The PRICE OF CHAPATI IS 60" ); 
	  return ;
	  }
	  
	  if(item == "Noodles"){  
	  System.out.println("The Searched Item Is :" + item );  
	   System.out.println("The PRICE OF NOODLES IS 100" ); 
	  return ;
	  }
	  
	  if(item == "Gobi Manchurian"){  
	  System.out.println("The Searched Item Is :" + item ); 
      System.out.println("The PRICE OF GONI MANCHURIAN IS 80" ); 	  
	  return ;
	  }
	  
	  if(item == "Pizza"){  
	  System.out.println("The Searched Item Is :" + item ); 
      System.out.println("The PRICE OF PIZZA IS 220" ); 	  
	  return;
	  }
	  
	  if(item == "Burger"){  
	  System.out.println("The Searched Item Is :" + item ); 
      System.out.println("The PRICE OF BURGER IS 120" ); 	  
	  return ;
	  }
	  
	  if(item == "Meals"){  
	  System.out.println("The Searched Item Is :" + item );  
	  System.out.println("The PRICE OF MEALS IS 125" ); 
	  return ;
	  }
	  
	  if(item == "Dosa"){  
	  System.out.println("The Searched Item Is :" + item ); 
      System.out.println("The PRICE OF DOSA IS 50" ); 	  
	  return;
	  }
	  
	  if(item == "Biryani"){  
	  System.out.println("The Searched Item Is :" + item ); 
      System.out.println("The PRICE OF BIRYANI IS 160" ); 	  
	  return ;
	  }
	  
	  if(item == "Curd Rice"){  
	  System.out.println("The Searched Item Is :" + item ); 
      System.out.println("The PRICE OF CURD RICE IS 50" ); 	  
	  return;
	  }
	  
	  else{
	  System.out.println("ITEM IS NOT AVAILABLE");
	  }
	  System.out.println("end of findItem method");
	  return ;
	  
	  }
}
	  
	  
	  