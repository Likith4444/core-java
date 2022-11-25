class Speaker{

      static String brandName = "JBL";
      static String frequency = "10Hz";
	  static boolean isWireless = true;
	  static boolean isConnected ;
	  static int minVolume = 0 ;
	  static int maxVolume = 20 ;
	  static int currentVolume ;
	  
	      public static void onOrOff(){
	  
	      System.out.println("inside onOrOff method");
		  
	          if(isConnected == false){
			  
			  isConnected = true;
			   System.out.println("SPEAKER IS TURNED ON....!@#$%^&*  ");
			  
			 }else if(isConnected == true){ 
			 
			 isConnected = false;
			 System.out.println("SPEAKER IS TURNED OFF");
			 
			 }
			 
	      System.out.println("onOrOff method ended"); 
		  
	  
	  }
	  
	  public static void increaseVolume(){
		
              System.out.println("invoked increase method");
	          System.out.println("No of Prameters:"+ 0);
		      if (isConnected == true){
		        if (currentVolume < maxVolume ){
			
			    currentVolume = currentVolume + 1;
			    System.out.println("THE CURRENT VOLUME IS" +" " + currentVolume);
		        }
		        else{
		        System.out.println("MAX VOLUME REACHED");
		        }
			  }
	          else{
		   System.out.println("GUBE....TURN ON THE SPEAKER");  
	    }
		 System.out.println("increase method ended");
		}
	  
		  
		  public static void decreaseVolume(){
			  
			  System.out.println("invoking decrease method");
			  
			  if (isConnected == true){
		if (currentVolume > minVolume ){
			
			currentVolume = currentVolume - 1;
			System.out.println("THE CURRENT VOLUME IS" + " " + currentVolume);
		    }
		else{
			System.out.println("MIN VOLUME REACHED");
		}
	    }
	   else{
		   System.out.println("GUBE....TURN ON THE SPEAKER");  
	    }
		 System.out.println("decrease method ended");
		}
		  
			  
			  

		   
		  
	  
	  
	  
	  public static void main(String s[]){
	  	  System.out.println(brandName);

	  System.out.println("main method started");
	  System.out.println("\n");
	  onOrOff();
	  increaseVolume();
	  increaseVolume();
	  increaseVolume();
	  increaseVolume();
	  decreaseVolume();
	  System.out.println("main method ended");
	  
	  
	  }
	
}