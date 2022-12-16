class House{

        int id;
		String houseName;
		int noOfMembers;
		String ownerName;
		String familyMembers[];
		
		
		public House(int id ,String houseName ,int noOfMembers ,String ownerName ,String familyMembers[] ){
		
	    System.out.println("HOUSE OBJECT IS CREATED...");
		this.id = id ;
		this.houseName = houseName ;
		this.noOfMembers = noOfMembers ;
		this.familyMembers = familyMembers ;
		
		}
		
		public void display(){
		
		System.out.println("DISPLAYING HOUSE INFORMATION");
		
		System.out.println("HOUSE ID = " + this.id);
        System.out.println("HOUSE NAME = " + this.houseName);
        System.out.println("NO OF MEMBERS IS = " + this.noOfMembers);
		System.out.println("HOUSE OWNER NAME IS = " + this.ownerName);
	    System.out.println("FAMILY MEMBERS ARE : ");
	    for(int i = 0; i < familyMembers.length; i++ ){
	    System.out.println(familyMembers[i]);  
	    }
        }

}