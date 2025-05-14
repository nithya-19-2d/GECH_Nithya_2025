package com.example.security.springSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {
	 @GetMapping({"/"," "})
	 public String home() {
		 return "home";
		 //return "hello world"; //this is for displayed in postman api
	 }

}
