package oopsinjava.inheritence;

class Student1{
	//states
	public int age;
	public String Name;
	public double marks;
	
	
	//full argument constructor(means both instance variable and arguments are same(equal)
	public Student1(int age, String name, double marks) {
		super();
		this.age = age;
		this.Name = name;
		this.marks = marks;
	}
	//no args constructor
	public Student1() {
		System.out.println("no arguments constructor");
	}

	//action
	public void isPlaying() {
		System.out.println(this.Name+" is playing");
	}
	public void display() {
		System.out.println("name:" +this.Name);
		System.out.println("age:" +this.age);
		System.out.println("marks:" +this.marks);
	}
}

public class Constructorinjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 std1=new Student1(23,"nithya", 235.45);
		std1.display();
//		Student1 std1=new Student1();
//		std1.display(); is display no arguments constructor, because we have not assign the values

	}

}
