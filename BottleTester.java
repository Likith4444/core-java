class BottleTester{

    public static void main(String bottle[]){
	
	TupperwareBottle tupperware = new TupperwareBottle();
	
	System.out.println(" TUPPERWARE BOTTLE 1");
	tupperware.color = " BLUE";
	tupperware.shape = " CYLINDER";
	tupperware.price = 100.00 ;
	tupperware.type = " plastic ";
	
	System.out.println(tupperware.color + " " + tupperware.shape + " " + tupperware.price + " " + tupperware.type);
	
	
	
	TupperwareBottle tupperware1 = new TupperwareBottle();
    
	System.out.println(" TUPPERWARE BOTTLE 2");
	tupperware1.color = " RED";
	tupperware1.shape = "SQUARE";
	tupperware1.price = 85.00;
	tupperware1.type = "METAL ";
	System.out.println(tupperware1.color + " " + tupperware1.shape + " " + tupperware1.price + " " + tupperware1.type);
	
	
	
	TupperwareBottle tupperware2 = new TupperwareBottle();
	
	System.out.println(" TUPPERWARE BOTTLE 3");
	tupperware2.color = " BLACK";
	tupperware2.shape = "CUBE";
	tupperware2.price = 89.00;
	tupperware2.type = "PLASTIC ";
	System.out.println(tupperware2.color + " " + tupperware2.shape + " " + tupperware2.price + " " + tupperware2.type);
	
	}


}