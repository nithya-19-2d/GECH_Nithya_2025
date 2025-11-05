package Smallestnum;

import java.util.Scanner;

public class ArraySmallest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter the array element");
		for(int i=0; i<n;i++) {
			arr[i] = sc.nextInt();	
		}
		
		for(int i=0; i<n ;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Thesecond min value is");
		
		int min = arr[0];  
		int secmin = Integer.MAX_VALUE; // we have to assigning the value to the any variable before going to initializing the another value within in the conditional statments in the looping statement
		int i=0;
		while(i<n) {
			
			
			if(arr[i]<min) {
				secmin = min;
				min = arr[i];
			}
			
			
			if(arr[i]<secmin && arr[i]>min) {
				secmin = arr[i];
			}
			
			i++;
			
		}
		System.out.println(min);
		System.out.println(secmin);	
			
		}
	}


