package legalcasemanage.legalcase.Controller;

import org.springframework.stereotype.Controller;

import legalcasemanage.legalcase.repository.LowyerRepository;


@Controller
public class AdminController {
	
	public LowyerRepository repo;

	public AdminController(LowyerRepository repo) {
		super();
		this.repo = repo;
	}
	


}
