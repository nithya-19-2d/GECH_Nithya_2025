package com.example.crud.Employee;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String name;
	private String email;
	private long phone_no;
	private String department;
	private String password;

	public EmployeeModel() {
		super();
	}

	public EmployeeModel(long id, String name, String email, int phone_no, String department, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone_no = phone_no;
		this.department = department;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
