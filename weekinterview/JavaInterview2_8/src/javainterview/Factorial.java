package javainterview;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numner");
	    int n = sc.nextInt();
	    int result = function(n);
	    System.out.println("The factorial of num  is:" +result);
		
		
	

}


	private static int function(int num) {
		int fact =1;
			 for(int i =1; i<=num ; i++) {
				 fact*= i;
			 }
			 return fact;	 	
		}
	}

	

