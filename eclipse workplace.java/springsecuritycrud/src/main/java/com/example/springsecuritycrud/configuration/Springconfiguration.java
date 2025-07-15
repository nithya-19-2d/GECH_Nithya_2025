package com.example.springsecuritycrud.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.example.springsecuritycrud.springrepository.SpringRepository;
import com.example.springsecuritycrud.userdetailscustom.Customuserdetailsservice;




@Configuration
public class Springconfiguration {
	
	
	private SpringRepository reposit;

	public Springconfiguration(SpringRepository reposit) {
		super();
		this.reposit = reposit;
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public UserDetailsService userdetailsservice() {
		return new Customuserdetailsservice(reposit);
	}
	
	@Bean
	public DaoAuthenticationProvider daoAuthenticationProvider() {
		DaoAuthenticationProvider daoprovider = new DaoAuthenticationProvider();
		daoprovider.setPasswordEncoder(passwordEncoder());
		daoprovider.setUserDetailsService(userdetailsservice());
		
		return daoprovider;
	}
	
	
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		return http
				.authorizeHttpRequests(auth -> auth
						.requestMatchers("/","/register").permitAll()
						.anyRequest().authenticated())
				.formLogin(login -> login
						.loginPage("/login")
						.loginProcessingUrl("/login")
						.defaultSuccessUrl("/student_list",true)
						
				.permitAll())
				.logout(logout -> logout
						.logoutSuccessUrl("/login?logout") //uncomment this
						.permitAll())
						.build();
}
}
