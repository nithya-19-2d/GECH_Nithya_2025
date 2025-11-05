package Smallestnum;

import java.util.Scanner;

public class Smallestn {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		int original = n;
		int min =9;
		int secmin = Integer.MAX_VALUE;
		int digit;
		while(n>0) {
			//int digit =  n%10; we can initialize like this also
		    digit = n%10;
		   
		   
			if(digit<min) {
				secmin = min;  // which will hold the oldest value of min
				min = digit;
			}
			
				
			else if(digit<secmin && digit>min) {
			secmin = digit;
					
				}
				
				
	
			n/=10;
		
		}
		System.out.println(min);
		System.out.println("Second largest number "+secmin);
		System.out.println(n); // n=0 , because after the n/=10 , n=0; so that we have to initially assign n to the original value
		
	}
}

//while(n>0) {
//	//int digit =  n%10; we can initialize like this also
//    digit = n%10;
//   
// => ex: 12345= it will check and replace min=9 to 5 
// --> for ex: 583: 3<9 , min = 3
// --> 8<3 false , then goto for sec min check 
// --> the 5<3 is false goto secmin 

//	if(digit<min) {
//		min = digit;
//	}
//	
//		
//	 => (5<Infinity &&5>5) => false then again the value of secmin is infinity ok.
//   --> 8<infinity && 8>3 is true secmin = 8 and min is still 3
//  -->  5<8 && 5>3 true , secmin = 5 , is the second min value , so is not work for 12345

//  else if(digit<secmin && digit>min) {
//	secmin = digit;
//			
//		}
//		
//		
//
//	n/=10;
//
//}

	
//this will also work but takes more time complexity
//		System.out.println("The second smallest number");
//		
//		
//		while(original>0) {
//			 digit = original%10;
//			if(digit<secmin && digit>min) {
//				secmin = digit;	
//		}
//			original/=10;
//		
//		}
//		
//		System.out.println(secmin);
		
		
	


