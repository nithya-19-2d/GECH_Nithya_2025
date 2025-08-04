package javainterview;

public class Swaping {
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		System.out.println(" The value of a and value of b before swapping :" +a + " and " +b);
		a = a+b;
		b= a-b;
		a= a-b;
		System.out.println("The value of a after swapping : " +a);
		System.out.println("The value of b after swapping :" +b);
		
	}

}
