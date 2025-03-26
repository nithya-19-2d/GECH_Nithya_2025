package exceptioninjava;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Exceptioninjava {
	//stackoverflow
	//recurssion
	//error
	public static void display() {
		display();
	
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		/*
		 * exception in java:
		 * =================
		 * there is a unwanted or un-expected event occure in the program
		 * whenever there is exception the normal flow will stop
		 * 
		 * 2.Types
		 * checked exception (compile time) - fileNotFoundException
		 * unchecked exception(run time)-arrayIndexOutBoundException
		 * 
		 * error
		 * ======
		 * it is a proble where the programmer can't handle it ex:stackoverflow error
		 * */
		//ERROR
		//ExceptionInJava.display()
		
		//checked exception
		//1.try catch
		//2.throws
		
//		try {
//			PrintWriter printwritter = new PrintWriter("abt.txt");
//			printwritter.println("hii,hello");
//			System.out.println("hello world");
//			printwritter.close();
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			
//			e.printStackTrace();
//		}
//		catch(IOException e) {}
//		 catch(Exception e) {
//		 }	
		
		//2.throw
		PrintWriter printwritter = new PrintWriter("abt.txt");
		printwritter.println("hii,hello");
		System.out.println("hello");
		printwritter.close();
		
		
//		display();

	}
}






