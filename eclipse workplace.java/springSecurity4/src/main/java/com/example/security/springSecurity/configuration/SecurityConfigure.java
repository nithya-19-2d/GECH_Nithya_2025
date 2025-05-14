package com.example.security.springSecurity.configuration;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.example.security.springSecurity.repository.repository;
import com.example.security.springSecurity.userdetailes.CustomUserDetailService;
import static org.springframework.security.config.Customizer.withDefaults;

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
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		return http
				.authorizeHttpRequests(auth -> auth
						.requestMatchers("/","/about","/contact","/register").permitAll() //access these page without default login
						.anyRequest().authenticated())
				//.formLogin(withDefaults()) //this is for to show the default login page , after successfull login which redirect to the student-detailes page
				.formLogin(login -> login
						.loginPage("/login")
						.loginProcessingUrl("/login")
						.defaultSuccessUrl("/std-details",true)
						.permitAll())
				.logout(logout -> logout
						//.logoutSuccessfullUrl("/login?logout")
						.permitAll())
		
				
				.build();
	}
}
