package com.example.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBootConfig {
	
	@Bean
	public Address address() {
		return new Address();
	}
	
	@Bean
	public Address address1() {
		return new Address();
	}
	
	@Bean
	public Address address2() {
		return new Address();
	}
	
	

}
