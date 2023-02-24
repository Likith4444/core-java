class Dunzo{

      
	  public static double reqItem(String item){
	  
	   System.out.println("invoked reqItemItem method");
	  
	     if(item == "RED LABEL"){  
	     System.out.println("The Item Searched Is :" + item );  
	     return 70.00;
	     }
	  
	     if(item == "LAYS"){  
	     System.out.println("The Item Searched Is :" + item );  
	     return 40.00;
	     }
	  
	     if(item == "DARK FANTASY"){  
	     System.out.println("The Item Searched Is :" + item );  
	     return 10.00;
	     }
	  
	     if(item == "PANEER"){  
	     System.out.println("The Item Searched Is :" + item ); 
	     return 120.00;
	     }
	  
	     if(item == "MILK"){  
	     System.out.println("The Item Searched Is :" + item );  
	     return 30.00;
	     }
	  
	     if(item == "OATS"){  
	     System.out.println("The Item Searched Is :" + item ); 
	     return 80.50;
	     }
	  
	     if(item == "HIDE & SEEK"){  
	     System.out.println("The Item Searched Is :" + item );   
	     return 30.00;
	     }
	  
	     if(item == "LITTLE HEARTS"){  
	     System.out.println("The Item Searched Is :" + item ); 
	     return 20.00;
	     }
	  
	     if(item == "DAIRY MILK"){  
	     System.out.println("The Item Searched Is :" + item ); 
	     return 40.00;
	     }
	  
	     if(item == "KURKURE"){  
	     System.out.println("The Item Searched Is :" + item ); 
	     return 20.00;
	     }
	  
	     else{
	     System.out.println("THE SEARCHED ITEM IS NOT AVAILABLE");
	     }
	     System.out.println("end of reqItemItem method");
	     return 0.00;
	  
	 } 
	   
}