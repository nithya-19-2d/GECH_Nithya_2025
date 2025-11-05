package collection_in_java;

import java.util.Arrays;


class Student{
	String name;
	int roll;
	float marks;
	public Student(String name, int roll, float marks) {
		super();
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", marks=" + marks + "]";
	}
	
	
	
	
}

public class Collectionjava1 {
	
	/*
	 * Why we need collection:
	 * ======================
	 * to over come the drawback of array we have to go for collection
	 * 
	 * drawback of array
	 * =================
	 * 1.fixed size
	 * 2.same data type elements
	 * 3.we cannot reduce the size of an array
	 * 
	 * Advantages of array
	 * ====================
	 * 1.random access
	 * 2.type safety-the elements inside the array is based on the data type
	 * 3.type casting- to print elements in array no need to type cast.
	 * 
	 * Also we can store more than one data type using Object array
	 * Object[] arr = nes Object[5]
	 * 
	 * two utility classes are there
	 * ===========================
	 * Collections =>
	 * Arrays => toString*/
	
	public static void main(String[] args) {
		int[] arr = new int[2];
		arr[0] = 20;
		arr[1] = 30;
		
		System.out.println(Arrays.toString(arr)); //gurantte(guarantee of tye safty) of the delcared data type , in that data type only the values will stored
		int value = arr[0]; //no need to type cast
		System.out.println("values:" +value);
		
		Object[] obj = new Object[5]; //there is no type safety
		obj[0] = "Pavan";
		obj[1] = 20;
		obj[2] = 12.45;
		obj[3] = true;
		Student st = new Student("nithya", 21 ,30);
		obj[4] = st;
		
		Student std = (Student) obj[4];
		String name = (String) obj[0]; //we need type casting
		System.out.println(Arrays.toString(obj));
		
//		Student[] s1 = new Student[1];
//		s1[0] = new Student();
//		s1[0].name = "nithya";
//		s1[0].roll = 21;
//		s1[0].marks = (float) 78.21;
		
//		for(int i=0; i<1; i++) {
//			System.out.println("the student is:" +s1[i].name);
//			System.out.println("the student is:" +s1[i].roll);
//			System.out.println("the student is:" +s1[i].marks);
//		}
		
	}
	
	
	

}
