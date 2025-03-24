package arrayinjava;

import java.util.Scanner;

public class Chararray1d {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a size of an value:");
		int number= sc.nextInt();
		sc.nextLine();
		char [][] arr1 = new char[number][number];
		
		System.out.println("Enter "+number+" characters:");
		for(int i=0;i<arr1.length; i++) {
			for(int j=0; j<arr1.length; j++) {
				arr1[i][j] = sc.next().charAt(0);
			}
		}
			
			
			//display
			System.out.println("you entered");
			for(int i=0;i<arr1.length; i++) {
				for(int j=0; j<arr1.length; j++) {
					System.out.print(arr1[i][j] + " ");
				}
				System.out.println();
			
			}
			sc.close();
	}

}
