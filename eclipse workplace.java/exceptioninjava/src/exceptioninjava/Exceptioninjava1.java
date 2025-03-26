package exceptioninjava;

public class Exceptioninjava1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * unchecked exception
		 * */
		
		
		
		int a =10;
		int b = 0;
		 // this shows Airthmeticexception
		try {
			System.out.println("result:"+(a/b));
			
		}catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		System.out.println("hello world");

	}

}
