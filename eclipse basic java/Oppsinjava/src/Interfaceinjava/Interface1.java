package Interfaceinjava;

/*
 * using interface we can achieve 100% abtraction
 * to inherite one class from another one we use => extends (is a keyword)
 *  interface to class => implements
 * interface to interface => extends
 * 
 * we can create static and default method inside the interface , and we can access the static method using interface name and
 * for to access the default method we have to create an object by extending the interface using another class .
 * if we dont know the complete implementaion of a method , then we go for interface
 * */

interface Vehicle{
	
	void start();  //if we declare the method as default method, then it considered as anstract method or we can declare using public without giving implementaion . abstract methos(dy default abstract and public)
	
	//private comes from java 9
	// default and static comes from java 8
	public default void vehiclename() {
		System.out.println("the vehicle is has a crazy");
	}
	
	public static void caris() {
		System.out.println("the car is moving");
	}
}

class Car implements Vehicle{

	@Override
	public void start() {
		
		System.out.println(" the car is starting ");
		
	}
	
}

public class Interface1 {
	
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.start();
		Vehicle.caris();
		c1.vehiclename();
		
	}
	
	

}
