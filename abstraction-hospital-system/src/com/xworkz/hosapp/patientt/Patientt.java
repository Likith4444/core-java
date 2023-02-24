package com.xworkz.hosapp.patientt;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Patientt {
		
		   private int patientId;
		   private String patientName;
		   private  String bloodGroup;
		   private String gender;
		   private int age;
		   private String email;
		
		   
		  /* public Patientt(int patientId, String patientName, String bloodGroup, String gender, int age){ 
		   
		   this.patientId = patientId;
		   this.patientName = patientName;
		   this.bloodGroup = bloodGroup;
		   this.gender = gender;
		   this.age = age;
		
		} 
		   
		   public Patientt() {
			// TODO Auto-generated constructor stub
		}*/
		
		   
		   @Override
			public String toString() {
				return "Patientt [patientId=" + patientId + ", patientName=" + patientName + ", bloodGroup=" + bloodGroup
						+ ", gender=" + gender + ", age=" + age + ", email=" + email + "]";
			}
		  
}
