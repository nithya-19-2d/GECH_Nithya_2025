package Inheritence;

class Parent{
	public int age = 40;
	
	public void parent() {
		System.out.println("the age is");
	}
}


// the main class also extending the property of parent , so now its act as child class
public class InheritenceofSingle extends Parent {
	
public static void main(String[] args) {
	/*
	 * Inheritance
	 * ============
	 * Extending the properties and method of an parent class to the child class
	 * properties(state and action)
	 * 
	 * Types of Inheritance
	 * ====================
	 * Single Level
	 * multilevel
	 * heirarchical
	 * 
	 * 
	 * multiple
	 * hybrid
	 * 
	 * In the inheritance , we can not inherit , constructor to the child class
	 * 
	 * */
	InheritenceofSingle single = new InheritenceofSingle();
	single.parent();
	System.out.println( single.age);
	
}

}
