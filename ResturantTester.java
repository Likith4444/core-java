class ResturantTester{


	   public static void main(String r[]){
		   
	   
	   System.out.println("MAIN METHOD IS STARTED");
	   
	   String workers[] = {"ANIL","BABAR","CHANDAN","DARSHAN","SUNIL","KARTHIK","RAJ","BABU"} ;
	   String menu[]  = {"DOSA","BUTTER NAN","BRIYANI","EGG MASALA","GOBI MANCHURIAN","CHICKEN CHILLY","VEG BRIYANI","PANEERR BUTTER MASALA"} ;
	  
	   Resturant food1 = new Resturant( 1, "SAGAR", "1ST BLOCK,RAJAJINAGAR,BANGLORE - 5736547" ,"PURE VEG RESTURANT", workers , menu );
	   food1.displayDetails();
	   
	   Resturant food2 = new Resturant( 2, "UDUPI HOTEL", "3RD STREET,WHITEFIELD,BANGLORE - 556373" ,"PURE VEG RESTURANT", workers , menu );
	   food2.displayDetails();
	   
	   System.out.println("MAIN METHOD ENDED");

	   	   
       }
}