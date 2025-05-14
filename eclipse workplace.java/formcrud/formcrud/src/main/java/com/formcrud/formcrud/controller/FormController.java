package com.formcrud.formcrud.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.formcrud.formcrud.formDTO.FormDTO;
import com.formcrud.formcrud.models.FormModels;
import com.formcrud.formcrud.repository.FormRepository;
import com.formcrud.formcrud.service.FormService;

import jakarta.validation.Valid;






@Controller
public class FormController {
	
private final FormService userservice;

private final FormRepository formrepository;
	
	//constructor injection

public FormController(FormService userservice, FormRepository formrepository) {
	super();
	this.userservice = userservice;
	this.formrepository = formrepository;
}

	
	@GetMapping({"","/"})
	public String getAllEmployees(Model model) {
		List<FormModels> users = userservice.getAllusers();
		model.addAttribute("users", users);
		return "user";
	}
	
	@GetMapping("/add-form")
	public String addEmployee(Model model){
		model.addAttribute("formdto", new FormDTO());
		return "addform";
		
	}
	@PostMapping("/add-form")
	
	public String saveemployee(@Valid @ModelAttribute("formdto") FormDTO formdto, BindingResult result, Model model) {	
		if(result.hasErrors()) {
			return "addform";
		}
		userservice.saveEmployee(formdto);
		return "redirect:/";
	}

	@GetMapping("/edit-form")
	public String getUser(@RequestParam Long id,Model model) {
		FormDTO formdto = userservice.getUser(id);
		FormModels user = formrepository.findById(id).get();
		model.addAttribute("formdto",formdto);
		model.addAttribute("user",user);	
		return "edit_form";
	}
	
	@PostMapping("/edit-employee")
	public String updateUser(@ModelAttribute FormDTO formdto, @RequestParam Long id) {
		userservice.updateUsers(formdto, id);
		return "redirect:/";

}
	@GetMapping("/delete_form")
	public String deleteUser(@RequestParam Long id) {
		userservice.deleteUser(id);
		return "redirect:/";
	}
}

	


