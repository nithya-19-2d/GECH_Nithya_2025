package com.example.crud.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.example.crud.repository.EmployeeRepository;
import com.example.crud.service.UserDetaileservice;
import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class EmployeeConfiguration {
	
	public EmployeeRepository employeeRepository;
	
	public EmployeeConfiguration(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}



	@Bean
	public PasswordEncoder passwordEncoder()  {
		return  new BCryptPasswordEncoder();
	
	}
	
    @Bean
    public UserDetaileservice userdetaileservice() {
    	return new UserDetaileservice(employeeRepository);
    }
    
    
    @Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		return http
				.authorizeHttpRequests(auth->
				auth.requestMatchers("/","/add_employee").permitAll()
				.anyRequest().authenticated())
				.formLogin(withDefaults())
				.build();
	}
	
    
   


	@Bean
    public DaoAuthenticationProvider daoAuthenticationprovider() {
    	DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
    	provider.setPasswordEncoder(passwordEncoder());
    	provider.setUserDetailsService(userdetaileservice());
    	return provider;
    }
    
    



	
	}
	
	
	


