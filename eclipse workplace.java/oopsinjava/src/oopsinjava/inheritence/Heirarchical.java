package oopsinjava.inheritence;

class ParentClass1 {
	public void parentclassmethod() {
		System.out.println("this is a heirarchical parent method");
	}
}

class childClass extends ParentClass1 {
	public void childclassmethod() {
		System.out.println("this is a heirarchical child1 method");
	}
}

class ChildparentClass extends ParentClass1 {
	public void childclassmethod1() {
		System.out.println("this is a heirarchical child2 method");
	}
}



public class Heirarchical {
	public static void main(String[] args) {
		
		childClass child1=new childClass();
		child1.parentclassmethod();
		child1.childclassmethod();
		
		
		ChildparentClass child3=new ChildparentClass() ;
		child3.parentclassmethod();
		child3.childclassmethod1();
		
		
	}
	

}
