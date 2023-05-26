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
@Table(name = "mobile_details")
public class MobileDTO {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "mobileBrand")
	private String mobileBrand;
	
	@Column(name = "modelNo")
	private String modelNo;
	
	@Column(name = "storage")
	private String storage;
	
	@Column(name = "price")
	private int price;

}
