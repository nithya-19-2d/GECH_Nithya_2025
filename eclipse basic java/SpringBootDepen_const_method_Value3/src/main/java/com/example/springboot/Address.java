package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	String city;

	public Address() {
		System.out.println("the address object created");
			
	}
	
	@Autowired
	public void Addressname(@Value("Bengaluru") String cityname) {
		this.city= cityname;
	}
	
	

}
