package introductiontojava.firstprogram;

import java.util.Scanner;

public class Assigndatatypes {
	
	public static void main(String[] args) {
		
		int Age;
		char gender;
		double marks;
		String name;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a age \n");
		Age = sc.nextInt();
		System.out.println("Enter a gender \n");
		gender = sc.next().charAt(0);
		System.out.println("Enter a marks \n");
		marks = sc.nextDouble();  //--------------------- => this space , 'if we give name here its shows in the name field '
		sc.nextLine();    // it will skip the entering space line (\n) after the entering the double
		//sc.next();   // it will skip the nextLine() and after entering , shows only three fields, & name will comes up
		System.out.println("Enter a name \n");
		name = sc.nextLine();
		
		
		System.out.println("the age is:"+Age+"\n");
		System.out.println("The gender is:"+gender+"\n");
		System.out.println("The marks is:"+marks+"\n");
		System.out.println("the name is:"+name+"\n");
	}

}
