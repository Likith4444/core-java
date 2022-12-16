class DusterTester{

      public static void main(String d[]){
	  
	  System.out.println("MAIN METHOD IS STARTED");
	  
	  Duster d1 = new Duster( 1, "CAMEL ", "RECTANGLE ", 89, "WOODEN", "GREEN");
      System.out.println( "DUSTER ID : " + d1.dusterId + "\n" + "NAME : " + d1.name + "\n" + "SHAPE OF DUSTER : " + d1.shape + "\n" + "COST OF DUSTER : " + d1.price + "\n" + "TYPE OF DUSTER : " + d1.type + "\n" + "COLOR OF DUSTER : " + d1.color );

	  System.out.println("MAIN METHOD HAS ENDED");

	  }
}






              //can we have static objects in a class