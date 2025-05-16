package legalcasemanage.legalcase.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;



import legalcasemanage.legalcase.DTO.LegalcaseDTO;
import legalcasemanage.legalcase.service.Legalservice;

@Controller
public class HomeController {
	private Legalservice caseservice;
	
	
	public HomeController(Legalservice caseservice) {
		super();
		this.caseservice = caseservice;
	}
	
	@GetMapping({"/"," "})
	 public String home() {
		 return "index";
	 }
	@GetMapping({"/about"})
	 public String about() {
		 return "about";
	 }
	
	@GetMapping({"/contact"})
	 public String contact() {
		 return "contact";
	 }
	
	@GetMapping({"/admin"})
	 public String admin() {
		 return "Admin";
	 }
	@GetMapping({"/register"})
	 public String register(Model model) {
		LegalcaseDTO legalDTO = new LegalcaseDTO();
		model.addAttribute("legalDTO",legalDTO);
		 return "Register";
	 }
	
	@PostMapping("/register")
	public String register(@ModelAttribute LegalcaseDTO legalDTO , RedirectAttributes redirectAttributes) {
		caseservice.storeCase(legalDTO);
		redirectAttributes.addFlashAttribute("success","student saved succefully");
		return "redirect:/login";
	}
	
	@GetMapping({"/login"})
	 public String Login() {
		 return "Login";
	 }
	@GetMapping({"/add-lawyer"})
	 public String addlawyer() {
		 return "add_lawyer";
	 }
	@GetMapping({"/add-client"})
	 public String addclient() {
		 return "add_client";
	 }
	
	@GetMapping({"/service"})
	 public String services() {
		 return "service";
	 }
	
	@GetMapping({"/lawyer_dashboard"})
	 public String lawdashboard() {
		 return "Lawyer_dashboard";
	 }
	
	@GetMapping({"/client_dashboard"})
	 public String clientdashboard() {
		 return "Client_dashboard";
	 }
	
	

}
