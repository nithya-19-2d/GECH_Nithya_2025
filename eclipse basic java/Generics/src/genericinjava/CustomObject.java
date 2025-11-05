package genericinjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1 implements Comparable<Student1>{
	private String name;
	private int age;
	private String email;
	private int phone;
	
	public Student1(String name, int age, String email, int phone) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	//tostring

	@Override
	public String toString() {
		return "Student1 [name=" + name + ", age=" + age + ", email=" + email + ", phone=" + phone + "]";
	}

	@Override
	public int compareTo(Student1 o) {
		// TODO Auto-generated method stub
		return this.getAge() - o.getAge();
	}
		
}

//we can also use the comparator interface to sort , with one compare method

	class Sortstudent implements Comparator<Student1>{


		@Override
		public int compare(Student1 o1, Student1 o2) {
			
			return o2.getAge() - o1.getAge();  //(o2-o1) => decending and (o1-o2)= ascending order
		}
		
		
	}

public class CustomObject {

	public static void main(String[] args) {
		
		Student1 s2 = new Student1("Nithya" , 28 , "nithya@gmail.com", 565789989);
		
		System.out.println(s2.getName() + " age is " +s2.getAge() + " email " +s2.getEmail() + " " +s2.getPhone());
		Student1 s3 = new Student1("Nith" , 25 , "nithya12@gmail.com", 589090989);
		System.out.println(s3);
		Student1 s4 = new Student1("swathi" , 21 , "swathu@gmail.com", 467576987);
		System.out.println(s4);
		Student1 s5 = new Student1("shwetga" , 31 , "shwetha@gmail.com", 456776879);
		System.out.println(s5);
		
		List<Student1> Students = new ArrayList<>();
		Students.add(s2);
		Students.add(s3);
		Students.add(s4);
		Students.add(s5);
		System.out.println(Students);
		//Collections.sort(Students); its show cast argument to the Students , because we use different data type for variable , so it did not understand from where to sort , thats why we use custom comparator
		
		//before java 8 features , this methos is used
		System.out.println("Using Comparator interface");
		Collections.sort(Students, new Sortstudent());
		System.out.println(Students +"\n");
		
		//using comparable
		System.out.println("Using Comparable");
		Collections.sort(Students);
		System.out.println(Students + "\n");
		
		//after java 8 features , this method is used , using comparator
		System.out.println("Using comparator");
		Collections.sort(Students, (a1 , a2 ) -> a2.getAge()-a1.getAge());
		System.out.println(Students);	
		
	}

}
