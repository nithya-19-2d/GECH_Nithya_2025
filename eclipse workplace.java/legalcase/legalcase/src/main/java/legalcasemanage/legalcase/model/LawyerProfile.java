package legalcasemanage.legalcase.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "lawyer_profile")
public class LawyerProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int experience;

    @ManyToMany
    @JoinTable(
        name = "lawyer_specializations",
        joinColumns = @JoinColumn(name = "lawyer_profile_id"),
        inverseJoinColumns = @JoinColumn(name = "specialization_id")
    )
    private List<Specialization> specializations = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "lawyer_id", referencedColumnName = "id")
    private LoyerModel lawyer;
    
 // Getters and setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public List<Specialization> getSpecializations() {
		return specializations;
	}

	public void setSpecializations(List<Specialization> specializations) {
		this.specializations = specializations;
	}

	public LoyerModel getLawyer() {
		return lawyer;
	}

	public void setLawyer(LoyerModel lawyer) {
		this.lawyer = lawyer;
	}
  
    
}

