package com.xworkz.patientDetails.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.xworkz.patientDetails")
public class SpringConfiguration {
	
	@Bean
	public ViewResolver getViewResolver() {
		
		return new InternalResourceViewResolver("/" ,".jsp");
	}

}
