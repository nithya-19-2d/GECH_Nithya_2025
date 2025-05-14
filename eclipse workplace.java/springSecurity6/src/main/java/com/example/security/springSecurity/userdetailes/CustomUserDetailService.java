package com.example.security.springSecurity.userdetailes;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.example.security.springSecurity.model.SecurityModel;
import com.example.security.springSecurity.repository.repository;

public class CustomUserDetailService implements UserDetailsService {
	
	private repository repo;
	

	public CustomUserDetailService(repository repo) {
		super();
		this.repo = repo;
	}


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		SecurityModel securitymodels=repo.findByEmail(username)
				.orElseThrow(
						()-> new UsernameNotFoundException("username not found:"+username));
				
		return new CustomUserDetails(securitymodels);
	}
	

}
