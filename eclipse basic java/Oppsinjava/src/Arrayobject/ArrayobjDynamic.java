package Arrayobject;

import java.util.Scanner;

class Student1 {
	String nmae;
	int roll;
}

public class ArrayobjDynamic {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size");
		int n = sc.nextInt();
		Student1[] std1 = new Student1[n];
	     System.out.println("Enter array element");
	     for(int i =0; i<n ; i++) {
	    	 std1[i] = new Student1();
	    	 std1[i].nmae = sc.next();
	    	 std1[i].roll = sc.nextInt();
	    	
	     }
	     
	     for(int i =0; i<n ; i++) {
	    	 System.out.println("the name is " +std1[i].nmae);
	    	 System.out.println("the roll no is " +std1[i].roll);
	     }
		
	}

}
