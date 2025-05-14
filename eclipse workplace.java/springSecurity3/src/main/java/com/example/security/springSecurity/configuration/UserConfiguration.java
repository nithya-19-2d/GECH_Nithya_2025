package com.example.security.springSecurity.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserConfiguration {
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	@Bean
	public UserDetailsService userDetailsService() {
		UserDetails user1 = User.withUsername("nithya")
				.password(passwordEncoder().encode("nithya@123"))
				.roles("ADMIN")
				.build();
		UserDetails user2 = User.withUsername("pavan")
				.password(passwordEncoder().encode("pavan@12"))
				.roles("USER")
				.build();
		return new InMemoryUserDetailsManager(user1, user2);
				
	}
	
}
