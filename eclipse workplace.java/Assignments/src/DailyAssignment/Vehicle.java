package DailyAssignment;

class vehiclename{
	public String Brand;
	public int Speed;
	public vehiclename(String brand, int speed) {
		super();
		Brand = brand;
		Speed = speed;
	}
	
	public void display() {
		System.out.println("the car name is:"+this.Brand);
		System.out.println("the speed is:"+this.Speed);
	}	
}

class car extends vehiclename{
	public int Nodoors;

	public car(String brand, int speed, int nodoors) {
		super(brand, speed);
		this.Nodoors = nodoors;
	}
	public void display() {
		super.display();
		System.out.println("the number of doors is:"+Nodoors);
		System.out.println("the brand is:"+super.Brand);
	}
	
}

public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car name = new car("glanza",60, 4);
		name.display();

	}

}
