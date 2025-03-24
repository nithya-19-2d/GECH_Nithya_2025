package oopsinjava.inheritence;

//multilevel

class Grandparent{
	public void grandparent() {
		System.out.println("this is a grandparent");
	}
}

class ParentClass extends Grandparent {
	public void parentMenthod() {
		System.out.println("this is a parentmethod");
	}
	
}//two methods

class ChildClass extends ParentClass{
	public void childmethod() {
		System.out.println("this is child method");
	}
} // three methods

public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass child=new ChildClass();
		child.grandparent();
		child.parentMenthod();
		

	}

}
