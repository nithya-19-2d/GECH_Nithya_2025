package Thinker41.Thinker41.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Product {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	 
	    private int basePrice;
	    private List<Category> categories;
	    private List<Rule> rules;
		
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public int getBasePrice() {
			return basePrice;
		}
		public void setBasePrice(int basePrice) {
			this.basePrice = basePrice;
		}
		public List<Category> getCategories() {
			return categories;
		}
		public void setCategories(List<Category> categories) {
			this.categories = categories;
		}
		public List<Rule> getRules() {
			return rules;
		}
		public void setRules(List<Rule> rules) {
			this.rules = rules;
		}
	    
	    


}
