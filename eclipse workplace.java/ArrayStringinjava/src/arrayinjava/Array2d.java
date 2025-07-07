package arrayinjava;

import java.util.Scanner;

public class Array2d {
	public static void main(String[] args) {
//		int arr[][] =new int[2][2];
//		arr[0][0] = 10;
//		arr[0][1] = 10;
//		arr[1][0] = 10;
//		arr[1][1] = 10;
//		for(int i=0;i<2;i++) {
//			for(int j=0;j<2;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a array size");
		int size = sc.nextInt();
		int[][] arr1 = new int[size][size];

		System.out.println("enter a array value:");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				System.out.println("enter " + i + +j + " th value: ");
				arr1[i][j] = sc.nextInt();

			}
		}
		System.out.println("array elements are:");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				System.out.println(arr1[i][j] + "");

			}
		System.out.println();
		}

	}
}
