class Stationary{

        int id;
		String name;
		String notebooks[];
		String pens[];
		String charts[];
		
		
		public Stationary(int id ,String name ,String notebooks[] ,String pens[] ,String charts[] ){
		
	    System.out.println("STATIONARY OBJECT IS CREATED...");
		this.id = id ;
		this.name = name ;
		this.notebooks = notebooks ;
		this.pens = pens ;
		this.charts = charts ;
		
		}
		
		public void display(){
		
		System.out.println("DISPLAYING  INFORMATION");
		
		System.out.println("STATIONARY STORE ID = " + id);
        System.out.println("STATIONARY STORE NAME = " + name);
        System.out.println("NOTEBOOKS IN STATIONARY STORE :" );
		for(int i = 0; i < notebooks.length; i++ ){
	    System.out.println(notebooks[i]);  
	    }
	    System.out.println("PENS IN STATIONARY STORE :");
		for(int j = 0; j < pens.length; j++ ){
	    System.out.println(pens[j]);  
	    }
	    System.out.println("CHARTS IN STATIONARY STORE :");
	    for(int k = 0; k < charts.length; k++ ){
	    System.out.println(charts[k]);  
	    }
        }


}