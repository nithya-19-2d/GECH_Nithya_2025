package legalcasemanage.legalcase.model;


import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "Users")
public class LoyerModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String full_name;
	private String email;
	private String password;
	//private String Confirm_password;
	private String role;
	private LocalDateTime createdAt;
	
	@PrePersist
	 public void prePersist() {
        this.createdAt = LocalDateTime.now();
    }
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
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
//	public String getConfirm_password() {
//		return Confirm_password;
//	}
//	public void setConfirm_password(String confirm_password) {
//		Confirm_password = confirm_password;
//	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "LoyerModel [id=" + id + ", full_name=" + full_name + ", email=" + email + ", password=" + password
				+ ", role=" + role + "]";
	}

	
	

}
