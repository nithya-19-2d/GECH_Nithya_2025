package com.example.EmployeeRelation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.EmployeeRelation.model.Role;
import com.example.EmployeeRelation.repository.Rolerepository;
import com.example.EmployeeRelation.service.Roleservice;

@Controller
@RequestMapping("/role")
public class Rolecontroller {
	
	

	    @Autowired private Rolerepository roleRepo;
	    @Autowired private Roleservice roleser;

	    @GetMapping("/new")
	    public String showRoleForm(Model model) {
	        model.addAttribute("role", new Role());
	        return "role-form";
	    }

	    @PostMapping("/save")
	    public String saveRole(@ModelAttribute Role role) {
	        roleRepo.save(role);
	        return "redirect:/role/new"; // or redirect to list
	    }
	    
	    @GetMapping("/role-list")
	    public String rolelist(Model model) {
	    	List<Role> role = roleser.getAllNonAdminRoles();
	    	model.addAttribute("roles", role);
	    	return "role_list";
	    }
	    
	    
	    
	}



