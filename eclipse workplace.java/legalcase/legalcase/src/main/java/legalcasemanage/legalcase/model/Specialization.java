package legalcasemanage.legalcase.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "specializations")
public class Specialization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Optional reverse mapping
    @ManyToMany(mappedBy = "specializations")
    private List<LawyerProfile> profiles = new ArrayList<>();

    // Getters and setters
    
    

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

	public List<LawyerProfile> getProfiles() {
		return profiles;
	}

	public void setProfiles(List<LawyerProfile> profiles) {
		this.profiles = profiles;
	}}

