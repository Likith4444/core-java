package com.xworkz.shopping.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ShoppingDTO {
	
	private int id;
	@NotEmpty
	@NotNull
	@NotBlank
	@Size(max=20, min=2)
	private String name;
	@NotEmpty
	@NotNull
	@NotBlank
	@Size(max=20, min=2)
	private String emailId;
	@NotEmpty
	@NotNull
	@NotBlank
	@Size(max=20, min=2)
	private String location;
	private int amount;

}
