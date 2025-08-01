package Thinker41.Thinker41.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Choice {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	 public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	private String name;
	    private int priceDelta;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getPriceDelta() {
			return priceDelta;
		}
		public void setPriceDelta(int priceDelta) {
			this.priceDelta = priceDelta;
		}
	    
	    

}
