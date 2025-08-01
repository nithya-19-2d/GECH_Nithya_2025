
package Polymorphisminjava;

class Addition{
	
	public void add(int a, int b) {
		 System.out.println("the addition of two parameter is : " +(a+b));
	}
	
	public void add(int a, int b , int c) {
		System.out.println("the addition of three parameter is : " +(a+b+c));
	}
}

public class Polymorphism1 {
	
	/*
	 * Polymorphism
	 * ==========
	 * poly-many
	 * morphism -forms
	 * its a mechanism that  method will perform a different action based on the situation.
	 * 1.method-overloading(one class)./complie time
	 * 2.method overriding(
	 * */

	public static void main(String[] args) {
		Addition add1 = new Addition();
		add1.add(1, 3);
		add1.add(2, 3, 4);
	}
}
