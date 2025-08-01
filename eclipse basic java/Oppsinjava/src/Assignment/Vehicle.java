package Assignment;



interface Vehicle1{
	
	void start();  //if we declare the method as default method, then it considered as anstract method or we can declare using public without giving implementaion . abstract methos(dy default abstract and public)
	
	//private comes from java 9
	// default and static comes from java 8
	public default void vehiclename() {
		System.out.println("the vehicle is has a crazy");
	}
	
	public static void caris() {
		System.out.println("The car is moving");
	}
}

class Car implements Vehicle1{

	@Override
	public void start() {
		
		System.out.println(" the car is starting ");
		
	}
	
}

class Bike implements Vehicle1{

	@Override
	public void start() {
		System.out.println("The bike is starting");
		
	}
	
	
}


public class Vehicle {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.start();
		Bike b1 = new Bike();
		b1.start();
		
	}

}
