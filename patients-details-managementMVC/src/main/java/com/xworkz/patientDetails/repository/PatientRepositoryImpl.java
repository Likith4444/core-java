package com.xworkz.patientDetails.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.xworkz.patientDetails.dto.PatientsDTO;

@Repository
public class PatientRepositoryImpl implements PatientsRepository{

	@Override
	public PatientsDTO savePatient(PatientsDTO dto) {
		
		System.out.println("Inside savePatient method");
		try {
			 
		    Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trends", "root", "Xworkzodc@123");
			String query = "insert into patients_details values(?,?,?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, dto.getId());
			stmt.setString(2, dto.getPatientName());
			stmt.setInt(3, dto.getRoomNo());
			stmt.setString(4, dto.getPatientAddress());
			stmt.setString(5, dto.getGender());
			stmt.setInt(6, dto.getAge());
			
			int i = stmt.executeUpdate();
		
			if(i != 0) {
				System.out.println("data saved");
			}else {
				System.out.println("data not saved");
			}
		 
		}catch (Exception e) {
			System.out.println("exception occured");
			e.printStackTrace();
		}
		
		return dto;
	}

	@Override
	public List<PatientsDTO> getAllPatientsRepo() {
		
		System.out.println("Inside getAllPatientsRepo method");
		List<PatientsDTO> list = new ArrayList<PatientsDTO>();
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trends", "root", "Xworkzodc@123");
		String query="select * from patients_details";			
		PreparedStatement stmt = con.prepareStatement(query);
		ResultSet rs=stmt.executeQuery();
		while(rs.next()) {
			
			PatientsDTO dto = new PatientsDTO();
			dto.setId(rs.getInt(1));
			dto.setPatientName(rs.getString(2));
			dto.setRoomNo(rs.getInt(3));
			dto.setPatientAddress(rs.getString(4));
			dto.setGender(rs.getString(5));
			dto.setAge(rs.getInt(6));
			
			list.add(dto);
			
			
		}
		}catch (Exception e) {
			System.out.println("exception occured");
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<PatientsDTO> getPatientByPatientNameRepo(String patientName) {
		
		System.out.println("inside getPatientByPatientNameRepo method");
		List<PatientsDTO> list = new ArrayList<PatientsDTO>();
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trends", "root", "Xworkzodc@123");
		String query="select * from patients_details where patientName = ?";			
		PreparedStatement stmt = con.prepareStatement(query);
		
		stmt.setString(1, patientName);
		ResultSet rs=stmt.executeQuery();
		while(rs.next()) {
			
			PatientsDTO dto = new PatientsDTO();
			dto.setId(rs.getInt(1));
			dto.setPatientName(rs.getString(2));
			dto.setRoomNo(rs.getInt(3));
			dto.setPatientAddress(rs.getString(4));
			dto.setGender(rs.getString(5));
			dto.setAge(rs.getInt(6));
			
			list.add(dto);
		}
		
		}catch (Exception e) {
			System.out.println("exception occured");
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public PatientsDTO getPatientByIdRepo(int id) {
		
		System.out.println("inside getPatientByIdRepo method to update by id...");
		PatientsDTO dto = new PatientsDTO();
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trends", "root", "Xworkzodc@123");
		String query = "select * from patients_details where id = ?";
		PreparedStatement stmt = con.prepareStatement(query);
		stmt.setInt(1, id);
		ResultSet rs=stmt.executeQuery();
		
		while(rs.next()) {
			
			PatientsDTO dtos = new PatientsDTO();
			dto.setId(rs.getInt(1));
			dto.setPatientName(rs.getString(2));
			dto.setRoomNo(rs.getInt(3));
			dto.setPatientAddress(rs.getString(4));
			dto.setGender(rs.getString(5));
			dto.setAge(rs.getInt(6));
			
			dto = dtos;
		}
		
		}catch (Exception e) {
			
			System.out.println("exception occured");
			e.printStackTrace();
		}
		return dto;
	}

	@Override
	public PatientsDTO updatePatientByIdRepo(PatientsDTO dto) {
		
		System.out.println("inside updatePatientByIdRepo method");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trends", "root", "Xworkzodc@123");
			String query ="update patients_details set patientName = ? , roomNo = ?, address = ?, gender = ?, age = ? where id = ?" ;
			PreparedStatement stmt = con.prepareStatement(query);
			
			stmt.setString(1, dto.getPatientName());
			stmt.setInt(2, dto.getRoomNo());
			stmt.setString(3, dto.getPatientAddress());
			stmt.setString(4, dto.getGender());
			stmt.setInt(5, dto.getAge());
			stmt.setInt(6, dto.getId());
			
			int i = stmt.executeUpdate();
			if(i != 0) {
				System.out.println("updated");
			}else {
				System.out.println("not updated");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("exception occured");
		}
		
		return dto;
	}

	@Override
	public List<PatientsDTO> deleteByPatientIdServ(int id) {
		
		System.out.println("inside deleteByPatientIdServ method");
		List<PatientsDTO> list = new ArrayList<PatientsDTO>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/trends", "root", "Xworkzodc@123");
			String query="delete from patients_details where id=?";
			PreparedStatement statement =connection.prepareStatement(query);
			statement.setInt(1, id);
			int i = statement.executeUpdate();
			ResultSet rs=statement.executeQuery();
			while(rs.next()) {

				PatientsDTO dto = new PatientsDTO();
				dto.setId(rs.getInt(1));
				dto.setPatientName(rs.getString(2));
				dto.setRoomNo(rs.getInt(3));
				dto.setPatientAddress(rs.getString(4));
				dto.setGender(rs.getString(5));
				dto.setAge(rs.getInt(6));
				
				list.add(dto);
			}

		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("exception occured");
		}
		return list;
	}

	
	
}
