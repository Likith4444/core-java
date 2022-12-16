class RupeeTester{
       
	   
	   static IndianRupees indian1 = new IndianRupees( 1,"253BV377BH333" ,"100 RUPEE" ,2022,"PAPER","PURPLE","RAJAN" );

       public static void main(String r[]){
	   
	   System.out.println("MAIN METHOD IS STARTED");
	   
	   System.out.println("ID = " + indian1.indRupeesId + "\n" + "NO OF LANGUAGE = " + indian1.noOfLanguages + "\n" + "SERIAL NUMBER = " + indian1.serialNo + "\n" + "AMOUNT = " + indian1.rupeeName + " \n" + "YEAR OF PRINTING = " + indian1.yearOfPrinting + " \n" + "TYPE OF MONEY = " + indian1.type + " \n" + "COLOR OF MONEY = " + indian1.color + " \n" + "GOVERNER NAME = " + indian1.governerName);
	   
	   System.out.println("\n");
	   
	   IndianRupees indian2 = new IndianRupees( 2,"35237EUDB3773" ,"20 RUPEE" ,2021,"PAPER","GREEN","RAJAN" );
	   System.out.println("ID = " + indian2.indRupeesId + "\n" + "NO OF LANGUAGE = " + indian2.noOfLanguages + "\n" + "SERIAL NUMBER = " + indian2.serialNo + "\n" + "AMOUNT = " + indian2.rupeeName + " \n" + "YEAR OF PRINTING = " + indian2.yearOfPrinting + " \n" + "TYPE OF MONEY = " + indian2.type + " \n" + "COLOR OF MONEY = " + indian2.color + " \n" + "GOVERNER NAME = " + indian2.governerName);
	   

	   
	   System.out.println("MAIN METHOD HAS ENDED");
	   }


}