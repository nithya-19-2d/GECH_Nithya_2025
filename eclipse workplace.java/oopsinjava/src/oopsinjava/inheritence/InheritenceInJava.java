package oopsinjava.inheritence;


class Student{
	//states
	public int age =23;
	public String Name = "nithya";
	public double marks = 230.45;
	
	//action
	public void isPlaying() {
		System.out.println(this.Name+" is playing");
	}
}
public class InheritenceInJava {
 public static void main(String[] args) {
	 /* 
	  * class
	  * =====
	  * class willrepresents the state and behaviour of an objects
	  * state-->property
	  * beha-->action
	  * 
	  * Objects:
	  * ===
	  * =objects is a implementation of class(state and action)
	  * example
	  * =====
	  * Student
	  * 
	  * property
	  * ========
	  * USN
	  * Name
	  * branch
	  * age
	  * 
	  * 
	  * action
	  * ======
	  * isplaying()
	  * issleeping
	  * 
	  * how to declare class and objects
	  * =================
	  * class class_name{
	  * state
	  * action
	  * }
	  * 
	  * ex:
	  * ===
	  * class Student{
	  * property:
	  * public int age = 30;
	  * 
	  * 
	  * action
	  * 
	  * public void isplaying(){
	  * syso("the student is playing");
	  * }
	  * 
	  * Student str1=new Student(); --->the type of str1 is (class name) Student
	  * 
	  * */
	 Student std1=new Student();
	 System.out.println(std1.age);
	 System.out.println(std1.Name);
	 System.out.println(std1.marks);
	  std1.isPlaying();
	  
	  
	  Student std2=new Student();
		 System.out.println(std2.age);
		 System.out.println(std2.Name);
		 System.out.println(std2.marks);
		  std1.isPlaying();
		  
		  
	  
}
}
