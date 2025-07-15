package com.example.Relational.employeemodel;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "department")
public class Department {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private String deptname;
	
	@OneToMany(mappedBy = "department")
	@JsonManagedReference
	private List<Employee> employee;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	//consrtuctor
	public Department(Long id, String deptname, List<Employee> employee) {
		super();
		this.id = id;
		this.deptname = deptname;
		this.employee = employee;
	}

	
	//no args
	public Department() {
		super();
	}
	
	
	
	
	
}
