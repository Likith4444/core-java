class Television{

     static String brandName = "SONY";
	 static String display = "38inch";
	 static boolean powerSwitch = false;
	 static int minBrightness= 0 ;
	 static int maxBrightness = 100 ;
	 static int currentBrightness ;
	 static int minVolume = 0 ;
	 static int maxVolume = 20 ;
	 static int currentVolume ;
	 static double voltage = 120 ;
	 
	 
	 
	 public static void power(){
	 
	 System.out.println("inside power method");
	 
	 if (powerSwitch == false ){
	 
	 powerSwitch = true;
	 System.out.println("THE TV IS TURNED ON... ");
			  
	 }else if(powerSwitch == true){ 
			 
	 powerSwitch = false;
	 System.out.println("THE TV IS TURNED OFF... ");
			 
	 }
	  System.out.println("power method ended");   
	 }
	 
	 
	 
	 
	 public static void increaseBrightness(){
	 
	 System.out.println("invoked increaseBrightness method");
	 if (powerSwitch == true ){
	 
	 if ( currentBrightness < maxBrightness ){
	 
	 currentBrightness = currentBrightness + 1;
	 System.out.println("THE CURRENT BRIGHTNESS IS" +" " + currentBrightness);
	 }
	 else{
	  System.out.println("MAXIMUM BRIGHTNESS REACHED");
	 }
	 }
	 else{
	  System.out.println("THE TV IS OFF....PLEASE TURN ON THE TV");  
	 }
	 System.out.println("increaseBrightness method ended");
	 }
	 
	 
	 

	 public static void decreaseBrightness(){
	 
	 System.out.println("invoked decreaseBrightness method");
	 if (powerSwitch == true ){
	 
	 if ( currentBrightness > minBrightness ){
	 
	 currentBrightness = currentBrightness - 1;
	 System.out.println("THE CURRENT BRIGHTNESS IS" +" " + currentBrightness);
	 }
	 else{
	  System.out.println("MINIMUM BRIGHTNESS REACHED");
	 }
	 }
	 else{
	  System.out.println("THE TV IS OFF....PLEASE TURN ON THE TV");  
	 }
	 System.out.println("decreaseBrightness method ended");
	 }
	 
	 
	 
	 
	 
	  public static void increaseVolume(){
		
      System.out.println("invoked increaseVolume method");
	  if (powerSwitch == true){
	  if (currentVolume < maxVolume ){
			
	  currentVolume = currentVolume + 1;
	  System.out.println("THE CURRENT VOLUME IS" +" " + currentVolume);
	  }
	  else{
	  System.out.println("MAX VOLUME REACHED");
	  }
	  }
	  else{
	  System.out.println("THE TV IS OFF...PLEASE TURN ON THE TV");  
	  }
	  System.out.println("increaseVolume method ended");
	  }
	  
	  
	  
		  
	  public static void decreaseVolume(){
			  
	  System.out.println("invoking decreaseVolume method");
			  
	  if (powerSwitch == true){
	  if (currentVolume > minVolume ){
			
	  currentVolume = currentVolume - 1;
	  System.out.println("THE CURRENT VOLUME IS" + " " + currentVolume);
	  }
	  else{
      System.out.println("MIN VOLUME REACHED");
	  }
	  }
	  else{
      System.out.println("THE TV IS OFF...PLEASE TURN ON THE TV");  
	  }
	  System.out.println("decreaseVolume method ended");
	  }
	 
	 
	 
	 
	  public static void main(String tv[]){
	  
	  System.out.println("THE TELEVISION BRAND BOUGHT IS : " + " " + brandName );
	  System.out.println("THE DISPLAY OF TELEVISION IS : " + " " + display );
	  System.out.println("THE VOLTAGE OF TELEVISION IS : " + " " + voltage );
	  
	  System.out.println("the main method is started");
	  System.out.println("\n");
	  power();
	  increaseVolume();
	  increaseVolume();
	  increaseVolume();
	  increaseVolume();
	  increaseVolume();
	  decreaseVolume();
	  increaseVolume();
	  increaseVolume();
	  increaseVolume();
	  increaseVolume();
	  increaseVolume();
	  increaseVolume();
	  increaseVolume();
	  increaseVolume();
	  increaseVolume();
	  increaseVolume();
	  increaseVolume();
	  increaseVolume();
	  increaseVolume();
	  increaseVolume();
	  increaseVolume();
	  increaseVolume();
	  increaseVolume();
	  increaseVolume();
	  increaseVolume();
	  increaseBrightness();
	  increaseBrightness();
	  increaseBrightness();
	  increaseBrightness();
	  increaseBrightness();
	  decreaseBrightness();
	  power();
	  System.out.println("\n");
	  System.out.println("the main method has ended");
	  
	  
	  }	 
	 
	 
}