package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	public String enmae;
	
	
	@Autowired
	public Address addressone;
	
	public Employee() {
		System.out.println("employee object created");
	}

	public String getEnmae() {
		return enmae;
	}

	public void setEnmae(String enmae) {
		this.enmae = enmae;
	}

	public Address getAddressone() {
		return addressone;
	}

	//setter injection
	
	@Autowired
	public void setAddressone(@Qualifier("address2")Address addressone) {
		this.addressone = addressone;
	}
	
	
	
	

}
