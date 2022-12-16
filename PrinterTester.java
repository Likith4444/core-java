class PrinterTester{

     public  static void main(String p[]){
	 
	 System.out.println("MAIN METHOD IS STARTED");

	 Printer print1 = new Printer( "HP",7000,"BLACK & WHITE ",true , 12,"A4 ");
	   
	 System.out.println( print1.brandName + " PRINTER FEATURES ARE: ");
	 System.out.println(print1.brandName + "\n" + print1.price + "\n" + print1.inkType + "\n" + print1.isWireless + "\n" + print1.printSpeed + "ppm" + "\n" + print1.papaerFormat);
	 System.out.println("\n");
	 
	 
	 Printer print2 = new Printer( "CANON",9000,"BLACK & WHITE ",true , 19,"A4 ");
	   
	 System.out.println( print2.brandName + " PRINTER FEATURES ARE: ");
	 System.out.println(print2.brandName + "\n" + print2.price + "\n" + print2.inkType + "\n" + print2.isWireless + "\n" + print2.printSpeed + "ppm" + "\n" + print2.papaerFormat);
	 System.out.println("\n");
	 
	 
	 Printer print3 = new Printer( "EPSON",13000,"COLOR ",true , 21,"A4 ");
	   
	 System.out.println( print3.brandName + " PRINTER FEATURES ARE: ");
	 System.out.println(print3.brandName + "\n" + print3.price + "\n" + print3.inkType + "\n" + print3.isWireless + "\n" + print3.printSpeed + "ppm" + "\n" + print3.papaerFormat);
	 System.out.println("\n");
	 
	 
	 Printer print4 = new Printer( "LEXMARK",8000,"BLACK & WHITE ",false , 10,"A3 ");
	   
	 System.out.println(print4.brandName + " PRINTER FEATURES ARE: ");
	 System.out.println(print4.brandName + "\n" + print4.price + "\n" + print4.inkType + "\n" + print4.isWireless + "\n" + print4.printSpeed + "ppm" + "\n" + print4.papaerFormat);
	 System.out.println("\n");
	 
	 
	 Printer print5 = new Printer( "BROTHER INDUSTRIES",9000,"COLOR ",true , 18,"A4 ");
	   
	 System.out.println(print5.brandName + " PRINTER FEATURES ARE: ");
	 System.out.println(print5.brandName + "\n" + print5.price + "\n" + print5.inkType + "\n" + print5.isWireless + "\n" + print5.printSpeed + "ppm" + "\n" + print5.papaerFormat);
	 System.out.println("\n");
	 
	 
	 Printer print6 = new Printer( "DELL ",1400,"COLOR ",true , 28,"A4 ");
	   
	 System.out.println(print6.brandName + " PRINTER FEATURES ARE: ");
	 System.out.println(print6.brandName + "\n" + print6.price + "\n" + print6.inkType + "\n" + print6.isWireless + "\n" + print6.printSpeed + "ppm" + "\n" + print6.papaerFormat);
	 System.out.println("\n");
	 
	 System.out.println("MAIN METHOD HAS ENDED");

	 }

}