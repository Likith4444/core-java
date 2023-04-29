package com.xworkz.laptop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ComponentScan(basePackages = "com.xworkz.laptop")
@Configuration
public class SpringConfiguration {
  
	@Bean
	public ViewResolver getViewResolver() {
		
		return new InternalResourceViewResolver("/", ".jsp");
	}
	
}
