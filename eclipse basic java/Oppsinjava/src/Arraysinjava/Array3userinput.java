package Arraysinjava;

import java.util.Scanner;

public class Array3userinput {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array");
	int n = sc.nextInt();
	int [] arr = new int[n];
	
	System.out.println("Enter the " +n +" elements");
	for(int i=0; i<n ; i++) {// to check the array size, we have an one variable is arr.length
		arr[i] = sc.nextInt();
		
		
		
	}
	
	int sum=0;
	System.out.println("The array elemnts are ");
	for(int i=0; i<=n-1 ; i++) {   // we can do this also i<=n-1 or i<n or i<=arr.length-1 or i<arr.length
		System.out.println(+arr[i]);
		sum +=arr[i];
		System.out.println("the sum of array is " +sum);
		
	}
	//System.out.println("the sum of array is " +sum); shows the total element sum
	
	sc.close();

}

}
