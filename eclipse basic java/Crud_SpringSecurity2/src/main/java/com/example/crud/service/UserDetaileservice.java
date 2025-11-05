package com.example.crud.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.example.crud.Employee.EmployeeModel;
import com.example.crud.repository.EmployeeRepository;

public class UserDetaileservice implements UserDetailsService {
	
	public EmployeeRepository employeeRepository;
	
	
	

	public UserDetaileservice(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}




	


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		EmployeeModel employee = employeeRepository.findByEmail(username);
		return new CustomUserdetailes(employee);
	}

}
