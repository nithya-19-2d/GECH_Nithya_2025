package Polymorphisminjava;

class Circle2{
	
	int radius;
	int length;
	int breadth;
	int height;

	
	
	public Circle2(int radius, int length, int breadth, int height) {
		super();
		this.radius = radius;
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}



	public void Area() {
		System.out.println("The area of circle is");
		
	}
	
}

class Area extends Circle2{
	

	public Area(int radius, int length, int breadth, int height) {
		super(radius, length, breadth, height);
		// TODO Auto-generated constructor stub
	}

	//double area =  (3.14*radius*radius);
	
	@Override
	public void Area() {
		double area =  (3.14*radius*radius);
		int rectanglearea = (length*breadth*height);
	
		
		//System.out.println("The area of circle is :" +3.14*radius*radius + " square units");
		System.out.println("The area of circle is :" +area + " square units");
		System.out.println("the area of rectangle is :" +rectanglearea + "cm");
		
		
	}
	
}

public class Circle {
	
	public static void main(String[] args) {
		
		Circle2 c1 = new Area(2,4,5,6);  //upCasting ,here Circle2 is the parent class and Area is the Child class , so child is upcasting with parent , so the Area  ,  *typecasting => for object ,upCasting and downCasting 
		//Area A1 = new Area(2);
		//Area c2 = new Area(2, 4, 5 , 6);
		c1.Area();
		
		
	}
	
	

}
