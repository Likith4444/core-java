package com.xworkz.patientDetails.dto;

import com.xworkz.patientDetails.constant.Gender;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PatientsDTO {
	
	private int id;
	private String patientName;
	private int roomNo;
	private String patientAddress;
	private String gender;
	private int age;

}
