package legalcasemanage.legalcase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;



import legalcasemanage.legalcase.DTO.LegalcaseDTO;
import legalcasemanage.legalcase.model.LoyerModel;
import legalcasemanage.legalcase.repository.LowyerRepository;

@Service
public class Legalservice {
	private LowyerRepository repo;

	public Legalservice(LowyerRepository repo) {
		super();
		this.repo = repo;
	}
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public void storeCase(LegalcaseDTO legalDTO) {
		LoyerModel lowyer = new LoyerModel ();
		lowyer.setFull_name(legalDTO.getFull_name());
		lowyer.setEmail(legalDTO.getEmail());
		lowyer.setPassword(passwordEncoder.encode(legalDTO.getPassword()));
		//lowyer.setConfirm_password(legalDTO.getConfirm_password());
		lowyer.setRole(legalDTO.getRole());
		repo.save(lowyer);
	}

}
