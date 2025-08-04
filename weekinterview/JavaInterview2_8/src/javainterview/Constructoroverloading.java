package javainterview;

class Addition{
	
	public void add(int a , int b) {
		System.out.println("The addition of two numbers is :" +(a+b));
	}
	
	public void add(int a , int b, int c) {
		System.out.println("The addition of two numbers is :" +(a+b+c));
	}
	
	
}

public class Constructoroverloading {
	
	public static void main(String[] args) {
		
		Addition a1 = new Addition();
		a1.add(2, 6);
		a1.add(1,40, 5);
		
	}
	

}
