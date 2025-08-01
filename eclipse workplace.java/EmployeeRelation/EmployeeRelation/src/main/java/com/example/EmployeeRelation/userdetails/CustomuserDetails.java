package com.example.EmployeeRelation.userdetails;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.EmployeeRelation.model.Employee;

public class CustomuserDetails implements UserDetails {
	
	private Employee employee;
	
	

	public CustomuserDetails(Employee employee) {
		super();
		this.employee = employee;
	}
	
	 public Employee getEmployee() {
	        return employee;
	    }

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return List.of(new SimpleGrantedAuthority(employee.getRole().getName()));
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return employee.getPassword()  ;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return employee.getEmail();
	}

}
