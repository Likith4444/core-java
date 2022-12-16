class Resturant{

      int id ;
	  String name ;
	  String location ;
	  String typeOfResturant ;
	  String workers[] ;
	  String menu[] ;
	  
	  public Resturant(int id , String name , String location , String typeOfResturant , String workers[] , String menu[]){
	  
	  System.out.println("RESTURANT OBJECT IS CREATED...");
	  
	  this.id = id;
	  this.name = name;
	  this.location = location;
	  this.typeOfResturant = typeOfResturant;
	  this.workers = workers;
	  this.menu = menu;
	  
	  }
	  
	  public void displayDetails(){
		  
	  System.out.println("DISPLAYING RESTURANT INFO");
	  
	  System.out.println("THE NAME OF RESTURANT IS " + this.name);
      System.out.println("THE RESTURANT LOCATION IS " + this.location);
      System.out.println("THE RESTURANT ID IS " + this.id);
	  System.out.println("THE TYPE OF RESTURANT IS " + this.typeOfResturant);
	  System.out.println("THE RESTURANT WORKERS ARE " + this.workers);
	  for(int i = 0; i < workers.length; i++ ){
		  System.out.println(workers[i]);  
	  }
	  
      System.out.println("THE RESTURANT MENU IS " + this.menu);
	  for(int j = 0; j < menu.length; j++ ){
		  System.out.println(menu[j]);  
	  }	  
	  }
}                                   