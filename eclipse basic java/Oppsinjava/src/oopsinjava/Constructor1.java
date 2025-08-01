package oopsinjava;

class Car{
	
	String car_name;
	String model;
	
	
	//no args constructor
	public Car() {
		super();
	}


	public Car(String car_name, String model) {
		super();
		this.car_name = car_name;
		this.model = model;
	}

//parameterized constructor
	
	
	
}

public class Constructor1 {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car sar1 = new Car("Mahindra" , "Mahindra Scorpio-N");
		System.out.println("The car name is " + sar1.car_name);
		System.out.println("The car model is " + sar1.model);
	}
	
}
