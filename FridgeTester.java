class FridgeTester{

     public static void main(String f[]){
	           
			            //constructor
	 Fridge cool1 = new Fridge("LG",);
	                                                                         //null values stored as initialization is not done ...so it stores default values
	 System.out.println(cool1.brandName + "\n" + cool1.type + "\n" + cool1.capacity + "\n" + cool1.cost + "\n" + cool1.issmart + "\n" + cool1.energyefficiency + "\n" + cool1.avglife + "years");
	 System.out.println("\n");
	 
	 cool1.brandName = "LG" ;
	 System.out.println( cool1.brandName + "FRIDGE FEATURES ARE: ");
	 cool1.type = "DOUBLE DOOR ";
	 cool1.capacity = "300-450L ";
	 cool1.cost =  20000;
	 cool1.issmart =  false;
	 cool1.energyefficiency = "4 STAR ";
	 cool1.avglife =  8;                                        //values are initialized so actual values are stored 
	 System.out.println(cool1.brandName + "\n" + cool1.type + "\n" + cool1.capacity + "\n" + cool1.cost + "\n" + cool1.issmart + "\n" + cool1.energyefficiency + "\n" + cool1.avglife + "years");
	 System.out.println("\n");

	     
	 
	 
	 Fridge cool2 = new Fridge();
	 
	 cool2.brandName = "PANASONIC ";
	 System.out.println( cool2.brandName + "FRIDGE FEATURES ARE: ");
	 cool2.type = "DOUBLE DOOR ";
	 cool2.capacity = "390-480L ";
	 cool2.cost =  24000;
	 cool2.issmart =  false;
	 cool2.energyefficiency = "3 STAR ";
	 cool2.avglife =  7;
	 System.out.println(cool2.brandName + "\n" + cool2.type + "\n" + cool2.capacity + "\n" + cool2.cost + "\n" + cool2.issmart + "\n" + cool2.energyefficiency + "\n" + cool2.avglife + "years");
	 System.out.println("\n");
	 
	 
	 Fridge cool3 = new Fridge();
	 
	 cool3.brandName = "SAMSUNG ";
	 System.out.println( cool3.brandName + "FRIDGE FEATURES ARE: ");
	 cool3.type = "SIDE BY SIDE ";
	 cool3.capacity = "370-410L ";
	 cool3.cost = 3100;
	 cool3.issmart = false;
	 cool3.energyefficiency = "4 STAR ";
	 cool3.avglife = 7;
	 System.out.println(cool3.brandName + "\n" + cool3.type + "\n" + cool3.capacity + "\n" + cool3.cost + "\n" + cool3.issmart + "\n" + cool3.energyefficiency + "\n" + cool3.avglife + "years");
	 System.out.println("\n");


     Fridge cool4 = new Fridge();
	 
	 cool4.brandName = "WHIRLPOOL ";
	 System.out.println( cool4.brandName + "FRIDGE FEATURES ARE: ");
	 cool4.type = "FRENCH DOOR ";
	 cool4.capacity = "400-550L ";
	 cool4.cost =  39000;
	 cool4.issmart =  true;
	 cool4.energyefficiency = "5 STAR ";
	 cool4.avglife =  8;
	 System.out.println(cool4.brandName + "\n" + cool4.type + "\n" + cool4.capacity + "\n" + cool4.cost + "\n" + cool4.issmart + "\n" + cool4.energyefficiency + "\n" + cool4.avglife + "years");
	 System.out.println("\n");


     Fridge cool5 = new Fridge();
	 
	 cool5.brandName = "HAIER ";
	 System.out.println( cool5.brandName + "FRIDGE FEATURES ARE: ");
	 cool5.type = "SINGLE DOOR ";
	 cool5.capacity = "160-200L ";
	 cool5.cost =  13000;
	 cool5.issmart =  false;
	 cool5.energyefficiency = "2 STAR ";
	 cool5.avglife =  6;
	 System.out.println(cool5.brandName + "\n" + cool5.type + "\n" + cool5.capacity + "\n" + cool5.cost + "\n" + cool5.issmart + "\n" + cool5.energyefficiency + "\n" + cool5.avglife + "years");
	 System.out.println("\n");	 	 
	 	 	 
	 }

}