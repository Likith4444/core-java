package com.xworkz.shopping.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.xworkz.shopping.dto.ShoppingDTO;

public class ShoppingRepositoryImpl implements ShoppingRepository{

	@Override
	public boolean onSave(ShoppingDTO dto) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/trends", "root", "Xworkzodc@123");
			String query="insert into shopping values(?,?,?,?,?)";
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setInt(1, dto.getId());
			stmt.setString(2, dto.getName());
			stmt.setString(3, dto.getEmailId());
			stmt.setString(4, dto.getLocation());
			stmt.setInt(5, dto.getAmount());
			int i = stmt.executeUpdate();
			if(i != 0) {
				System.out.println("data is saved");
			}else {
				System.out.println("data is not saved");
			}	
			
		}catch (Exception e) {			
			System.out.println("invalid data");
			e.printStackTrace();
		}
		
		return true;
	}

	@Override
	public boolean readAll() {
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/trends", "root", "Xworkzodc@123");
		String query="select * from shopping";
		PreparedStatement stmt = connection.prepareStatement(query);
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			System.out.println("id: " + rs.getInt(1) + "  name: " + rs.getString(2) + " emailId: " + rs.getString(3) + " location: " + rs.getShort(4) + " amount: " + rs.getInt(5));
		}
		
		}catch (Exception e) {
			System.out.println("invalid data");
			e.printStackTrace();
		}
		return true;
	}

	
	@Override
	public boolean updateById(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trends", "root", "Xworkzodc@123");
			String query = "update shopping set location='rajajinagar' where id=" +"'" + id + "'";
			PreparedStatement stmt = con.prepareStatement(query);
			int i = stmt.executeUpdate(query);
			if(i != 0) {
				System.out.println("updated");
			}else {
				System.out.println("not updated");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("invalid data");
		}
		
		return true;
	}

	@Override
	public boolean updateByName(String name) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trends", "root", "Xworkzodc@123");
			String query = "update shopping set location='jaynagar' where name=" +"'" + name + "'";
			PreparedStatement stmt = con.prepareStatement(query);
			int i = stmt.executeUpdate(query);
			if(i != 0) {
				System.out.println("updated");
			}else {
				System.out.println("not updated");
			}
		
		}catch (Exception e) {
			System.out.println("invalid data");
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean upadteByEmail(String emailId) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trends", "root", "Xworkzodc@123");
			String query = "update shopping set location='tumkur' where name=" +"'" + emailId + "'";
			PreparedStatement stmt = con.prepareStatement(query);
			int i = stmt.executeUpdate(query);
			if(i != 0) {
				System.out.println("updated");
			}else {
				System.out.println("not updated");
			}
		
		}catch (Exception e) {
			System.out.println("invalid data");
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean deleteById(int id) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trends", "root", "Xworkzodc@123");
			String query="delete from shopping where id = ?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, id);
			int i=stmt.executeUpdate();
			//System.out.println(i);
			if(i!=0) {
				System.out.println("record deleted");
			}else {
				System.out.println("record not deleted");
			}
		}catch (Exception e) {
			System.out.println("invalid data");
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean deleteByEmail(String emailId) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trends", "root", "Xworkzodc@123");
			String query="delete from shopping where emailId = ?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, emailId);
			int i=stmt.executeUpdate();
			//System.out.println(i);
			if(i!=0) {
				System.out.println("record deleted");
			}else {
				System.out.println("record not deleted");
			}
		}catch (Exception e) {
			System.out.println("invalid data");
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean readByEmail(String emailId) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/trends", "root", "Xworkzodc@123");
			String query="select * from shopping where emailId = ?;";
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setString(1, emailId);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.println("id: " + rs.getInt(1) + "  name: " + rs.getString(2) + " emailId: " + rs.getString(3) + " location: " + rs.getShort(4) + " amount: " + rs.getInt(5));
			}
		}catch (Exception e) {
			System.out.println("invalid data");
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean readByName(String name) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/trends", "root", "Xworkzodc@123");
			String query="select * from shopping where name = ?;";
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setString(1, name);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.println("id: " + rs.getInt(1) + "  name: " + rs.getString(2) + " emailId: " + rs.getString(3) + " location: " + rs.getShort(4) + " amount: " + rs.getInt(5));
			}
		}catch (Exception e) {
			System.out.println("invalid data");
			e.printStackTrace();
		}
		return true;
	}

	

	

	

	
	
}
