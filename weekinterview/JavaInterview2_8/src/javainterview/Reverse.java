package javainterview;

import java.util.Scanner;

public class Reverse {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		System.out.println("Enter " +n + " elements");
		
		for(int i=0; i<n ; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The elements are");
		for(int i=0; i<n ; i++) {
			System.out.println(arr[i]+ " ");
		}
		
		int temp;
		for(int i=0, j = n-1 ; i<j; i++, j--) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
		}
		System.out.println("The reverse elements are");
		
		for(int k=0; k<n ; k++) {
			System.out.println(arr[k]+"");
		}
		
		
	}

}
