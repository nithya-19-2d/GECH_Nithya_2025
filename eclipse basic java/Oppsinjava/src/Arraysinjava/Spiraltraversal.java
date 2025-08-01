package Arraysinjava;

import java.util.Scanner;

public class Spiraltraversal {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of element");
		int m = sc.nextInt();
		int [][] arr = new int[m][m];
		
		System.out.println("Enter elements");
		for(int i=0; i<m ;i++) {
			for(int j=0; j<m; j++) {
				arr[i][j] = sc.nextInt();
			}
			
		}
		
		System.out.println("The array elements are");
		for(int i=0; i<m ;i++) {
			for(int j=0; j<m; j++) {
				
				System.out.print(arr[i][j]+ " ");
				}
			System.out.println();
			}
		
		int top = 0, bottom = m - 1;
		int left = 0, right = m - 1;

		System.out.println("Spiral traversal:");
		while (top <= bottom && left <= right) {
		    for (int i = left; i <= right; i++) { System.out.print(arr[top][i] + " ");}
		    top++;

		    for (int i = top; i <= bottom; i++) {
		    	System.out.print(arr[i][right] + " ");
		    }
		    right--;

		    for (int i = right; i >= left && top <= bottom; i--) 
		    	{
		    	System.out.print(arr[bottom][i] + " ");}
		    bottom--;

		    for (int i = bottom; i >= top && left <= right; i--)
		    	{
		    	System.out.print(arr[i][left] + " ");
		    	}
		    left++;
		}

		
		
	}

}
