package Inheritence;

class Vehicle{
	String model;
	String brand;
	
	
	
	public Vehicle(String model, String brand) {
		super();
		this.model = model;
		this.brand = brand;
	}



	public void start() {
		System.out.println(brand + "is starting");
	}
	
}

class Car extends Vehicle{
	
	public Car(String model, String brand, int noWheels) {
		super(model, brand);
		this.noWheels = noWheels;
	}

	int noWheels;
	
	@Override
	public void start() {
		System.out.println(brand +", " + model + " " + " is starting and the car has wheels such as :" +noWheels);
	}
	
	
	
}

public class Inheritence1 {
	public static void main(String[] args) {
		Car c1 = new Car("mahindra-Tech" , "Mahindra" , 4);
		c1.start();
		
	}

}
