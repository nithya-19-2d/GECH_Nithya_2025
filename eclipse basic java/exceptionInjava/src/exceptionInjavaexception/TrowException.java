package exceptionInjavaexception;

public class TrowException {
	
	public static void validate(int age) {
		if(age>=18) {
			System.out.println("Your age is :" +age);
		}
		else {
			throw new ArithmeticException("your age is inavalid");
		}
	}
	
	public static void main(String[] args) {
		
		/*
		 * throw:
		 * =======
		 * to throw exception (Explicitly throw an exception or custom exception or user defined exception)
		 * ArithmeticException , and others are the built in class
		 * */
		try {
			validate(10);
			
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			
		}
		finally {
			System.out.println(" program completed ");
		}
	}

}
