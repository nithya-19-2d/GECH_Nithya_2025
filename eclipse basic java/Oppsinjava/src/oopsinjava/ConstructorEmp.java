package oopsinjava;

class EmployCons{
	public String name;
	public int age;
	public String Department;
	
	//parameterized constructor
	public EmployCons(String name, int age, String department) {
		
		this.name = name;
		this.age = age;
		Department = department;
	}
	
	public void todisplay() {
		System.out.println("The Employee is working");
	}
	
	
	
}

public class ConstructorEmp {
	
	public static void main(String[] args) {
		
		EmployCons emp1 = new EmployCons("Nithin", 25 , "CAD");
		emp1.todisplay();
		System.out.println("The Name is :" +emp1.name);
		System.out.println("The Age is :" +emp1.age);
		System.out.println("The department is :" +emp1.Department);
	}

}
