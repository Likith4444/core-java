class FannTester{

      public static void main(String air[]){
	  
	  Fann air1 = new Fann();
	  
	  air1.fanBrand ;
	  System.out.println( air1.fanBrand + "FAN FEATURES ARE: ");
	  air1.type = "CEILING FAN ";
	  air1.fanSpeed = 400;
	  air1.price =  2000;
	  air1.isSmart =  false;
	  System.out.println(air1.fanBrand + "\n" + air1.type + "\n" + air1.fanSpeed + "rpm" + "\n" + air1.price + "\n" + air1.isSmart);
	  System.out.println("\n");
	  
	  
	  
	  Fann air2 = new Fann();
	  
	  air2.fanBrand = "ORIENT ";
	  System.out.println( air2.fanBrand + "FAN FEATURES ARE: ");
	  air2.type = "CEILING FAN ";
	  air2.fanSpeed = 543;
	  air2.price =  4800;
	  air2.isSmart =  true;
	  System.out.println(air2.fanBrand + "\n" + air2.type + "\n" + air2.fanSpeed + "rpm" + "\n" + air2.price + "\n" + air2.isSmart);
	  System.out.println("\n");
	  
	  
	  Fann air3 = new Fann();
	  
	  air3.fanBrand = "USHA ";
	  System.out.println( air3.fanBrand + "FAN FEATURES ARE: ");
	  air3.type = "TABLE FAN ";
	  air3.fanSpeed = 290;
	  air3.price =  1600;
	  air3.isSmart =  false;
	  System.out.println(air3.fanBrand + "\n" + air3.type + "\n" + air3.fanSpeed + "rpm" + "\n" + air3.price + "\n" + air3.isSmart);
	  System.out.println("\n");
	  
	  
	  
	  Fann air4 = new Fann();
	  
	  air4.fanBrand = "PANASONIC ";
	  System.out.println( air4.fanBrand + "FAN FEATURES ARE: ");
	  air4.type = "TABLE FAN ";
	  air4.fanSpeed = 380;
	  air4.price =  2100;
	  air4.isSmart =  false;
	  System.out.println(air4.fanBrand + "\n" + air4.type + "\n" + air4.fanSpeed + "rpm" + "\n" + air4.price + "\n" + air4.isSmart);
	  System.out.println("\n");
	  
	  }



}