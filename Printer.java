class Printer{

       String brandName ;
	   int price ;
	   String inkType ;
	   boolean isWireless ;
	   int printSpeed ;
	   String papaerFormat ;
	   
	   public void printing(){
	   
	   System.out.println("THE REQUIRED TEXT OR IMAGES CAN BE PRINTED HERE!@#$%&");
	   
	   
	   }
	   
	   public Printer(String brandName, int price, String inkType , boolean isWireless, int printSpeed ,String papaerFormat ){
		   
		   System.out.println("PRINTER OBJECT IS CREATED..");
		   this.brandName = brandName ;
	       this.price = price ;
	       this.inkType = inkType ;
	       this.isWireless = isWireless ;
	       this.printSpeed = printSpeed ;
	       this.papaerFormat = papaerFormat ;
		   
		   
	   }


}