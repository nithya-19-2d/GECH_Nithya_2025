package com.example.Relational.dto;

import com.example.Relational.employeemodel.Address;
import com.example.Relational.employeemodel.Department;

public class Employeedto {
	private String name;
	private String role;
	private Address address;
	private Department department;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public Employeedto(String name, String role, Address address, Department department) {
		super();
		this.name = name;
		this.role = role;
		this.address = address;
		this.department = department;
	}
	
	
	public Employeedto() {
		super();
	}
	
	
	
	
	

}
