package method_and_constructor_reference;

import java.util.function.Function;
import java.util.function.Supplier;

class Student{
	public Student() {
		System.out.println("This is the constructor reference");
	}
	
	public Student(String name) {
		System.out.println("the name is:" +name);
	}
}

public class ConstructorReferenceMethod {
	
	public static void main(String[] args) {
		
		//without
		Supplier<Student> sup = ()->new Student();
		sup.get();
		
		//with
		Supplier<Student> sup1 = Student::new;
		sup1.get();
		
		//using function
		
		Function<String, Student> student = Student::new;
		student.apply("hello");
		
		
		
	}

}
