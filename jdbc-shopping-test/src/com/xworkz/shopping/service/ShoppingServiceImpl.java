package com.xworkz.shopping.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.shopping.dto.ShoppingDTO;
import com.xworkz.shopping.repository.ShoppingRepository;

public class ShoppingServiceImpl implements ShoppingService{

	
	ShoppingRepository shopRep;
	
	public ShoppingServiceImpl(ShoppingRepository shopRep) {
		this.shopRep = shopRep;
	}
	
	public ShoppingServiceImpl() {
		System.out.println("ShoppingServiceImpl default constructor");
	}
	
	@Override
	public boolean validateAndSave(ShoppingDTO dto) {
		
        if(dto != null) {
			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			Validator valid = factory.getValidator();
			Set<ConstraintViolation<ShoppingDTO>> violationMsg = valid.validate(dto);
			if(violationMsg.isEmpty()) {
				boolean save = this.shopRep.onSave(dto);
				System.out.println(save);
			}else {
			        System.out.println(violationMsg.toString());	
			}
		}else {
			System.out.println("dto is empty");
		}
		return true;
	}

	@Override
	public boolean read_All() {
		
		boolean read=this.shopRep.readAll();
		System.out.println(read);
		return true;
	}

	@Override
	public boolean read_By_Email(String emailId) {
		if(emailId.isEmpty()) {
			System.out.println("email is empty...cant read the data");
		}else {
			boolean read = this.shopRep.readByEmail(emailId);
			System.out.println(read);
		}
		return true;
	}

	@Override
	public boolean read_By_Name(String name) {
		if(name.isEmpty()) {
			System.out.println("name is empty...cant read the data");
		}else {
			boolean read = this.shopRep.readByName(name);
			System.out.println(read);
		}
		return true;
	}

	@Override
	public boolean update__ById(int id) {
		if(id != 0) {
			System.out.println("u can update the data");
			boolean update = this.shopRep.updateById(id);
			System.out.println(update);
		}else {
			System.out.println("u can't update as id=0");
		}
		return true;
	}

	@Override
	public boolean update_By_Name(String name) {
		if(name.isEmpty()) {
			System.out.println("u can't update as name is empty");
			
		}else {
			System.out.println("u can update the data");
			boolean update = this.shopRep.updateByName(name);
			System.out.println(update);
		}
		return true;
	}

	@Override
	public boolean upadte_By_Email(String emailId) {
		if(emailId.isEmpty()) {
			System.out.println("u can't update as emailId is empty");
			
		}else {
			System.out.println("u can update the data");
			boolean update = this.shopRep.upadteByEmail(emailId);
			System.out.println(update);
		}
		return true;
	}

	@Override
	public boolean delete_By_Id(int id) {
		if(id!=0) {
			boolean delete=this.shopRep.deleteById(id);
			System.out.println(delete);
		}
		return true;
	}

	@Override
	public boolean delete_By_Email(String emailId) {
		if(emailId.isEmpty()) {
			System.out.println("u can,t delete as emailId is empty");
		}else {
			boolean delete = this.delete_By_Email(emailId);
			System.out.println(delete);
		}
		return true;
	}

	
	
}
