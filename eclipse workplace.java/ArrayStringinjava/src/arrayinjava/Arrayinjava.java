package arrayinjava;

import java.util.Scanner;

public class Arrayinjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * */
//		int[]arr = new int[5];
//		arr[0]=20;
//		arr[1]=20;
//		arr[2]=20;
//		arr[3]=20;
//		arr[4]=20;
		//arr[5]=20; array index out of bound ,shows exception

//		for(int i=0;i<=4;i++) {
//			arr[i] = 10;
//		}
//		for(var i:arr) {
//			System.out.println(i+ "");
//		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a size of an value:");
		int number= sc.nextInt();
		int [] arr1 = new int[number];
		
		System.out.println("Enter a value for array:");
		for(int i=0;i<arr1.length; i++) {
			System.out.println("Enter "+i+"th element: " );
			arr1[i] = sc.nextInt();
//			System.out.println("array elements are:");
//			System.out.print(arr1[i] + "");
		}
		System.out.println("array elements are:");
		for(int i=0;i<arr1.length; i++) {
			System.out.print(arr1[i] + "");
			//we can delare another variable also
			
		}
		sc.close();
		
	}
	

}
