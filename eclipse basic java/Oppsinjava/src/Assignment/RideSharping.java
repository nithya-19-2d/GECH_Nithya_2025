package Assignment;

abstract class User{
	public String name;
	public long phone;
	
	
	
	public User(String name, long phone) {
		super();
		this.name = name;
		this.phone = phone;
	}



	abstract void showProfile();
	
}

class Driver extends User{
	
	public String vehicle;

	public Driver(String name, long phone , String vehicle) {
		super(name, phone);
		this.vehicle = vehicle;
		
	}

	@Override
	void showProfile() {
		System.out.println("The name of driver is :" +name + " and his number is " +phone);
	
	}
	
	public void vehicle() {
		System.out.println("the vehicle name is: " +vehicle);
	}

}

class Customer extends User {
	
	public String location;

	public Customer(String name, long phone, String location) {
		super(name, phone);
		this.location = location;
		
	}

	@Override
	void showProfile() {
		System.out.println("The name of customer is :" +name + " , phone number is " +phone);
	
	}
	
	public void location() {
		System.out.println("the pickup location is:" +location);
	}
	
}

interface Ride{
	
	void book();
}

class UberRide implements Ride{
	
	String from;
	String to;



	public UberRide(String from, String to) {
		super();
		this.from = from;
		this.to = to;
	}



	@Override
	public void book() {
		System.out.println("Riding from " +from + " to " +to);
		
	}
	
}


public class RideSharping {
	
	public static void main(String[] args) {
		
		 Driver D1 = new Driver("Nithin" , 896754254 , "Honda");
		 D1.showProfile();
		 D1.vehicle();
		 
		 Customer c1 = new Customer("nithya" , 65767989, "Chikkabanavara");
		 c1.showProfile();
		 c1.location();
		 
		 UberRide r1 = new UberRide("Chikkabanavara" , "Jalahalli");
		 r1.book();
		 
	}

}
