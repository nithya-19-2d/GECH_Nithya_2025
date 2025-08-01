package com.example.EmployeeRelation.DTO;

public class Employeedto {
	

	    private Long id;

	    private String name;

	    private String email;

	    private String password; // optional – include only for registration or password change

	    private Long roleId;

	    private Long departmentId;

	    private Addressdto address;

	    private Long managerId;
	    
	    
	    

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

		public Long getRoleId() {
			return roleId;
		}

		public void setRoleId(Long roleId) {
			this.roleId = roleId;
		}

		public Long getDepartmentId() {
			return departmentId;
		}

		public void setDepartmentId(Long departmentId) {
			this.departmentId = departmentId;
		}

		public Addressdto getAddress() {
			return address;
		}

		public void setAddress(Addressdto address) {
			this.address = address;
		}

		public Long getManagerId() {
			return managerId;
		}

		public void setManagerId(Long managerId) {
			this.managerId = managerId;
		}

	    // Getters and Setters
	    
	    
	}



