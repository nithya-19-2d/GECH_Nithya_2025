package oopsinjava;

public class ClassandObject {
	
	private String name;
	private int age;
	
	public void iswriting() {
		System.out.println("the student is writing");
	}
	/*
	 * class
	 * ======
	 * represent the state(property) and action(behavior) of the object / blueprint of object
	 * class => class is a reserved keyword
	 * and it will not take the memory in the sysytem
	 * 
	 * property --> variable
	 * ===========
	 * usn, name, email
	 * 
	 * public int age = 30;
	 * 
	 * action  --> method
	 * =========
	 *   isplaying();
	 *   isworking();
	 *   
	 *   public void isPlaying()
	 *   {
	 *   syso("the student is playing");
	 *   }
	 *   
	 *object:
	 *======
	 *implementation of class
	 *object will take the memory
	 *
	 *syntax of object
	 *=============
	 *
	 *class_name obj_name = new class_name();
	 *ex:
	 *Student std1 = new Student();
	 *class_name is the data type of object, here the Student is the data type of std1
	 *new,  is the keyword , used for object creation.
	 *
	 * 
	 * we can't give the public  to the class(the student (class_name) , because the public should present  in the own file(oopsinjava.java file)
	 *
	 *
	 *the variables and method created in the class, are stored in the stack, because of that , the class does not take the memory
	 *
	 *the object was created for an class using new keyword, that will be going to stored in the heap memory, so that object will take the memory
	 *
	 * 
	 * */
	
	public static void main(String[] args) {
		ClassandObject std1 = new ClassandObject();
		
		//setting the vlaue to the variables
		std1.name = "nithya";
		std1.age = 21;
		
		//getting the value of variables
		System.out.println("Name is :" + std1.name);
		System.out.println("Age is :" +std1.age);
		std1.iswriting();		
		
	}
	

}
