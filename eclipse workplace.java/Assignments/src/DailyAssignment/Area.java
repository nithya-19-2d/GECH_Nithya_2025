package DailyAssignment;

class Shape{
	public void calculateArea() {
		System.out.println("claculate the areas");
	}
}

class Circle extends Shape{
	public int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	public void calculateArea() {
		System.out.println("the area of circle is:"+3.141*(this.radius*this.radius));
		
		
	}
}

class rectangle{
	public int length;
	public int bradth;
	public rectangle(int length, int bradth) {
		super();
		this.length = length;
		this.bradth = bradth;
	}
	public void calculateArea() {
		System.out.println("the area of rectangle is:"+this.length*this.bradth);
	}
	
}

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(2);
		circle.calculateArea();
		rectangle rect = new rectangle(2,3);
		rect.calculateArea();
		

	}

}
