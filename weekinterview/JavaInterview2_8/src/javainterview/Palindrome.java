package javainterview;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String  n = sc.next();
		
		String reversed = "";
		for(int i =n.length()-1; i>=0; i--) {
			reversed+=n.charAt(i);
			
		}
		
		if(n.equals(reversed)) {
			System.out.println( n +"is palindrome");
		}
		else {
			System.out.println(n +"is not a palindrome");
		}
		
	}

}
