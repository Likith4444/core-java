class Fan{

       static String fanBrand ="USHA";
       static String type = "Ceiling";
       static String fanSpeed = "100RPM";
	   static String weight = "1KG";
	   static boolean powerSwitch = false;
	   static int minSpeed = 0;
	   static int maxSpeed = 5;
	   static int currentSpeed ;
	   
	   
	   
	   
	 public static void power(){
	 
	 System.out.println("inside power method");
	 
	 if (powerSwitch == false ){
	 
	 powerSwitch = true;
	 System.out.println("THE FAN IS TURNED ON... ");
			  
	 }else if(powerSwitch == true){ 
			 
	 powerSwitch = false;
	 System.out.println("THE FAN IS TURNED OFF... ");
			 
	 }
	  System.out.println("power method ended");   
	 }
	 
	 
	 
	 
	 
	  public static void increaseSpeed(){
	 
	 System.out.println("invoked increaseSpeed method");
	 if (powerSwitch == true ){
	 
	 if ( currentSpeed < maxSpeed ){
	 
	 currentSpeed = currentSpeed + 1;
	 System.out.println("THE CURRENT SPEED OF FAN IS" +" " + currentSpeed);
	 }
	 else{
	  System.out.println("MAXIMUM FAN SPEED IS  REACHED");
	 }
	 }
	 else{
	  System.out.println("THE FAN IS OFF....PLEASE TURN ON THE FAN");  
	 }
	 System.out.println("increaseSpeed method ended");
	 }
	 
	 
	 

	 public static void decreaseSpeed(){
	 
	 System.out.println("invoked decreaseSpeed method");
	 if (powerSwitch == true ){
	 
	 if ( currentSpeed > minSpeed ){
	 
	 currentSpeed = currentSpeed - 1;
	 System.out.println("THE CURRENT SPEED OF FAN IS" +" " + currentSpeed);
	 }
	 else{
	  System.out.println("MINIMUM FAN SPEED IS REACHED");
	 }
	 }
	 else{
	  System.out.println("THE FAN IS OFF....PLEASE TURN ON THE THE SPEED");  
	 }
	 System.out.println("decreaseSpeed method ended");
	 }
	 
	 
	 
	 
	 
	 
	  public static void main(String f[]){
	  
	  System.out.println("THE FAN BRAND BOUGHT IS : " + " " + fanBrand );
	  System.out.println("THE TYPE OF FAN BOUGHT IS : " + " " + type );
	  System.out.println("THE FAN SPPEED IS : " + " " + fanSpeed );
	  System.out.println("THE WEIGHT OF FAN IS : " + " " + weight );
	  
	  System.out.println("the main method is started");
	  System.out.println("\n");
	  power();
	  
	  increaseSpeed();
	  increaseSpeed();
	  increaseSpeed();
	  decreaseSpeed();
	  increaseSpeed();
	  increaseSpeed();
	  increaseSpeed();
	  increaseSpeed();
	  increaseSpeed();
	  
	  power();
	  System.out.println("\n");
	  System.out.println("the main method has ended");
	  
	  
	  }	 
	 
	   

}