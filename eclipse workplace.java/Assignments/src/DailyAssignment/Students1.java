package DailyAssignment;

class Student1{
	private String Name;
	private int Rollnumber;
	private double marks;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRollnumber() {
		return Rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		Rollnumber = rollnumber;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	public void display() {
		if(marks >= 40) {
			System.out.println("Name:"+getName());
			System.out.println("Rollnumber:"+getRollnumber());
			System.out.println("marks:"+getMarks());
			System.out.println("student has passed");
		}
		else {
			System.out.println("student has failed");
		}
	}
	
	
}

public class Students1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 std = new Student1();
		std.setName("Nithya");
		std.setRollnumber(26);
		std.setMarks(40);
		std.display();
		
		

	}

}
