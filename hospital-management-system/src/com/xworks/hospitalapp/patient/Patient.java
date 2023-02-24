package com.xworks.hospitalapp.patient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
	
	   private int patientId;
	   private String patientName;
	   private  String bloodGroup;
	   private String gender;
	   private int age;
	   
	   
	   
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", bloodGroup=" + bloodGroup
				+ ", gender=" + gender + ", age=" + age + "]";
	}
	   
	 /*  public Patient(int patientId, String patientName, String bloodGroup, String gender, int age){ 
	   
	   this.patientId = patientId;
	   this.patientName = patientName;
	   this.bloodGroup = bloodGroup;
	   this.gender = gender;
	   this.age = age;
	
	} 
	   
	   public Patient() {
		// TODO Auto-generated constructor stub
	}

        public void setPatientId(int patientId) {
			
			this.patientId = patientId;
		}
		
		public int getPatientId() {
			
			return patientId;
		}
		
		public void setPatientName(String patientName) {
			
			this.patientName = patientName;	
		}
		
		public String getPatientName() {
			
			return patientName;
		}
		
		public void setBloodGroup(String bloodGroup) {
			
			this.bloodGroup = bloodGroup;
		}
		
		public String getBloodGroup() {
			
			return bloodGroup;
		}
		
		public void setGender(String gender) {
			
			this.gender = gender;
		}
		
		public String getGender() {
			
			return gender;
		}
		
        public void setAge(int age) {
			
			this.age = age;
		}
		
		public int getAge() {
			
			return age;
		}    */

}
