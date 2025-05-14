package com.example.security.springSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//we have anotation for Rest API is @RestController 
@RestController
public class SecurityController {
	 @GetMapping({"/"," "})
	 public String home() {
		 return "hello world";
	 }

}
