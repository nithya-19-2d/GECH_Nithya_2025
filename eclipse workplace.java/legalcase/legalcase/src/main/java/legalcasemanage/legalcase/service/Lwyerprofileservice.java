package legalcasemanage.legalcase.service;

import java.util.List;

import org.springframework.stereotype.Service;



import legalcasemanage.legalcase.model.LawyerProfile;
import legalcasemanage.legalcase.model.LoyerModel;
import legalcasemanage.legalcase.repository.LawyerProfileRepository;
import legalcasemanage.legalcase.repository.LowyerRepository;

@Service
public class Lwyerprofileservice {
	
	public LawyerProfileRepository lowyerprofile;

	public Lwyerprofileservice(LawyerProfileRepository lowyerprofile) {
		super();
		this.lowyerprofile = lowyerprofile;
	}
	
	public List<LawyerProfile> getAll() {
        return lowyerprofile.findAll();
    }
	
	public LawyerProfile getById(Long id) {
        return lowyerprofile.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
    }
	
	public LawyerProfile save(LawyerProfile profile) {
		return lowyerprofile.save(profile);
	}
	
	

}
