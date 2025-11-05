package Array2d;

import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		
		int [][] arr = new int[3][4];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements");
		for(int i=0; i<3 ;i++) {
			for(int j=0; j<4; j++) {
				arr[i][j] = sc.nextInt();
			}
			
		}
		
		
		System.out.println("The array elements are");
		for(int i=0; i<3 ;i++) {
			for(int j=0; j<4; j++) {
				
				System.out.print(arr[i][j]+ " ");
				}
			System.out.println();
			}
		
		int sum =0;
		for(int i=0; i<3 ;i++) {
			for(int j=0; j<4; j++) {
				
				sum= sum+arr[i][j];
				
				}
			
			}
		System.out.print( " Sum of array element is " +sum);
		
		
		
			
		
	}

}
