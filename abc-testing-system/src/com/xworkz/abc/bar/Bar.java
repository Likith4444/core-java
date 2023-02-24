package com.xworkz.abc.bar;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Bar {
	
	int id;
	String barName;
	String location;
	String ownerName;
	
	@Override
	public String toString() {


		return "Bar (Id = "+this.id+", Bar Name = "+this.barName+", Location = "+this.location+
				", Owner Name ="+this.ownerName+")";          
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Bar bar = (Bar) obj;
		if(this.location.equals(bar.location)||this.barName.equals(bar.barName)||this.ownerName.equals(bar.ownerName)||this.id==(bar.id)) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id;
	}
	
	//class cast exception show
	

}
