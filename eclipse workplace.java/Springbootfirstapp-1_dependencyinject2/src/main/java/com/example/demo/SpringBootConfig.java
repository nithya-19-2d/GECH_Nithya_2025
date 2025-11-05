package com.example.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SpringBootConfig {
	
	@Bean
	@Primary
	public Address address1() {
		return new Address();
	}
	
	@Bean
	
	public Address address2() {
		return new Address();
	}
	
	@Bean
	public Address address3() {
		return new Address();
	}
	
	

}
