package legalcasemanage.legalcase.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import legalcasemanage.legalcase.model.LoyerModel;
import legalcasemanage.legalcase.repository.LowyerRepository;


public class Customuserdatailservice implements UserDetailsService {
	
	private LowyerRepository repo;
	
	
	public Customuserdatailservice(LowyerRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		LoyerModel loyermodel=repo.findByEmail(username)
				.orElseThrow(
						()-> new UsernameNotFoundException("username not found:"+username));
		//System.out.println(loyermodel +"1111111111111");	
		return new Customusersetails(loyermodel);
	}
	

}
