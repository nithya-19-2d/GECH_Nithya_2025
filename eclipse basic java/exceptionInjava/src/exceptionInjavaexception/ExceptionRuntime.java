package exceptionInjavaexception;

import java.util.Scanner;

public class ExceptionRuntime {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st value ");
		int n = sc.nextInt();
		System.out.println("Enter the 2nd value ");
		int b = sc.nextInt();
		
//		int res = n/0;
//		System.out.println(res); // it will shows the java.lang.ArithmeticException: / by zero
		
		try {
			int res = n/b;
			System.out.println(res);
			
		} catch (ArithmeticException e) {
			e.printStackTrace(); //entire details
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		System.out.println("the end program");
		
	}

}
