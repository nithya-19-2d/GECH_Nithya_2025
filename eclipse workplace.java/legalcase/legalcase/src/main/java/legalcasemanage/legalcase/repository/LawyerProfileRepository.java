package legalcasemanage.legalcase.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import legalcasemanage.legalcase.model.LawyerProfile;
import legalcasemanage.legalcase.model.LoyerModel;

public interface LawyerProfileRepository extends JpaRepository<LawyerProfile, Long> {
	
	Optional<LawyerProfile> findByEmail(String email);
	
}
