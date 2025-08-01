package Thinker41.Thinker41.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Rule {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	 private String ifChoice;
	    private String thenRequired;
	    private String incompatibleWith;
		public String getIfChoice() {
			return ifChoice;
		}
		public void setIfChoice(String ifChoice) {
			this.ifChoice = ifChoice;
		}
		public String getThenRequired() {
			return thenRequired;
		}
		public void setThenRequired(String thenRequired) {
			this.thenRequired = thenRequired;
		}
		public String getIncompatibleWith() {
			return incompatibleWith;
		}
		public void setIncompatibleWith(String incompatibleWith) {
			this.incompatibleWith = incompatibleWith;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
	    
	    

}
