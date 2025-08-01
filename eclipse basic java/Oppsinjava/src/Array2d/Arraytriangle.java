package Array2d;

import java.util.Scanner;

public class Arraytriangle {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of element");
		int m = sc.nextInt();
		
		//int n= sc.nextInt();
		
		
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<=i; j++) {
			System.out.print(i+1 + "");
			
		   }
			System.out.println();
			
		}
		
		
		
		
		
	}

}
