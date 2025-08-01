package com.example.EmployeeRelation.userdetails;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.example.EmployeeRelation.model.Employee;
import com.example.EmployeeRelation.repository.Employeerepository;


public class CustomuserdetailService implements UserDetailsService {
	
	private Employeerepository repo;
	

	public CustomuserdetailService(Employeerepository repo) {
		super();
		this.repo = repo;
	}


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Employee emplo=repo.findByEmail(username)
				.orElseThrow(
						()-> new UsernameNotFoundException("username not found:"+username));
				
		return new CustomuserDetails(emplo);
		
	
	}

}
