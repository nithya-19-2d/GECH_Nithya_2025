package com.example.demo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SpringBootConfig {
	
	@Bean
	
	public Address address1() {
		return new Address(); 
		// we can alse give like this Address("mysore") ,
		//if not mention @Value("${employee.name}") in the Address class constructor .if we did like this , 
		//then give value, in application.prop=> address.name = "hg" , if the field is public otherwise use getter and setter
		
		
	}
	
	@Bean
	@Primary
	public Address address2() {
		return new Address();
	}
	
	@Bean
	public Address address3() {
		return new Address();
	}
	
	

}
