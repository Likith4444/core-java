package com.xworkz.shopping.repository;

import com.xworkz.shopping.dto.ShoppingDTO;

public interface ShoppingRepository {
	
	abstract boolean onSave(ShoppingDTO dto);
	
	abstract boolean readAll();
	abstract boolean readByEmail(String emailId);
	abstract boolean readByName(String name);
	
	abstract boolean updateById(int id);
	abstract boolean updateByName(String name);
	abstract boolean upadteByEmail(String emailId);
	
	abstract boolean deleteById(int id);
	abstract boolean deleteByEmail(String emailId);

}
