package com.example.EmployeeRelation.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.EmployeeRelation.model.Employee;
import com.example.EmployeeRelation.model.Task;
import com.example.EmployeeRelation.service.Employrrservice;
import com.example.EmployeeRelation.service.Taskservice;

@Controller
public class Taskcontroller {
	

	    private final Taskservice taskService;
	    private final Employrrservice empService;

	    public Taskcontroller(Taskservice taskService, Employrrservice empService) {
	        this.taskService = taskService;
	        this.empService = empService;
	    }

	    //  Show form to add task
	    @GetMapping("/new")
	    public String showTaskForm(Model model) {
	        model.addAttribute("task", new Task());
	        model.addAttribute("employees", empService.getAllEmployee());
	        return "add-task";
	    }

	    //  Save task
	    @PostMapping("/save")
	    public String saveTask(@ModelAttribute Task task) {
	        taskService.saveTask(task);
	        return "redirect:/list";
	    }

	    // List all tasks
	    @GetMapping("/list")
	    public String listTasks(Model model) {
	        model.addAttribute("tasks", taskService.getAllTasks());
	        return "task-list";
	    }

	    //  Edit task
	    @GetMapping("/edit")
	    public String editTask(@RequestParam Long id, Model model) {
	        model.addAttribute("task", taskService.getTaskById(id));
	        model.addAttribute("employees", empService.getAllEmployee());
	        return "edit-task";
	    }

	    @PostMapping("/update")
	    public String updateTask(@ModelAttribute Task task) {
	        taskService.saveTask(task);
	        return "redirect:/list";
	    }

	    //  Delete task
	    @GetMapping("/delete")
	    public String deleteTask(@RequestParam Long id) {
	        taskService.deleteTask(id);
	        return "redirect:/list";
	    }

	    //  View tasks assigned to logged-in employee
	    @GetMapping("/my-tasks")
	    public String viewMyTasks(@RequestParam Long empId, Model model) {
	    	 Employee employee = empService.getEmployeeById(empId);
	        List<Task> myTasks = taskService.getTasksByEmployeeId(empId);
	        model.addAttribute("tasks", myTasks);
	        model.addAttribute("user", employee);
	        return "user-dashboard"; 
	    }
	}



