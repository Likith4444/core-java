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
@Table(name = "tshirt_details")
public class TshirtDto {

	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "brand")
	private String brand;
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "size")
	private String size;
	
	@Column(name = "price")
	private int price;
	
}
