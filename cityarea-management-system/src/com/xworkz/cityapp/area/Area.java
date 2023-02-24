package com.xworkz.cityapp.area;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Area {
	
	   private int areaId;
	   private String areaName;
	   private int areaPopulation;
	   private int areaSqFt;
	   
	   
	@Override
	public String toString() {
		return "Area [areaId=" + areaId + ", areaName=" + areaName + ", areaPopulation=" + areaPopulation
				+ ", areaSqFt=" + areaSqFt + "]";
	}
	   
	   
	   
	  /* public Area( int areaId , String areaName , int areaPopulation , int areaSqFt ){
	   
	   this.areaId = areaId;
	   this.areaName = areaName;
	   this.areaPopulation = areaPopulation;
	   this.areaSqFt = areaSqFt;
	   
	   }
	   
	   public Area() {
		// TODO Auto-generated constructor stub
	}

	public void setAreaId(int areaId) {
			
			this.areaId = areaId;
		}
		
		public int getAreaId() {
			
			return areaId;
		}
		
		public void setAreaName(String  areaName) {
			
			this.areaName = areaName;	
		}
		
		public String getAreaName() {
			
			return areaName;
		}
		
		public void setAreaPopulation(int areaPopulation) {
			
			this.areaPopulation = areaPopulation;
		}
		
		public int getAreaPopulation() {
			
			return areaPopulation;
		}
		
		public void setAreaSqFt(int areaSqFt) {
			
			this.areaSqFt = areaSqFt;
		}
		
		public int getAreaSqFt() {
			
			return areaSqFt;
		}*/
		
		
		
}
