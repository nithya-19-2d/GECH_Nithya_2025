package Inheritence;

class Person{
	String name;
	int roll;
	
	public Person(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	
	public void start() {
		System.out.println("Person name is:" +name);
		
	}
	
	
}

class Studentname extends Person{
	
	String branch;

	public Studentname(String name, int roll , String branch) {
		super(name, roll);
		this.branch = branch;
	}
	
	@Override
	public void start() {
		System.out.println("Person name is:" +name +"and Roll is" +roll + "Branch is" +branch);
		
	}

	
}

public class StudentPerson {
	
	public static void main(String [] args) {
	
	Studentname std1 = new Studentname("Nithya", 23, "cse");
	std1.start();

}
}
