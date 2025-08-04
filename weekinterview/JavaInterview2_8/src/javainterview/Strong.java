package javainterview;

import java.util.Scanner;

public class Strong {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
	    int n = sc.nextInt();
	    int original = n;
	    int sum =0;
	    while(n>0) {
	    	int digits = n%10;
	    	sum += function(digits);
	    	n/=10;
	    	
	    }
	    
	    //System.out.println(+sum);
	    
	    if(original == sum) {
	    	System.out.println("The number is strong");
	    }
	    else {
	   
	    System.out.println("The number is not strong");
	}
	    
	}

	private static int function(int digits) {
			int fact =1;
				 for(int i =1; i<=digits ; i++) {
					 fact*= i;
				 }
				 return fact;	 	
			}
		
	}
	
	


