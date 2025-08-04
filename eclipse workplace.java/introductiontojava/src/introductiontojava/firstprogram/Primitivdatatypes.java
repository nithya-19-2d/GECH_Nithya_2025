package introductiontojava.firstprogram;

import java.util.Scanner;

public class Primitivdatatypes {
	
	public static void main(String[] args) {
		
		//primitive data types
		
		//byte
		
		byte num;
		System.out.println("Enter a byte number");
		Scanner sc = new Scanner(System.in);
		
		//char
		char gender;
		System.out.println("Enter a charcter");
		Scanner scanner = new Scanner(System.in);
		gender = sc.nextLine().charAt(0);  //it will take entire line with space 
		//gender = scanner.next().charAt(0);  //it will take single character without space from 0 index
		System.out.println("The character is:" +gender);
	}

}
