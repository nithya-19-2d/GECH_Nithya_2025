package legalcasemanage.legalcase.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import legalcasemanage.legalcase.model.LoyerModel;

@Repository
public interface LowyerRepository extends JpaRepository<LoyerModel, Long> {
	
	//optional is used to avoid null pointer or exception , mainly is used for overcome from thease, (is important go through this), serch weather present or not
	Optional<LoyerModel> findByEmail(String email);
	
	 List<LoyerModel> findByRole(String role);
	 long countByRole(String role);
	 List<LoyerModel> findTop5ByRoleNotOrderByCreatedAtDesc(String role); // latest 5 users
	 List<LoyerModel> findByRoleNot(String role);


}


