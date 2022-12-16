class IndianRupees{

         public int indRupeesId ;
		 public static int noOfLanguages = 15 ;
		 public String serialNo ;
		 public String rupeeName ;
		 public int yearOfPrinting ;
         public String type ;
		 public String	color ;
	     public String governerName ;
		 
		 
		 public IndianRupees(){
			 
		 System.out.println("INDIAN RUPEES OBJECT IS CREATED");
 
			 
		 }
		 
		 public IndianRupees( int indRupeesId , String serialNo , String rupeeName , int yearOfPrinting , String type , String color , String governerName ){
		 
		 System.out.println("INDIAN RUPEES OBJECT IS CREATED");
		 
		 this.indRupeesId = indRupeesId ;
		 this.serialNo = serialNo ;
		 this.rupeeName = rupeeName ;
		 this.yearOfPrinting = yearOfPrinting ;
         this.type = type ;
         this.color = color ;
	     this.governerName = governerName ;
		 
		 }
		 
		 
		 public void buyWorld(){
		 
		 System.out.println("BUYING THE WHOLE WORLD....");
		 }

}