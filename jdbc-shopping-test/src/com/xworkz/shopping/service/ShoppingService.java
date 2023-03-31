package com.xworkz.shopping.service;

import com.xworkz.shopping.dto.ShoppingDTO;

public interface ShoppingService {
	
    abstract boolean validateAndSave(ShoppingDTO dto);
	
	abstract boolean read_All();
	abstract boolean read_By_Email(String emailId);
	abstract boolean read_By_Name(String name);
	
	abstract boolean update__ById(int id);
	abstract boolean update_By_Name(String name);
	abstract boolean upadte_By_Email(String emailId);
	
	abstract boolean delete_By_Id(int id);
	abstract boolean delete_By_Email(String emailId);


}
