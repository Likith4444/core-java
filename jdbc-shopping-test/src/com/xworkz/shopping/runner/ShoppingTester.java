package com.xworkz.shopping.runner;

import com.xworkz.shopping.dto.ShoppingDTO;
import com.xworkz.shopping.repository.ShoppingRepository;
import com.xworkz.shopping.repository.ShoppingRepositoryImpl;
import com.xworkz.shopping.service.ShoppingService;
import com.xworkz.shopping.service.ShoppingServiceImpl;

public class ShoppingTester {
	
	public static void main(String[] args) {
			
		ShoppingDTO dto = new  ShoppingDTO(1, "sundar", "sundar@gmail.com", "hubli", 2000);
		ShoppingDTO dto1 = new  ShoppingDTO(2, "raju", "raju33@gmail.com", "dharwad", 2440);
		ShoppingDTO dto2 = new  ShoppingDTO(3, "bala", "bala12@gmail.com", "bengaluru", 3000);

	    ShoppingRepository shopRep = new ShoppingRepositoryImpl();
	    ShoppingService shopSer = new ShoppingServiceImpl(shopRep);
	    shopSer.validateAndSave(dto);
	    shopSer.validateAndSave(dto1);
	    shopSer.validateAndSave(dto2);
		
	    shopSer.read_All();
	    shopSer.read_By_Email("raju33@gmail.com");
	    shopSer.read_By_Name("bala");
	    
	    shopSer.update__ById(1);
	    shopSer.upadte_By_Email("raju33@gmail.com");
	    shopSer.update_By_Name("bala");
	    
	    shopSer.delete_By_Id(3);
	    shopSer.delete_By_Email("raju33@gmail.com");
		
	}

}
