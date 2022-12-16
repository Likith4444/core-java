class TheaterTester{

       public static void main(String t[]){
		   
	   
	   System.out.println("MAIN METHOD IS STARTED");
	   
	   String screenType[] = {"4K","DOLBY","ATMOS","3D","SILVER SCREEN","VIP SCREEN"} ;
	  
	   Theater mov1 = new Theater( 1, "NAVRANG THEATER", 10 , screenType);
	   mov1.display();
	   
	   System.out.println("MAIN METHOD ENDED");
       }

}