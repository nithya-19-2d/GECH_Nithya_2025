package com.springrelation.relationmodels;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee_add")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	
	private int id;
	private String city;
	private String state;
	private String country;
	
//	@OneToOne(mappedBy = "address") => which wont create the employee_id column in the database , but we can fetch the employee_id from the address , if we mention like this , and this is happen by bidirectional mapping only, used mappedBy 
//	private Employee employee;
//
//	
//	public Employee getEmployee() {
//		return employee;
//	}
//	public void setEmployee(Employee employee) {
//		this.employee = employee;
//	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	/*Entity should be like this:
	 * Entity should fallow pojo class .
	 * pojo class includes=>fields should be private, and containes getters and setters and no args constructor and full args constructor.
	 * */
	

}
