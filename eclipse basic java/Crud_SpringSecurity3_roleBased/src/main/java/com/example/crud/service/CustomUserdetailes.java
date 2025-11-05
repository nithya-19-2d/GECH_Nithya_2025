package com.example.crud.service;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.crud.Employee.EmployeeModel;



public class CustomUserdetailes implements UserDetails {
	
	private EmployeeModel employee;
	

	public CustomUserdetailes(EmployeeModel employee) {
		super();
		this.employee = employee;
	}

//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		// TODO Auto-generated method stub
//		return List.of(new SimpleGrantedAuthority(getPassword(employee.getRole)));
//	}

	@Override
	public String getPassword() {

		return employee.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return employee.getEmail();
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		return List.of(new SimpleGrantedAuthority((employee.getRole())));
	}

}
