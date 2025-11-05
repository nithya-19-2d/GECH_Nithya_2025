package com.springrelation.relationmodels;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "emp_dept")
public class Department {
	/*
	 * @JoinColumn is used to specify the foreign key column in the database that joins two tables 
	 * in a one-to-one or many-to-one relationship.
	 * ex: @Entity
   public class Employee {
    @ManyToOne
    @JoinColumn(name = "dept_id")   // FK column in Employee table
    private Department department;
}
*/
	
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
