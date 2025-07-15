package curejava;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		int i , fact =1 , num; 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  number : \n");
		num = sc.nextInt();
		for(i=1; i<=num ; i++) {
			fact*=i;
		}
		System.out.println("the fact is :"+fact);
	}

}
