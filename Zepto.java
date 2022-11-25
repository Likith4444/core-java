class Zepto{

      
	  public static void reqItem(String item){
	  
	   System.out.println("invoked reqItemItem method");
	  
	     if(item == "COKE"){  
	     System.out.println("The Item Searched Is :" + item );  
		 System.out.println("The PRICE OF COKE IS 60" );
	   return ;
	    }
	  
	  if(item == "LAYS"){  
	      System.out.println("The Item Searched Is :" + item );  
		  System.out.println("The PRICE OF LAYS IS 40" );
	     return ;
	  }
	  
	      if(item == "PARLE G"){  
	     System.out.println("The Item Searched Is :" + item );
         System.out.println("The PRICE OF PARLE G IS 10" );		 
	  return ;
	  }
	  
	  if(item == "MILK"){  
	      System.out.println("The Item Searched Is :" + item ); 
		  System.out.println("The PRICE OF MILK IS 22" );
	    return ;
	  }
	  
	    if(item == "50-50"){  
	  System.out.println("The Item Searched Is :" + item ); 
      System.out.println("The PRICE OF 50-50 BISCUIT IS 25" );	  
	   return ;
	  }
	  
	   if(item == "7UP"){  
	     System.out.println("The Item Searched Is :" + item );
         System.out.println("The PRICE OF 7UP IS 59" );		 
	    return ;
	  }
	  
	  if(item == "HIDE & SEEK"){  
	      System.out.println("The Item Searched Is :" + item ); 
          System.out.println("The PRICE OF HIDE & SEEK  IS 30" );		  
	    return ;
	  }
	  
	    if(item == "AMUL ICECREAM"){  
	      System.out.println("The Item Searched Is :" + item ); 
		  System.out.println("The PRICE OF AMUL ICECREAM IS 150" );
	     return ;
	  }
	  
	  if(item == "DAIRY MILK"){  
	      System.out.println("The Item Searched Is :" + item ); 
		  System.out.println("The PRICE OF DAIRY MILK IS 60" );
	    return ;
	  }
	  
	   if(item == "KURKURE"){  
	  System.out.println("The Item Searched Is :" + item ); 
	  System.out.println("The PRICE OF KURKURE IS 20" );
	   return ;
	  }
	  
	  else{
	  System.out.println("THE SEARCHED ITEM IS NOT AVAILABLE");
	  }
	  System.out.println("end of reqItemItem method");
	  return ;
	  
	  } 
	   
}