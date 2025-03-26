package abstraction;
//1.interface
interface Animal{
	public void eat();
}

class lion implements Animal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("the lion will eat meat");
		
	}
	
}

//abstract class
abstract class Vehicle{
	//abstarct
	public abstract void start();
	
	//non abstract
	public void stop() {
		System.out.println("the vehicle is stopped");
	}
}

class car extends Vehicle{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("the car will start");
		
	}
	
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Abstraction:
		 * ========
		 * is a a process of hiding the implements and 
		 * showing only the essential resources
		 * 2.ways
		 * 
		 * * 1. Abstraction using Interface(gives 100% abstraction)
		 * 2. abstract class(0-100% , when we want to achieve abstraction in between range)
		 * 3.if you want to create a obj ,there will have to create a implementation to the method
*/
		
		lion lio =new lion();
		lio.eat();
		
		car mahindra = new car();
		mahindra.start();
		mahindra.stop();
		

	}

}
