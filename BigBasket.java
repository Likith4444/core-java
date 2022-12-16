class BigBasket{

      public static int searchItem(String item){
	  
	  System.out.println("Invoking searchItem method");
	  
	  if (item == "Sunflower Oil"){
	  
	  System.out.println("THE SEARCHED ITEM IS :" + item );
	  
	  return 180;
	  }
	  
	  if (item == "Ghee"){
	  
	  System.out.println("THE SEARCHED ITEM IS :" + item );
	  return 130;
	  }
	  
	  if (item == "Butter"){
	  
	  System.out.println("THE SEARCHED ITEM IS :" + item );
	  return 80;
	  }
	  
	  if (item == "Sugar"){
	  
	  System.out.println("THE SEARCHED ITEM IS :" + item );
	  return 20;
	  }
	  
	  if (item == "Salt"){
	  
	  System.out.println("THE SEARCHED ITEM IS :" + item );
	  return 180;
	  }
	  
	  if (item == "Potato"){
	  
	  System.out.println("THE SEARCHED ITEM IS :" + item );
	  return 20;
	  }
	  
	  if (item == "Onion"){
	  
	  System.out.println("THE SEARCHED ITEM IS :" + item );
	  return 19;
	  }
	  
	  if (item == "Apple"){
	  
	  System.out.println("THE SEARCHED ITEM IS :" + item );
	  return 150;
	  }
	  
	  if (item == "Pomegranate"){
	  
	  System.out.println("THE SEARCHED ITEM IS :" + item );
	  return 200;
	  }
	  
	  if (item == "Banana"){
	  
	  System.out.println("THE SEARCHED ITEM IS :" + item );
	  return 60;
	  }
	  
	  if (item == "Egg"){
	  
	  System.out.println("THE SEARCHED ITEM IS :" + item );
	  return 5;
	  }
	  
	  if (item == "Chicken"){
	  
	  System.out.println("THE SEARCHED ITEM IS :" + item );
	  return 190;
	  }
	  
	  else{
	  
	  System.out.println("ITEM NOT AVAILABLE");
	  }
	  System.out.println("searchItem method has ended");
	  return 00;
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  public static int searchItem(String item ,int quantity ){
	  
	  System.out.println("Invoking searchItem2 method");
	  
	  if (item == "Sunflower Oil"){
	  
	  System.out.println("THE SEARCHED ITEM IS :" + item );
	  System.out.println("THE  NO OF QUANTITY IS :" + quantity );
	  return 180 * quantity ;
	  }
	  
	  if (item == "Ghee"){
	  
	  System.out.println("THE SEARCHED ITEM IS :" + item );
	  System.out.println("THE  NO OF QUANTITY IS :" + quantity );
	  return 130 * quantity ;
	  }
	  
	  if (item == "Butter"){
	  
	  System.out.println("THE SEARCHED ITEM IS :" + item );
	  System.out.println("THE  NO OF QUANTITY IS :" + quantity );
	  return 80 * quantity ;
	  }
	  
	  if (item == "Sugar"){
	  
	  System.out.println("THE SEARCHED ITEM IS :" + item );
	  System.out.println("THE  NO OF QUANTITY IS :" + quantity );
	  return 20 * quantity ;
	  }
	  
	  if (item == "Salt"){
	  
	  System.out.println("THE SEARCHED ITEM IS :" + item );
	  System.out.println("THE  NO OF QUANTITY IS :" + quantity );
	  return 180 * quantity ;
	  }
	  
	  if (item == "Potato"){
	  
	  System.out.println("THE SEARCHED ITEM IS :" + item );
	  System.out.println("THE  NO OF QUANTITY IS :" + quantity );
	  return 20 * quantity ;
	  }
	  
	  if (item == "Onion"){
	  
	  System.out.println("THE SEARCHED ITEM IS :" + item );
	  System.out.println("THE  NO OF QUANTITY IS :" + quantity );
	  return 19 * quantity ;
	  }
	  
	  if (item == "Apple"){
	  
	  System.out.println("THE SEARCHED ITEM IS :" + item );
	  System.out.println("THE  NO OF QUANTITY IS :" + quantity );
	  return 150 * quantity ;
	  }
	  
	  if (item == "Pomegranate"){
	  
	  System.out.println("THE SEARCHED ITEM IS :" + item );
	  System.out.println("THE  NO OF QUANTITY IS :" + quantity );
	  return 200 * quantity ;
	  }
	  
	  if (item == "Banana"){
	  
	  System.out.println("THE SEARCHED ITEM IS :" + item );
	  System.out.println("THE  NO OF QUANTITY IS :" + quantity );
	  return 60 * quantity ;
	  }
	  
	  if (item == "Egg"){
	  
	  System.out.println("THE SEARCHED ITEM IS :" + item );
	  System.out.println("THE  NO OF QUANTITY IS :" + quantity );
	  return 5 * quantity ;
	  }
	  
	  if (item == "Chicken"){
	  
	  System.out.println("THE SEARCHED ITEM IS :" + item );
	  System.out.println("THE  NO OF QUANTITY IS :" + quantity );
	  return 190 * quantity ;
	  }
	  
	  else{
	  
	  System.out.println("ITEM NOT AVAILABLE");
	  }
	  System.out.println("searchItem2 method has ended");
	  return 00;
	  }

}