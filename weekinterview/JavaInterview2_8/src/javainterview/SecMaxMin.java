package javainterview;

import java.util.Scanner;

public class SecMaxMin {
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
		
		int min = arr[0]; 
		int max = arr[0];
		for(int i=0; i<n ; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		System.out.println("The maximun element is :" +max);
		System.out.println("The minimum element is :" +min);
		
		int secmin = max;
		int secmax = min;
		
		for(int i=0;i<n;i++) {
			if(arr[i]<secmin && arr[i]>min) {
				secmin = arr[i];
			}
			if(arr[i]>secmax && arr[i]<max) {
				secmax = arr[i];
			}
		}

		System.out.println("The second maximun element is :" +secmax);
		System.out.println("The second minimum element is :" +secmin);
		
		
	}

}
