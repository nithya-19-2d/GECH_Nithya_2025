package com.springrelation.relationmodels;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "emp_detailes")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	
	private int id;
	private String name;
	private String password;
	private String email;
	
	@OneToOne
	@JoinColumn(name = "address_id")
	private Address address;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "department_id")
	private Department department;
	
//	@ManyToMany
//	private List<Projects> project;

	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

//	public List<Projects> getProject() {
//		return project;
//	}
//
//	public void setProject(List<Projects> project) {
//		this.project = project;
//	}
	
	
	
	

}
