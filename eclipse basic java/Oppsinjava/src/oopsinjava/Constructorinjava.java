package oopsinjava;

class Studentrole{
	public String name;
	public int roll;
	
	public Studentrole(String name, int roll) {
		this.name = name;
		this.roll = roll;
	}
	
	
}

public class Constructorinjava {
	
	/*
	 * In java ,Constructor is Special method , it is used to initialize the value to the instance variable.
	 * 
	 * constructor name should be same as class name.
	 * constructor does not have actual return type.(its like method but not method , because does not have return type)
	 * 
	 * 
	 * Syntax:
	 * ========
	 * 
	 * access_modifier(ex:public) constructor_name(parameter){
	 *   //code
	 *   }
	 *   
	 * public Constructorinjava(int age){
	 * 
	 * this.age = "age";
	 *
	 * }
	 * 
	 * jvm will provide the default constructor , when we won't write any  constructor inside the class.
	 * (the created object new student(String name , int age) , it will call constructor indirectly
	 * 
	 * */
	
	public static void main(String[] args) {
		
		Studentrole std1 = new Studentrole("Nithya", 23);
		System.out.println("the name is :" +std1.name);
		System.out.println("The roll is :" +std1.roll);
		
	}

}
