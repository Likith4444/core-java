class HouseTester{

       public static void main(String h[]){
		   
	   
	   System.out.println("MAIN METHOD IS STARTED");
	   
	   String familyMembers[] = {"AJJI","AJJA","APPA","AMMA","AKKA","NANU"} ;
	  
	   House home1 = new House( 1, "NANNA NILAYA", 6 , "APPA" , familyMembers);
	   home1.display();
	   
	   System.out.println("MAIN METHOD ENDED");
       }

}