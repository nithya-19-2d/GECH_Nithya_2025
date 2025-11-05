package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	public String enmae;
	public Address addressone;
	
	

	public Employee(@Qualifier("address2") Address addressone) {
		super();
		this.enmae = "nithya";
		this.addressone = addressone;
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


	public void setAddressone(Address addressone) {
		this.addressone = addressone;
	}
	
	 public void showDetails() {
	        System.out.println("Employee lives in " + addressone.getName());
	    }
	}
	
	


