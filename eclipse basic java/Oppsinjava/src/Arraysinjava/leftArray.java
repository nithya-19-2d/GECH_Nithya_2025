package Arraysinjava;

import java.util.Scanner;

public class leftArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		int k;
		
		System.out.println("Enter" +n +"array element" );
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			
		}
		
		System.out.println("The array elements are ");
		for(int i=0; i<n;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Enter position of an element");
		k = sc.nextInt();
		int [] temp1 = new int[k];
		for(int i=0; i<k; i++) {
			temp1[i] = arr[i];
		}
		
		for(int i=0; i<n-k; i++) {
			arr[i] = arr[k+i];
		}
		
		for(int i=0; i<k; i++) {
			arr[n-k+i] = temp1[i];
		}
		
		System.out.println(" The left rotation of array position");
		for(int i=0; i<n ; i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}
