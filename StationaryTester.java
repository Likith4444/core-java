class StationaryTester{

      public static void main(String s[]){
		   
	   
	   System.out.println("MAIN METHOD IS STARTED");
	   
	   String notebooks[] = {"CAMEL","DOMS","CLASSMATE","RAJ","SURYA"} ;
	   String pens[] = {"REYNOLDS","BRIGHT","CELLO","BUTTERFLOW","PARKER"} ;
	   String charts[] = {"ALPHABETS","FRUITS","SPICES","VEGETABLES","NUMBERS","SYMBOLS"} ;

	   Stationary stat1 = new Stationary( 1, "RAJESH Store", notebooks ,pens , charts );
	   stat1.display();
	   
	   System.out.println("MAIN METHOD ENDED");
       }

}