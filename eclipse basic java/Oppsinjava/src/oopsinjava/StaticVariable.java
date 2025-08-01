package oopsinjava;

class student {
	public static String name;  // static variable , we can access this , using class onle , no need to create object
}



public class StaticVariable {
	
	public static void main(String[] args) {
		
		student.name = "Nithya";
		System.out.println("the name is :" +student.name);
		
	}

}
