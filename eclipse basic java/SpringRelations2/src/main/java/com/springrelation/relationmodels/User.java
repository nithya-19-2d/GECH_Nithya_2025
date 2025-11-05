package com.springrelation.relationmodels;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String proj_name;
	
	@OneToOne
	private Userdetailes userdetailes;
	
	@OneToMany(mappedBy = "user" , cascade = CascadeType.ALL)
	private List<Address> address;
	
	@ManyToMany
	private List<Role> role;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProj_name() {
		return proj_name;
	}

	public void setProj_name(String proj_name) {
		this.proj_name = proj_name;
	}

	public Userdetailes getUserdetailes() {
		return userdetailes;
	}

	public void setUserdetailes(Userdetailes userdetailes) {
		this.userdetailes = userdetailes;
	}

	

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public List<Role> getRole() {
		return role;
	}

	public void setRole(List<Role> role) {
		this.role = role;
	}
	
	
	
	

}
