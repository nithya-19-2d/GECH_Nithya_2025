package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address1 {
	

	public String city;
	public String state;
	
	public Address1() {
		System.out.println("Adress1 object created");
	}
	
	
	//Autowired -> means it should call the below method , even if the presence of other constructor(default constructor) 
   @Autowired
	public Address1(@Value("${address.city}") String city, @Value("${address.state}") String state) {
		super();
		this.city = city;
		this.state = state;
}

		

}
