package interfaceinjava21;

interface A{
	public void method();
}
interface B{
	public void method();
		
	
}
//interface c{
//	public void methodc();
//}
//
//interface d{
//	public void methodc();
//}
class method implements A,B{

//	@Override
//	public void methodB() {
//		// TODO Auto-generated method stub
//		System.out.println("this is methodA");
//		
//	}
//
//	@Override
//	public void methodA() {
//		// TODO Auto-generated method stub
//		System.out.println("this is methodB");
//		
//	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("This method from both A abd b interface");
		
	}

//	@Override
//	public void methodc() {
//		// TODO Auto-generated method stub
//		System.out.println("this is methodc");
//		
//	}
	
}


public class Inhertenceinjava1 {

	/* * -> extending the properties of parent class to child class 
		 * ->  properties(state and action)
		 *
		 * TYPES IN INHERITANCE: 
		 * 1. single level => parent to child class (only 2
		 * classes - inheritance is singgle level) 
		 * 
		 * 2. multilevel => one child class
		 * extends to 2 parent classes one after another that is p1>p2 then c extends to  p1(c>p1) (inheritance in multilevel) 
		 * 
		 * 3. hierarchial => two childs extends to a single parent 
		 * 
		 * 4. hybrid => one child extends form both interface and a
		 * parent class using implements and extends 
		 * 
		 * 5.Multiple => not possible in java
		 * doesnt support inheritance for multiple parents to one child so we use interface as we learnt previously

	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method Method=new method();
//		Method.methodA();
//		Method.methodB();
		Method.method();
		
		

	}

}
