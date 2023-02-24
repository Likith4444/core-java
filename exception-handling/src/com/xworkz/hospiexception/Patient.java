package com.xworkz.hospiexception;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Patient {
	
	
	private int id;
	private String name;
	private int age;
	
	
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	

}
