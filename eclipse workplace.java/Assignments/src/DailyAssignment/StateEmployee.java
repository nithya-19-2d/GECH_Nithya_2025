package DailyAssignment;

abstract class Employee{
	public String Name = "nithya";
	public abstract void calculateSalary();
}

 class FullTimeEmployee extends Employee{

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		System.out.println("the employee name is :"+this.Name);
		
	}
	 
 }
 
 class PartTimeEmployee extends FullTimeEmployee {
	 
 }

public class StateEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PartTimeEmployee parttime=new PartTimeEmployee();
		parttime.calculateSalary();

	}

}
