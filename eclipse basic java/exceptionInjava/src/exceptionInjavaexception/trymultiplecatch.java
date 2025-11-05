package exceptionInjavaexception;

import java.util.Scanner;

public class trymultiplecatch {
	public static void main(String[] args) {
		
		/*
		 * multiple try catch block -> the flow is , from child to parent
		 * parent is (Exception e)
		 * child are (airthmeticexception e) ,(NullpointerException) and other*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st value ");
		int n = sc.nextInt();
		System.out.println("Enter the 2nd value ");
		int b = sc.nextInt();
		
		try {
			
			int res = n/b;
			String str = null;
			str.toString();
			System.out.println("res "+res);
			
		} catch(ArithmeticException e){
			System.out.println("The child class");
			System.out.println(e.getMessage());
			
			
		}
		catch (Exception e) {
			System.out.println("this is exception class ");
			System.out.println(e.getMessage());
		}
		
		System.out.println("End of program");
		
	}

}
