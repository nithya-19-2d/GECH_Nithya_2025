package oopsinjava;

class Employeeobj{
public String name;
public int Age;
public String role;
public String Department;   //  instance variable belogs to object


public void todisplay() {
	System.out.println("The Employee Detailes is \n");
}

}

public class Employee {

	public static void main(String[] args) {
		Employeeobj emp1 = new Employeeobj();
		Employeeobj emp2 = new Employeeobj();
		emp1.name = "Nithya";
		emp1.Age = 23;
		emp1.role = "Software Engineering";
		emp1.Department = "IT";
		
		emp2.name = "Nithin";
		emp2.Age = 25;
		emp2.role = "Mechanical Engineering";
		emp2.Department = "CAD";
		
		emp1.todisplay();
		System.out.println("Name is :" + emp1.name );
		System.out.println("Age is :" + emp1.Age );
		System.out.println("Role is :" + emp1.role);
		System.out.println("Department is :" + emp1.Department);
		System.out.println("\n");
		System.out.println("Name is :" + emp2.name );
		System.out.println("Age is :" + emp2.Age );
		System.out.println("Role is :" + emp2.role);
		System.out.println("Department is :" + emp2.Department);
		
		
	}
	
	
	
	
	
	

}
