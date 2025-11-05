package exceptionInjavaexception;

import java.io.FileNotFoundException;

import java.io.PrintWriter;

public class ExceptionCompiletime {
	public static void main(String[] args) throws FileNotFoundException {
		
	
	
	//Exception
	//checked Exception - 2 ways => throws and try and catch
	
	
	try {
		PrintWriter pw = new PrintWriter("abc.txt");
		pw.println("hello ");
		pw.println("12345");
		System.out.println("hello world");
		pw.close();
	} catch (FileNotFoundException e) {
		//to print any exception we have 3 ways
		e.printStackTrace(); //entire details
		System.out.println(e.getMessage());
		System.out.println(e);
	}
	
	//2 ways = throws = is used to handle checked exception
	PrintWriter pw = new PrintWriter("abc.txt");
	pw.println("hello ");
	pw.println("12345");
	System.out.println("hello world");
	pw.close();
	
	
	}

}
