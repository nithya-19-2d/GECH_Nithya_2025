package legalcasemanage.legalcase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;



import legalcasemanage.legalcase.DTO.LegalcaseDTO;
import legalcasemanage.legalcase.model.LoyerModel;
import legalcasemanage.legalcase.repository.LowyerRepository;

@Service
public class Legalservice {
	private LowyerRepository repo;
	private PasswordEncoder passwordEncoder;

	
	
	public Legalservice(LowyerRepository repo, PasswordEncoder passwordEncoder) {
		super();
		this.repo = repo;
		this.passwordEncoder = passwordEncoder;
	}



	public void storeCase(LegalcaseDTO legalDTO) {
		LoyerModel lowyer = new LoyerModel ();
		lowyer.setFull_name(legalDTO.getFull_name());
		lowyer.setEmail(legalDTO.getEmail());
		lowyer.setPassword(passwordEncoder.encode(legalDTO.getPassword()));
		//lowyer.setConfirm_password(legalDTO.getConfirm_password());
		lowyer.setRole(legalDTO.getRole());
		lowyer.setCreatedAt(legalDTO.getCreatedAt());
		repo.save(lowyer);
	}
	
	public void deleteUser(Long id) {
		LoyerModel users = repo.findById(id).get();
		repo.delete(users);
		
	}
	
	public LegalcaseDTO getUser(Long id) {
		LoyerModel users = repo.findById(id).get();
		LegalcaseDTO caseDTO = new LegalcaseDTO();
		caseDTO.setFull_name(users.getFull_name());
		caseDTO.setEmail(users.getEmail());
		return caseDTO;
	}
	
	public void updateuser(LegalcaseDTO caseDTO, Long id) {
		LoyerModel users = repo.findById(id).get();
		users.setFull_name(caseDTO.getFull_name());
		users.setEmail(caseDTO.getEmail());
		repo.save(users);
	}
	
	//to get list of users
	public List<LoyerModel> getAllusers() {
		List<LoyerModel> allusers = repo.findAll();
        return allusers;
	}
	
	
	
	

}
