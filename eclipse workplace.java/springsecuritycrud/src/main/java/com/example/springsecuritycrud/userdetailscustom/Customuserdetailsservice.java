package com.example.springsecuritycrud.userdetailscustom;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.example.springsecuritycrud.model.UserModel;
import com.example.springsecuritycrud.springrepository.SpringRepository;


public class Customuserdetailsservice implements UserDetailsService{

	private SpringRepository repo;
	
	public Customuserdetailsservice(SpringRepository repo) {
		super();
		this.repo = repo;
	}


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		UserModel usermodel=repo.findByEmail(username)
				.orElseThrow(
						()-> new UsernameNotFoundException("username not found:"+username));
				
		return new Customuserdeatils(usermodel);
		
	}


}
