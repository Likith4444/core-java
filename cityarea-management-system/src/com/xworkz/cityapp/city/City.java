package com.xworkz.cityapp.city;

import com.xworkz.cityapp.area.Area;
import com.xworkz.cityapp.exception.AreaNotFoundException;
import com.xworkz.cityapp.exception.AreaNotUpdatedException;

public class City extends Object{
	
	Area area[];
	   int index = 0;
	   
	   public City(int size){
	   
	   System.out.println("City object is created");
	   area = new Area[size];
	   }
	   
	   public City() {
		   System.out.println("default constructor added bcoz of child class");
	   }
	   
	   public boolean saveArea( Area area ){
	   
	   System.out.println("SAVE AREA PROCESS HAS STARTED");
	   boolean isSaved = false;
		 
	   if(area.getAreaName() != null ){
		 
	   this.area[index++] = area;
	   System.out.println("AREA IS SAVED...");
	   isSaved = true;
	   }
	   System.out.println("AREA SAVING PROCESS HAS ENDED");
	   return isSaved;
	   
	   }
	  
	   public void getAllAreas(){
	  
	   System.out.println("LIST OF ALL THE AREAS");
	   for( int i = 0; i < this.area.length; i++ ){
		 
	   System.out.println(area[i]);
		
	   }
 }
	   
	   public Area getAreaByAreaId (int areaId) throws AreaNotFoundException {
	    	
	    	System.out.println("INSIDE getAreaByAreaId METHOD");
	    	for(int in=0; in< area.length; in++) {
	    		
	    		if(area[in].getAreaId() == areaId ) {
	    			
	    			System.out.println("AREA ID IS MATCHING...PROCEED DISPLAYING THE DATA");
	    			   System.out.println(area[in]);
	    			return area[in];
	    		}
	    		else {
	    			throw new AreaNotFoundException("invalid area id entered");
	    		}
	    	}
	    		System.out.println("END OF getAreaByAreaId METHOD");
	    		return null;        
	     }

	   
	      public Area updateAreaPopulationByAreaId(int newAreaPopulation , int areaId ) throws AreaNotUpdatedException {
	    		
	    		System.out.println("INSIDE updateAreaPopulationByAreaId METHOD");
	    		for(int b = 0; b < area.length; b++ ) {
	    			
	    			if(area[b].getAreaId() == areaId ) {
	    				
	    				System.out.println("the current contact no is: " + area[b].getAreaPopulation());
	    				area[b].setAreaPopulation(newAreaPopulation) ;
	    				System.out.println("the new updated name of patient is" + area[b].getAreaPopulation());
	    				System.out.println("THE UPDATED AREA POPULATION IS : ");
	    				   System.out.println(area[b]);

	    			}
	    			else {
	    				
	    				throw new AreaNotUpdatedException("area id not matching, area details not updated");
	    			}
	    		}
	    		System.out.println("END OF updateAreaPopulationByAreaId METHOD");
	    		return null;
	    	} 
	   
}
