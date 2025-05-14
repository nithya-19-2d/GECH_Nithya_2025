package com.example.security.springSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//we have anotation for Rest API is @RestController 
@Controller
public class SecurityController {
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
	 
	 

}
