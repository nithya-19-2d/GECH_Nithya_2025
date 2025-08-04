package legalcasemanage.legalcase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import legalcasemanage.legalcase.model.Specialization;

public interface SpecializationRepository extends JpaRepository<Specialization, Long> {
	
}
