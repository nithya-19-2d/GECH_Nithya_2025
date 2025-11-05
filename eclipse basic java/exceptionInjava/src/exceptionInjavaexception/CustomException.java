package exceptionInjavaexception;

import java.security.DomainCombiner;

class InvalidException extends Exception{

	public InvalidException(String message) {
		super(message);
	}
	
	
}



public class CustomException {
	
	public static void validate(int age) throws InvalidException  {
		if(age>=18) {
			System.out.println("Your age is :" +age);
		}
		else {
			throw new ArithmeticException("your age is inavalid");
		}
		
	}
	
	public static void main(String[] args) {
		
		try {
			validate(10);
			
			
		} catch (InvalidException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
