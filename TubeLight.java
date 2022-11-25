class TubeLight{
	
	static boolean isConnected= false;
	
	public static void main(String a[]){
	//invoking a giveLight method
	giveLight();
	giveLight();
	}
	
	//declartion of method
	public static void giveLight(){
		System.out.println("giveLight method invoked");
		System.out.println("\n");
		//false == false
		if(isConnected == false){
			isConnected = true;
			System.out.println("TUBELIGHT IS TURNED ON");
			System.out.println("\n");
		}
		else{
			System.out.println("SWITCH IS ALREADY TURNED ON");
			System.out.println("\n");
		}
		System.out.println("giveLight method ended");
		System.out.println("\n");
	}
	
	
}




     