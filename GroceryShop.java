class GroceryShop{

        int id;
		String name;
		String location;
		String ownerName;
		String items[];
		
		
		public GroceryShop(int id ,String name ,String location ,String ownerName ,String items[] ){
		
	    System.out.println("GROCERYSHOP OBJECT IS CREATED...");
		this.id = id ;
		this.name = name ;
		this.location = location ;
		this.ownerName = ownerName ;
		this.items = items ;
		
		}
		
		public void display(){
		
		System.out.println("DISPLAYING GROCERYSHOP INFORMATION");
		
		System.out.println("GROCERYSHOP ID = " + id);
        System.out.println("GROCERYSHOP NAME = " + name);
        System.out.println("GROCERYSHOP LOCATION = " + location);
	    System.out.println("GROCERYSHOP OWNER NAME = " + ownerName);
	    System.out.println("ITEMS IN THE GROCERYSHOP = " );
	    for(int i = 0; i < items.length; i++ ){
	    System.out.println(items[i]);  
	    }
        }

}