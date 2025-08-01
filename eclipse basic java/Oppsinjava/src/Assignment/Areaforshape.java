package Assignment;

class Shape{
	

	public void area() {
		System.out.println("The Area is");
		
	}	
	
}

class Circle extends Shape{
	
	int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	@Override
	public void area() {
		double area =  (3.14*radius*radius);


	
		
		//System.out.println("The area of circle is :" +3.14*radius*radius + " square units");
		System.out.println("The area of circle is :" +area + " square units");
		
		
		
	}
	
}

class Rectangle extends Shape{
	
	int length;
	int width;
	
	public Rectangle( int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	
	
	@Override
	public void area() {
		int rectanglearea = (length*width);
		System.out.println("the area of rectangle is :" +rectanglearea + "cm");
		
		
	}
	
	
	
}
public class Areaforshape {
	
	public static void main(String[] args) {
		
		Circle c1 = new Circle(2);
		c1.area();
		Rectangle r1 = new Rectangle(3,5);
		r1.area();
		
		
		
		
	}

}
