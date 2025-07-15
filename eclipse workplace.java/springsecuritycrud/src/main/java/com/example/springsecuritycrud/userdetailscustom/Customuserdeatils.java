package com.example.springsecuritycrud.userdetailscustom;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.springsecuritycrud.model.UserModel;

public class Customuserdeatils implements UserDetails {
	
	private UserModel usermodel;
	

	public Customuserdeatils(UserModel usermodel) {
		super();
		this.usermodel = usermodel;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public String getPassword() {
		return usermodel.getPassword();
	}

	@Override
	public String getUsername() {
		return usermodel.getEmail();
	}


}
