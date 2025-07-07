package arrayinjava;

import java.util.Scanner;

public class Chararray {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a size of an value:");
		int number= sc.nextInt();
		sc.nextLine();
		char [] arr1 = new char[number];
		
		System.out.println("Enter "+number+" characters:");
		for(int i=0;i<arr1.length; i++) {
			arr1[i] = sc.next().charAt(0);
			
			//display
			System.out.println("you entered");
			for(char c : arr1) {
				System.out.println(c + " ");
			}
			
//			System.out.println("Enter "+i+"th element: " );
//			arr1[i] = sc.nextInt();
//			System.out.println("array elements are:");
//		System.out.print(arr1[i] + "");
//		}
//		System.out.println("array elements are:");
//		for(char i=0;i<arr1.length; i++) {
//			System.out.print(arr1[i] + "");
//			//we can delare another variable also
//			
//		}
//		sc.close();
		
	}
		sc.close();

}
}
