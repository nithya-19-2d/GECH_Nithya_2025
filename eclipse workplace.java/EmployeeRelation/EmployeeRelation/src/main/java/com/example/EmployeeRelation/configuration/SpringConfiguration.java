package com.example.EmployeeRelation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.example.EmployeeRelation.repository.Employeerepository;
import com.example.EmployeeRelation.userdetails.CustomuserdetailService;


@Configuration
public class SpringConfiguration {
	
	private Employeerepository reposit;
	private CustomSuccessHandler customsuccesshandler;
	
	
	public SpringConfiguration(Employeerepository reposit, CustomSuccessHandler customsuccesshandler) {
		super();
		this.reposit = reposit;
		this.customsuccesshandler = customsuccesshandler;
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public UserDetailsService userdetailsservice() {
		return new CustomuserdetailService(reposit);
	}
	
	@Bean
	public DaoAuthenticationProvider daoAuthenticationProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setPasswordEncoder(passwordEncoder());
		provider.setUserDetailsService(userdetailsservice());
		return provider;
		
	}
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		return http
				.authorizeHttpRequests(auth -> auth
						.requestMatchers("/","/register", "/department/new" , "/role/new" , "/department/save" , "/role/save", "css/**").permitAll()
						.anyRequest().authenticated())
				.formLogin(login -> login
						.loginPage("/login")
						.loginProcessingUrl("/login")
						.defaultSuccessUrl("/employee_list",true)
						.successHandler(customsuccesshandler)
						
				.permitAll())
				.logout(logout -> logout
						.logoutSuccessUrl("/login?logout") //uncomment this
						.permitAll())
						.build();
}
	
	
}
