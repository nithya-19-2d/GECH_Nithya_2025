package legalcasemanage.legalcase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import legalcasemanage.legalcase.model.LawyerProfile;

public interface LawyerProfileRepository extends JpaRepository<LawyerProfile, Long> {
	
}
