package com.predefinedFunctionalInterface;

import java.util.function.Function;
import java.util.function.Predicate;

public class Factorialfunction {
	public static void main(String[] args) {
		
		
		Function<Integer , Integer> p = n ->{
			int fact = 1;
			for(int i=1 ; i<=n ;i++) {
				fact *=i;
			}
			return fact;
		};
		
		int res =p.apply(5);
		System.out.println(res);
		
		
		Predicate<Integer> q = s-> {
			
			for(int i=2 ; i<s ; i++) {
			  if(s%i==0) {
				  return false;
			  }
			
			  
			}
			
			
			  
			  
//			  if(s>0 && count ==0) {
//				  System.out.println("it is a prime");
//			  }
//			  else {
//				  System.out.println("not");
//			  }
			  return true;
		};
		
		boolean qr = q.test(5);
		System.out.println(qr);
		
	}
}

	


