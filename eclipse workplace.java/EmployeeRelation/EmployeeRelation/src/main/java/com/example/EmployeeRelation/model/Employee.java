package com.example.EmployeeRelation.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {
	
	
	    @Id 
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name;

	    @Column(unique = true)
	    private String email;

	    private String password;

	    @ManyToOne
	    @JoinColumn(name = "role_id")
	    private Role role;

	    @ManyToOne
	    @JoinColumn(name = "department_id")
	    private Department department;

	    @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "address_id")
	    private Address address;

	    //@ManyToOne
	    //@JoinColumn(name = "manager_id")
	    //private Employee manager;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Role getRole() {
			return role;
		}

		public void setRole(Role role) {
			this.role = role;
		}

		public Department getDepartment() {
			return department;
		}

		public void setDepartment(Department department) {
			this.department = department;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

//		public Employee getManager() {
//			return manager;
//		}
//
//		public void setManager(Employee manager) {
//			this.manager = manager;
//		}
	    
	    
	    
	}

	


