package com.example.security.springSecurity.userdetailes;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.security.springSecurity.model.SecurityModel;

public class CustomUserDetails implements UserDetails
{
	private SecurityModel securitymodels;

	//constructor injuction
	public CustomUserDetails(SecurityModel securitymodels) {
		super();
		this.securitymodels = securitymodels;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		return List.of(new SimpleGrantedAuthority(securitymodels.getRole()));
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return securitymodels.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return securitymodels.getEmail();
	}
	
	//anyMatch(pridicate method) ,is a method which holds the pridicate method , and is functional interface
	
	
	

}
