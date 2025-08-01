package Array2d;

import java.util.Scanner;

public class Arraymax {
	public static void main(String[] args) {
		int [][] arr = new int[2][2];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements");
		for(int i=0; i<2 ;i++) {
			for(int j=0; j<2; j++) {
				arr[i][j] = sc.nextInt();
			}
			
		}
		
		System.out.println("The array elements are");
		for(int i=0; i<2 ;i++) {
			for(int j=0; j<2; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}
		
		int min = arr[0][0];
		int max = arr[0][0];
		for(int i=0; i<2 ;i++) {
			for(int j=0; j<2; j++) {
				
				if(arr[i][j]<min) {
					min = arr[i][j];
				}
				if(arr[i][j]>max) {
					max = arr[i][j];
				}
				
			}
		}
			System.out.println("The min value is " +min);
			System.out.println("The max value is "+max);
			
		

	}

}
