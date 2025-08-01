package com.example.EmployeeRelation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.EmployeeRelation.model.Task;
import com.example.EmployeeRelation.repository.Employeerepository;
import com.example.EmployeeRelation.repository.Taskrepository;

@Service
public class Taskservice {
	

	    private final Taskrepository taskrepo;
	    private final Employeerepository empRepo;

	   

	    public Taskservice(Taskrepository taskrepo, Employeerepository empRepo) {
			super();
			this.taskrepo = taskrepo;
			this.empRepo = empRepo;
		}

		public List<Task> getAllTasks() {
	        return taskrepo.findAll();
	    }

	    public void saveTask(Task task) {
	    	taskrepo.save(task);
	    }

	    public Task getTaskById(Long id) {
	        return taskrepo.findById(id).orElseThrow();
	    }

	    public void deleteTask(Long id) {
	    	taskrepo.deleteById(id);
	    }

	    public List<Task> getTasksByEmployeeId(Long empId) {
	        return taskrepo.findByAssignedToId(empId);
	    }
	}



