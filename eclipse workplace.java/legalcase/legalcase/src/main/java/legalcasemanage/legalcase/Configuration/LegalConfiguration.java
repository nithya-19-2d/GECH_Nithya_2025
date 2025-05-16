package legalcasemanage.legalcase.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import legalcasemanage.legalcase.repository.LowyerRepository;
import legalcasemanage.legalcase.service.Customuserdatailservice;



@Configuration
public class LegalConfiguration {
	private LowyerRepository repo;
	private Customsucesshandler customsuccessHandler;
	
	
	
	public LegalConfiguration(LowyerRepository repo, Customsucesshandler customsuccessHandler) {
		super();
		this.repo = repo;
		this.customsuccessHandler = customsuccessHandler;
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();	

}
	@Bean
	public UserDetailsService userdetailsservice() {
		return new Customuserdatailservice(repo);
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
//						.requestMatchers("/user").hasRole("USER")
						.requestMatchers("/lawyer_dashboard").hasAnyRole("LAWYER","ADMIN")
						.requestMatchers("/client_dashboard").hasAnyRole("CLIENT","ADMIN")
						.requestMatchers("/admin").hasRole("ADMIN")
						
						.requestMatchers("/","/about","/contact","/register","/service","Photos/**","css/**","js/**").permitAll() //access these page without default login
						.anyRequest().authenticated())
				
				.formLogin(login -> login
						.loginPage("/login")
						.loginProcessingUrl("/login")
						//.defaultSuccessUrl("/admin",true)
						.successHandler(customsuccessHandler)
						.permitAll())
				
				.logout(logout -> logout
						.logoutSuccessUrl("/login?logout")
						.permitAll())
				.build();
				}
	
	
	
}
