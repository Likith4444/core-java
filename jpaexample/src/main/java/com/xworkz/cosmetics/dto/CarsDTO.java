package com.xworkz.cosmetics.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cars_details")
public class CarsDTO {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "carCompany")
	private String carCompany;
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "model")
	private String model;
	
	@Column(name = "price")
	private int price;


}
