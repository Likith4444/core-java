class Theater{

        int id;
		String name;
		int noOfScreens;
		String screenType[];
		
		
		public Theater(int id ,String name ,int noOfScreens ,String screenType[] ){
		
	    System.out.println("THEATER OBJECT IS CREATED...");
		this.id = id ;
		this.name = name ;
		this.noOfScreens = noOfScreens ;
		this.screenType = screenType ;
		
		}
		
		public void display(){
		
		System.out.println("DISPLAYING THEATER INFORMATION");
		
		System.out.println("THEATER ID = " + this.id);
        System.out.println("THEATER NAME = " + this.name);
        System.out.println("NO OF SCREENS IN THEATER = " + this.noOfScreens);
	    System.out.println("SCREEN TYPES IN " + this.name + "ARE : ");
	    for(int i = 0; i < screenType.length; i++ ){
	    System.out.println(screenType[i]);  
	    }
        }

}