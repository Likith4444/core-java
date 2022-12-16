class PlasticChairTester{

     public static void main(String a[]){
	 
	 System.out.println("MAIN METHOD STARTED");
	 
	 Chair c1 = new Chair();
	 double data1 = c1.toSit();
	 System.out.println("PRICE OF CHAIR IS: " + data1 );

	 String data2 = c1.toSleep();
	 System.out.println("I WANT TO SLEEP" + "-->" + data2 );

	 System.out.println("MAIN METHOD ENDED");
	 
	 }

}