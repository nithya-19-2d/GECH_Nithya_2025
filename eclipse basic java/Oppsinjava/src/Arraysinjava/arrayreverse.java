package Arraysinjava;

import java.util.Scanner;

public class arrayreverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		System.out.println("Enter the " +n +" elements");
		for(int i=0; i<n ; i++) {// to check the array size, we have an one variable is arr.length
			arr[i] = sc.nextInt();
				
		}
		
		System.out.println("The array elemnts are ");
		for(int i=0; i<=n-1 ; i++) {   // we can do this also i<=n-1 or i<n or i<=arr.length-1 or i<arr.length
			System.out.println(+arr[i]);
		}
		
		
//		System.out.println("The reverse of array element is ");
//		for(int i=n-1; i>=0; i--) {
//			System.out.println(+arr[i]);
//		}
		
		
		System.out.println("reverse element");
		for(int i=0 ,j = n-1;  i<j; i++, j-- ) {
			
			
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
			
				
		}
		
		for(int k =0 ; k<n ; k++) {
			System.out.println("the reverse value is:" +arr[k]);
		}
	}

}
