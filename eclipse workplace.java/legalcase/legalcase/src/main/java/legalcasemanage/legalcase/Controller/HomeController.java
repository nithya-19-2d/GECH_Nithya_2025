package legalcasemanage.legalcase.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping({"/"," "})
	 public String home() {
		 return "index";
	 }
	@GetMapping({"/"," "})
	 public String about() {
		 return "about";
	 }
	
	@GetMapping({"/contact"})
	 public String contact() {
		 return "contact";
	 }
	
	@GetMapping({"/"," "})
	 public String admin() {
		 return "Admin";
	 }
	@GetMapping({"/"," "})
	 public String Login() {
		 return "Login";
	 }
	@GetMapping({"/"," "})
	 public String addlawyer() {
		 return "add_lawyer";
	 }
	@GetMapping({"/"," "})
	 public String addclient() {
		 return "add_client";
	 }
	

}
