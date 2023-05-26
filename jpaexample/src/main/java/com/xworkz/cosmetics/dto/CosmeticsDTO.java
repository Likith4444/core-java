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
@Table(name = "cosmetics_details")
public class CosmeticsDTO {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "cosmeticBrand")
	private String cosmeticBrand;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "price")
	private int price;
	
	@Column(name = "manDate")
	private String manDate;
	
	@Column(name = "expDate")
	private String expDate;

}
