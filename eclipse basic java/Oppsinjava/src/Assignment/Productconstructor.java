package Assignment;

class Product{
	String name;
	double price;
	int quantity;
	
	public Product(String name) {
		super();
		this.name = name;
		System.out.println("The product is:" +name);
	}

	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
		System.out.println("The product is:" +name + " and price" +price);
	}

	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		System.out.println("The name is " +name + " price " +price +" and quality " +quantity + "g");
	}
	
	
}

public class Productconstructor {
public static void main(String[] args) {
	Product p1 = new Product("Makhan");
	Product p2 = new Product("Makhan", 180);
	Product p3 = new Product("Makhan", 200 , 250);
	
}	

}
