package com.xworkz.laptop.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.xworkz.laptop.dto.LaptopDTO;

@Repository
public class LaptopRepositoryImpl implements LaptopRepository{

	@Override
	public LaptopDTO saveLaptop(LaptopDTO dto) {
		
	
		try {
		 
		    Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trends", "root", "Xworkzodc@123");
			String query = "insert into lap_details values(?,?,?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, dto.getId());
			stmt.setString(2, dto.getCompanyName());
			stmt.setString(3, dto.getModelNo());
			stmt.setString(4, dto.getColor());
			stmt.setString(5, dto.getProcessor());
			stmt.setString(6, dto.getRam());
			
			int i = stmt.executeUpdate();
		
			if(i != 0) {
				System.out.println("the data is saved");
			}else {
				System.out.println("data is not saved");
			}
		 
		}catch (Exception e) {
			System.out.println("invalid data...exception occured");
			e.printStackTrace();
		}
		
		return dto;
		  // JDBC logic
		
	}

	@Override
	public List<LaptopDTO> getAllLaptopsRep() {
		
		System.out.println("Inside getAllLaptopsRep method");
		List<LaptopDTO> lap = new ArrayList<LaptopDTO>();
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trends", "root", "Xworkzodc@123");
		String readQuery="select * from lap_details";			
		PreparedStatement stmt = con.prepareStatement(readQuery);
		ResultSet rs=stmt.executeQuery();
		while(rs.next()) {
			
			LaptopDTO dtos = new LaptopDTO();
			dtos.setId(rs.getInt(1));
			dtos.setCompanyName(rs.getString(2));
			dtos.setModelNo(rs.getString(3));
			dtos.setColor(rs.getString(4));
			dtos.setProcessor(rs.getString(5));
			dtos.setRam(rs.getString(6));
			
			lap.add(dtos);
			
			
		}
		}catch (Exception e) {
			System.out.println("Invalid data....exception occured");
			e.printStackTrace();
		}
		return lap;
	}

	
	       
	//this.dto;
}
