package Assignment;

class Employee{
	public String name;
	public double salary;
	public String department;
	
	

	public Employee(String name, double salary, String department) {
		super();
		this.name = name;
		this.salary = salary;
		this.department = department;
	}



	public void displayDetailes() {
		System.out.println("The Detailes of an Employee ");
		System.out.println("The employee name is:" +name + ", he is working in " + department + " department as manager and he get " +salary +" salary per month " );
		//System.out.println("Employee Department :" +department );
		//System.out.println("Employee Salary :" +salary );
		
	}
}

class Manager extends Employee{

	public Manager(String name, double salary, String department , int teamSize) {
		super(name, salary, department);
		this.teamSize = teamSize;
	}
	
	public int teamSize;
	
	public void displayTeamSize() {
		System.out.println("and he  assign " +teamSize + " teams for develoging a application");
	}
	
}

public class EmployeeManage {
	
	public static void main(String[] args) {
		Manager m1 = new Manager("Nithin" ,50000, "Software Development" , 3);
		m1.displayDetailes();
		m1.displayTeamSize();
		
	}

}
