package com.generate;

//created one generic class with generic type 'T',we can give different type, also . and it is used to help avoiding the type casting and providing type safety
class Student<T>{
	T student_id;

	public Student(T student_id) {
		super();
		this.student_id = student_id;
	}
	
	public T returnvalue() {
		return student_id;
	}
}

public class GenericClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//use void for print the value(syso)
		//use int for return the value(return)
		//we can't pass a different data type of value to the constructor argument, when we not created any our generic class
		
		//to display integer value
		Student<Integer> std1 = new Student<>(12);
		System.out.println(std1.returnvalue());
		
		//to display String value, add object data type
		Student<String> std2 = new Student<>("hello");
		System.out.println(std2.returnvalue());
		
		

	}

}
