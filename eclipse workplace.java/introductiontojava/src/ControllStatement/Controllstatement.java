package ControllStatement;

import java.util.Scanner;

public class Controllstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Controll statement if,if else, else if,and Switch statement
		 * 
		 * if(condition){ }
		 * 
		 * if(condition){ } else{ }
		 * 
		 * if(condition){ } else if(condition){ } else if(condition){ } else{ }
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		byte age = sc.nextByte(); // which cover only the size of word or character
		sc.nextLine(); // it is used for give the input to next line
		if (age < 18) {
			System.out.println("your soo young");
		} else if (age >= 18 && age <= 30) {
			System.out.println("your  adult");
		} else if (age >= 30 && age <= 70) {
			System.out.println("your old ");
		} else {
			System.out.println("age is not considered");
		}

		// switch
		int day = 2;
		switch (day) {
		case 1: {
			System.out.println("monday");
			break;
		}
		case 2: {
			System.out.println("tuesday");
			break;
		}
		case 3: {
			System.out.println("wednesday");
			break;
		}
		case 4: {
			System.out.println("tursday");
			break;
		}
		case 5: {
			System.out.println("friday");
			break;
		}
		case 6: {
			System.out.println("satarday");
			break;
		}
		default: {
			System.out.println("invalid");

		}
		}

	}

}
