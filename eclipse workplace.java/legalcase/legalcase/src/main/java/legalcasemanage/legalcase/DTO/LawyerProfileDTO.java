package legalcasemanage.legalcase.DTO;

import java.util.List;

public class LawyerProfileDTO {

    private Long id;

    private int experience;

    private List<Long> specializationIds; // IDs of selected specializations

    private Long lawyerId;
    
 // No lawyer object here, we will fetch and bind from Principal

    // Getters and Setters

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

	public List<Long> getSpecializationIds() {
		return specializationIds;
	}

	public void setSpecializationIds(List<Long> specializationIds) {
		this.specializationIds = specializationIds;
	}

	public Long getLawyerId() {
		return lawyerId;
	}

	public void setLawyerId(Long lawyerId) {
		this.lawyerId = lawyerId;
	}

	//no args
	public LawyerProfileDTO() {
		super();
	}
	
	
	
    

    
    
    
}

