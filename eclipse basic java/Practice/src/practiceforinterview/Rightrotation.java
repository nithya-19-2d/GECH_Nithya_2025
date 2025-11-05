package practiceforinterview;

import java.util.Scanner;

public class Rightrotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		
//		int[] arr1 = new int[n];
//		System.out.println(arr1);
//		
		int[] arr = new int[n];
		
		System.out.println("Enter the array element");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The array element are");
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("enter key value by index");
        int k = sc.nextInt();
        

		
		 System.out.print("Right rotation by index : ");
	        for (int i = n - k; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        
	        for (int i = 0; i < n-k ; i++){
	        	 System.out.print(arr[i] + " ");     

	        
	}
	        
	        System.out.print("left rotation by index : ");
	        for (int i = k; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
//	        for (int i = 1; i >=0 ; i--) {
//	            System.out.print(arr[i] + " ");
//	        } // value prints 34521
	        
	        for (int i = 0; i <k ; i++) {
            System.out.print(arr[i] + " ");
	        } 
	        System.out.println();
}
}
