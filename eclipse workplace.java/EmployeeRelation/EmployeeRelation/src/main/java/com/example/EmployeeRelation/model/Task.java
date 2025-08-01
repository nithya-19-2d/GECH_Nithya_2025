package com.example.EmployeeRelation.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Task {
	

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String title;

	    private String description;

	    private LocalDate deadline;

	    private String status;

	    @ManyToOne
	    @JoinColumn(name = "employee_id")
	    private Employee assignedTo;
	    
	 // Getters and Setters

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public LocalDate getDeadline() {
			return deadline;
		}

		public void setDeadline(LocalDate deadline) {
			this.deadline = deadline;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Employee getAssignedTo() {
			return assignedTo;
		}

		public void setAssignedTo(Employee assignedTo) {
			this.assignedTo = assignedTo;
		}

	    
	    
	    
	}



