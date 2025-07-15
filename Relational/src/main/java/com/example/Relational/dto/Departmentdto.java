package com.example.Relational.dto;

import java.util.List;

import com.example.Relational.employeemodel.Employee;

public class Departmentdto {
	
	private long id;
	private String deptname;
	private List<Employee> employee;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	
	

}
