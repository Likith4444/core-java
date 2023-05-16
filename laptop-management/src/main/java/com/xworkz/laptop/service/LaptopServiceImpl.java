package com.xworkz.laptop.service;

import java.util.List;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.laptop.dto.LaptopDTO;
import com.xworkz.laptop.exception.LaptopException;
import com.xworkz.laptop.repository.LaptopRepository;

@Service
public class LaptopServiceImpl implements LaptopService{
	
	
	     @Autowired
	     LaptopRepository laptopRepo ; 

	     @Override
		 	public boolean sendMail(String emailId) {
		 
	    	 System.out.println("inside sendMail method");
	    	 String portNumber = "587";
	    	 String hostName = "smtp.office365.com";
	    	 String fromEmail = "vijaykumarvini59@outlook.com";
	    	 String password = "Vij@y123";
	    	 String to = emailId;
	    	 
	    	 Properties prop = new Properties();
	    	 prop.put("mail.smtp.host", hostName);
	    	 prop.put("mail.smtp.port", portNumber);
	    	 prop.put("mail.smtp.starttls.enable","true");
	    	 prop.put("mail.debug", "true");
	    	 prop.put("mail.smtp.auth", "true");
	    	 prop.put("mail.transport.protocal", "smtp");
	    	 
	    	Session session = Session.getInstance(prop, new Authenticator() {
	    		@Override
	    		protected PasswordAuthentication getPasswordAuthentication() {
	    			return new PasswordAuthentication(fromEmail, password);
	    		}
			});
	    	 
	    	MimeMessage msg = new MimeMessage(session);
	    	try {
	    		msg.setFrom(new InternetAddress(fromEmail));
	    		msg.setSubject("Registeration completed....");
	    		msg.setText("Thanks for registration......*****$$$");
	    		msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
	    		Transport.send(msg);
	    		System.out.println("mail is succesfully sent");
	    		
	    	}catch (Exception e) {
	    		
				System.out.println("invalid data....exception occured");
				e.printStackTrace();
			}
	    	
		 		return true;
		 	}
	     
	@Override
	public LaptopDTO validateAndRegisterLaptop(LaptopDTO dto) {
		
		System.out.println("inside validateAndSave method of LaptopServiceImpl");
		try {
		
		boolean isCompanyNamePresent = false;
		boolean isModelNoPresent = false;
		boolean isColorPresent = false;
		boolean isProcessorPresent = false;
		boolean isRamPresent = false;
		boolean isEmailPresent = false;
		
		if(dto.getCompanyName() != null && !dto.getCompanyName().isEmpty()) {
			System.out.println("comapanyName is not empty");
			isCompanyNamePresent = true;
		}
		if(dto.getModelNo() != null && !dto.getModelNo().isEmpty()) {
			System.out.println("modelNo is not empty");
			isModelNoPresent = true;
		}
		if(dto.getColor() != null && !dto.getColor().isEmpty()) {
			System.out.println("color is not empty");
			isColorPresent = true;
		}
		if(dto.getProcessor() != null && !dto.getProcessor().isEmpty()) {
			System.out.println("processor is not empty");
			isProcessorPresent = true;
		}
		if(dto.getRam() != null && !dto.getRam().isEmpty()) {
			System.out.println("ram is not empty");
			isRamPresent = true;
		}
		
		if(dto.getEmailId() != null && !dto.getEmailId().isEmpty()) {
			System.out.println("emailId is not empty");
			isEmailPresent = true;
		}
		
		if( isCompanyNamePresent==true && isModelNoPresent==true && isColorPresent==true && isProcessorPresent==true && isRamPresent==true && isEmailPresent==true) {
			
			LaptopServiceImpl mmm = new LaptopServiceImpl();
			mmm.sendMail(dto.getEmailId());
			
			laptopRepo.saveLaptop(dto);
		
		}
		
		return dto;
		
	}catch (Exception e) {
		System.out.println("invalid data...exception occured");
		e.printStackTrace();
		throw new LaptopException();
	}

	}

	@Override
	public List<LaptopDTO> getAllLaptopsSer() {
		
		System.out.println("Inside getAllLaptopsSer method");
		
		return laptopRepo.getAllLaptopsRep();
	}

	@Override
	public List<LaptopDTO> getLaptopByCompanyNameSer(String companyName) {
		
		System.out.println("inside getLaptopByCompanyNameSer method");
		return laptopRepo.getLaptopByCompanyNameRep(companyName);
	}

	@Override
	public LaptopDTO getLapatopByIdSer(int id) {
		
		System.out.println("inside updateLaptopServ method..");
		return laptopRepo.getLapatopByIdRepo(id);
	}

	@Override
	public LaptopDTO updateLaptopByIdServ(LaptopDTO dto) {
		
		System.out.println("inside updateLaptopByIdServ method");
		return laptopRepo.updateLaptopByIdRepo(dto);
	}

	@Override
	public List<LaptopDTO> deleteByLaptopIdServ(int id) {
		
		System.out.println("inside deleteByLaptopId method");
		return laptopRepo.deleteByLaptopIdRepo(id);
	}

	
}
