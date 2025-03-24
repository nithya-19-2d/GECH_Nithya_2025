package interfaceinjava21;

interface Interface1{
	public void method();
	public default void defaultmethod() {
		System.out.println("this is a default method");
	}
	public static void staticmethod() {
		System.out.println("this is a staticmethod");
	}
}

class child implements Interface1{

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("this is a abstract method");
		
	}
	
}
public class InterfaceinJav2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * default and static method inside interface
		 * abstract and defaultmethods() are accssed using class
		 * but staticmethod() is accessed by using interface_name*/
		
		child Child=new child();
		Child.method();
		Child.defaultmethod();
		Interface1.staticmethod();

		

	}

}
