package practiceforinterview;

import java.util.Scanner;

public class Arrayoddevencount {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the array element");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The array element are");
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
		
		
//		int count =0 , oddcount=0;
//		
//		for(int i=0; i<n; i++) {
//			if(arr[i]%2 == 0) {
//				count++;
//				
//			}
//			else {
//				oddcount++;
//				
//			}
//			
//		}
//		
//		System.out.println("the even count is"+count);
//		System.out.println("the odd count is"+oddcount);
		
		int temp;
		int max = arr[0];
		for(int i=0; i<n; i++) {
			
			if(arr[i]>max) {
				max = arr[i];
				
			}
			
		}
		
		int secmax = Integer.MIN_VALUE;
		
for(int i=0; i<n; i++) {
			
			if(arr[i]>secmax && arr[i]< max) {
				secmax = arr[i];
				
			}
			
		}
	System.out.println(max+"max value");	
System.out.println(secmax+"second largest");
		
		
		
	}

}
