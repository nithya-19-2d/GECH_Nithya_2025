package com.example.EmployeeRelation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.EmployeeRelation.model.Department;
import com.example.EmployeeRelation.repository.Departmentrepository;
import com.example.EmployeeRelation.service.Departmentservice;

@Controller
@RequestMapping("/department")
public class Departmentcontroller {

	

	    @Autowired private Departmentrepository deptRepo;
	    @Autowired private Departmentservice deptser;

	    @GetMapping("/new")
	    public String showDeptForm(Model model) {
	        model.addAttribute("department", new Department());
	        return "department_form";
	    }

	    @PostMapping("/save")
	    public String saveDept(@ModelAttribute Department department) {
	        deptRepo.save(department);
	        return "redirect:/department/new";
	    }
	    
	    @GetMapping("/dept_list")
	    public String deptlist(Model model) {
	    	List<Department> dept = deptser.getAllDept();
	    	model.addAttribute("dept", dept);
	    	return "dept_list";
	    }
	}

	
	

