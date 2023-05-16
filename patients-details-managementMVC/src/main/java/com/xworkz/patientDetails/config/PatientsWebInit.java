package com.xworkz.patientDetails.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class PatientsWebInit extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("initilizing root config class");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("initilizing servlet config class");
		return new Class[] {SpringConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("initilizing getServletMappings");
		return new String[] {"/"};
	}

	
	
}
