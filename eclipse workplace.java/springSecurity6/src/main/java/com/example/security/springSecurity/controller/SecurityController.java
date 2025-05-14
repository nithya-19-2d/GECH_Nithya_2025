package com.example.security.springSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.security.springSecurity.DTO.StudentDTO;
import com.example.security.springSecurity.userdetailes.StudentService;


//we have anotation for Rest API is @RestController 
@Controller
public class SecurityController {
	private StudentService studentService;
	
	
	 public SecurityController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	 @GetMapping({"/"," "})
	 public String home() {
		 return "home";
	 }
	 
	 
	 @GetMapping("/about")
	 public String about() {
		 return "about";
	 }
	 
	 @GetMapping("/contact")
	 public String contact() {
		 return "contact";
	 }
	 
	 @GetMapping("/register")
		public String register(Model model) {
			StudentDTO studentDTO = new StudentDTO();
			model.addAttribute("studentDTO",studentDTO);
			return "register";
		}
		
		@PostMapping("/register")
		public String register(@ModelAttribute StudentDTO studentDTO , RedirectAttributes redirectAttributes) {
			studentService.storeStudent(studentDTO);
			redirectAttributes.addFlashAttribute("success","student saved succefully");
			return "redirect:/";
			
		}
		
		@GetMapping("/std-details")
		public String std() {
			return "std-detailes";
		}
		

		@GetMapping("/login")
		public String login() {
			return "login";
		}

	 @GetMapping("/user")
	 public String User() {
		 return "user";
	 }
	 
	 @GetMapping("/admin")
	 public String Admin() {
		 return "admin";
	 }
	 
	 
	 
	 

}
