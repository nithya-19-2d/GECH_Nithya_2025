package encapsulation;
class Student{
	
	private String name;
	private int age;
	private double marks;
	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public double getMarks() {
//		return marks;
//	}
//	public void setMarks(double marks) {
//		this.marks = marks;
//	}
	
	
	
	public Student(String name, int age, double marks) {
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	
	
}

public class Encapsulationinjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Encapsulation: Encapsualtion is a mehcanism that binds the data(variable) and methods that manipulate the data into a single unit(class)

          --Every feilds must be private when we wnat to protect data ,so we use encapsulation and create getters and setters to make it public so that we can set and get the data ourselves when we create object

           --Even if we dont create constructor ,java will create a no args constructor automatically by default when we create a object/instance for that respective class.
           */
		
//		Student std1=new Student();
//		std1.setName("nithya");
//		System.out.println(std1.getName());
		
		Student std2 = new Student("nithya", 23, 243.44);
		System.out.println(std2);

	}

}
