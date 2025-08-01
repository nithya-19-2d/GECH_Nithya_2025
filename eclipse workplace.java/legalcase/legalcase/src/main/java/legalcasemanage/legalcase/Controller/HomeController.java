package legalcasemanage.legalcase.Controller;

import java.util.List;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;



import jakarta.servlet.http.HttpServletRequest;
import legalcasemanage.legalcase.DTO.LegalcaseDTO;
import legalcasemanage.legalcase.model.LoyerModel;
import legalcasemanage.legalcase.repository.LowyerRepository;
import legalcasemanage.legalcase.service.Customuserdetails;
import legalcasemanage.legalcase.service.Legalservice;

@Controller
public class HomeController {
	private Legalservice caseservice;
	private LowyerRepository repo;
	private PasswordEncoder passwordEncoder;

	

	

	public HomeController(Legalservice caseservice, LowyerRepository repo, PasswordEncoder passwordEncoder) {
		super();
		this.caseservice = caseservice;
		this.repo = repo;
		this.passwordEncoder = passwordEncoder;
	}

	@GetMapping({ "/", " " })
	public String home() {
		return "Home/index";
	}

	@GetMapping({ "/about" })
	public String about() {
		return "Home/about";
	}

	@GetMapping({ "/contact" })
	public String contact() {
		return "Home/contact";
	}
	
	@GetMapping({ "/all_users" })
	public String allUsers(Model model) {
		List<LoyerModel> users = repo.findByRoleNot("ROLE_ADMIN");
		model.addAttribute("users",users);
		return "Admin/all_users";

	}
	

	@GetMapping({ "/admin" })
	public String admin(HttpServletRequest request, Model model) {
		//count of lawyers
		long totallawyers = repo.countByRole("ROLE_LAWYER");
		long totalclients = repo.countByRole("ROLE_CLIENT");
		
		model.addAttribute("totallawyers",totallawyers);
		model.addAttribute("totalclients",totalclients);
		
		
		//sessioning
		String success_msg = (String) request.getSession().getAttribute("success");
		if (success_msg != null) {
			model.addAttribute("success", success_msg);
			request.getSession().removeAttribute("success");
		}
		
		List<LoyerModel> users = caseservice.getAllusers();
		List<LoyerModel> rescentusers = repo.findTop5ByRoleNotOrderByCreatedAtDesc("ROLE_ADMIN");
		model.addAttribute("users", users);
		model.addAttribute("rescentusers", rescentusers);
		
		
		return "Admin/Admin";
	}

	@GetMapping({ "/register" })
	public String register(Model model) {
		LegalcaseDTO legalDTO = new LegalcaseDTO();
		model.addAttribute("legalDTO", legalDTO);
		return "Register";
	}

	@PostMapping("/register")
	public String register(@ModelAttribute LegalcaseDTO legalDTO, RedirectAttributes redirectAttributes) {
		caseservice.storeCase(legalDTO);
		redirectAttributes.addFlashAttribute("success", "student saved succefully");
		return "redirect:/login";
	}

	@GetMapping({ "/login" })
	public String Login() {
		return "Login";
	}

	@GetMapping("/lawyers-new")
	public String showLawyerForm(Model model) {
		model.addAttribute("user", new LoyerModel());
		return "Admin/add_lawyer";
	}

	@PostMapping("/save-lawyer")
	public String saveLawyer(@ModelAttribute LoyerModel user, RedirectAttributes redirectAttributes) {
		user.setRole("ROLE_LAWYER");
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		repo.save(user);
		redirectAttributes.addFlashAttribute("success", "Lawyer added successfully!");
		return "redirect:/admin";
	}
	
	@GetMapping("/clients-new")
	public String showClientForm(Model model) {
		model.addAttribute("user", new LoyerModel());
		return "Admin/add_client";
	}

	@PostMapping("/save-client")
	public String saveClient(@ModelAttribute LoyerModel user, RedirectAttributes redirectAttributes) {
		user.setRole("ROLE_CLIENT");
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		repo.save(user);
		redirectAttributes.addFlashAttribute("success", "Client added successfully!");
		return "redirect:/admin";
	}
	
	@GetMapping({ "/service" })
	public String services() {
		return "Home/service";
	}

	@GetMapping({ "/lawyer_dashboard" })
	public String lawdashboard(HttpServletRequest request,@AuthenticationPrincipal Customuserdetails userDetails, Model model) {
		String success_msg = (String) request.getSession().getAttribute("success");
		if (success_msg != null) {
			model.addAttribute("success", success_msg);
			request.getSession().removeAttribute("success");
		}
		model.addAttribute("fullname", userDetails.getFullname());
		return "Lawyer_dashboard/Lawyer_dashboard";
	}

	@GetMapping({ "/client_dashboard" })
	public String clientdashboard(HttpServletRequest request, @AuthenticationPrincipal Customuserdetails userDetails, Model model) {
		String success_msg = (String) request.getSession().getAttribute("success");
		if (success_msg != null) {
			model.addAttribute("success", success_msg);
			request.getSession().removeAttribute("success");
		}
		model.addAttribute("fullname", userDetails.getFullname());
		return "Client_Dashboard/Client_dashboard";
	}

	@GetMapping({ "/client_request" })
	public String Client_request() {
		return "Lawyer_dashboard/lawclient-request";
	}

	@GetMapping({ "/my_cases" })
	public String My_cases() {
		return "Lawyer_dashboard/my_cases";
	}

	@GetMapping({ "/appointments" })
	public String Appointments() {
		return "Lawyer_dashboard/appointment";
	}

	@GetMapping({ "/hire" })
	public String Hire_law() {
		return "Client_Dashboard/hire";
	}

	@GetMapping({ "/appointment-request" })
	public String Appointment_request() {
		return "Client_Dashboard/appointment-request";
	}

	@GetMapping({ "/my_appointments" })
	public String client_Appointments() {
		return "Client_Dashboard/my_appointments";
	}

	@GetMapping({ "/client_cases" })
	public String client_cases() {
		return "Client_Dashboard/client_my cases";
	}

	@GetMapping({ "/hire_form" })
	public String hire_form() {
		return "Client_Dashboard/hire_form";
	}
	
	@GetMapping("/lawyers_list")
	public String viewAllLawyers(Model model) {
	    model.addAttribute("lawyers", repo.findByRole("ROLE_LAWYER"));
	    return "Admin/lawyers";
	}

	@GetMapping("/clients_list")
	public String viewAllClients(Model model) {
	    model.addAttribute("clients", repo.findByRole("ROLE_CLIENT"));
	    return "Admin/clients";
	}
	
	@GetMapping("/delete")
	public String deleteUser(@RequestParam Long id) {
		caseservice.deleteUser(id);
		return "redirect:/admin";
	}
	
	@GetMapping("/edit_form")
	public String getUser(@RequestParam Long id, Model model) {
		LegalcaseDTO caseDTO = caseservice.getUser(id);
		LoyerModel users = repo.findById(id).get();
		model.addAttribute("caseDTO",caseDTO);
		model.addAttribute("user",users);	
		return "Admin/edit_users";
	}
	
	@PostMapping("/edit_user")
	public String updateuser(@ModelAttribute LegalcaseDTO caseDTO, @RequestParam Long id) {
		caseservice.updateuser(caseDTO, id);
		return "redirect:/admin";
		
	}

}
