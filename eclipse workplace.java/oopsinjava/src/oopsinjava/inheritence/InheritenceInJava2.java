package oopsinjava.inheritence;

//single level
class Parent{
	int pData = 100;
	public void parentmethod() {
		System.out.println("this is parent method");
	}
}
//private is restricted only parents ,so is not extends by child, thats why we use public

class Child extends Parent{
	int cData = 200;
	public void childmethod() {
		System.out.println("this is child method");
	}
}

public class InheritenceInJava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Inheritence
		 * =======
		 * extending the proprties of parent class to child class
		 * properties(state , action(behaviour)
		 * types:
		 * =======
		 * 1.single level
		 * 2.muiltilevel
		 * 3.heirarchical
		 * 4.hybrid
		 * 5.multiple ->not possible in java*/
		 Child child=new Child();
		 child.parentmethod();
		 System.out.println(child.pData);

	}

}
