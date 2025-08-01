package encapsulationinjava;

class Student{
	private String name;
	private int roll;
	
	//getters and setters
	
	//return type of name is String
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getroll() {
		return roll;
	}
	
	public void setRoll(int roll) {
		this.roll = roll;
	}
}

public class Encapsulation1 {
	
	
	/*
	 * Encapsulation
	 * =============
	 * Encapsulation is a mechanisms that binding data and method into a single unit 
	 * i.e, making fields(state) as private and method as public using getter and setter.
	 * */
	
public static void main(String[] args) {
	
	Student std1 = new Student();
	std1.setName("nithya");
	std1.setRoll(12);
	System.out.println("the name is :" +std1.getName() + " and the roll is :" +std1.getroll());
		
	}
	

}
