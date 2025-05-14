package com.example.security.springSecurity.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.security.springSecurity.repository.repository;
import com.example.security.springSecurity.userdetailes.CustomUserDetailService;

@Configuration
public class SecurityConfigure {
	
	private repository repo;
	
	
	public SecurityConfigure(repository repo) {
		super();
		this.repo = repo;
	}
	@Bean
	public PasswordEncoder passwordencoder() {
		return new BCryptPasswordEncoder();	

}
	@Bean
	public UserDetailsService userdetailsservice() {
		return new CustomUserDetailService(repo);
	}
	
	@Bean
	public DaoAuthenticationProvider daoAuthenticationProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setPasswordEncoder(passwordencoder());
		provider.setUserDetailsService(userdetailsservice());
		return provider;
		
	}
}
