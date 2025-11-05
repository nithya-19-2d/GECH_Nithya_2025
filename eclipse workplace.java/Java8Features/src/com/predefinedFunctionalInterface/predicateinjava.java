package com.predefinedFunctionalInterface;

import java.util.function.Predicate;

public class predicateinjava {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				/*
				 * predicate:
				 * =========
				 * it will holds a condition.
				 * it contains test() test method only, to check the condition
				 * The return type of the pridicate is boolean
				 * to test the condition , the pridicate has test() method
				 * this can be used in stream*/
				// i need to find the number is even or not
		
				Predicate<Integer> p = (a)->a%2==0;
				boolean test = p.test(11);
				if(test) {
					System.out.println("The number is even");
				}else {
					System.out.println("The number is odd");
				}
				
				//System.out.println(p.test(20));
				
				Predicate<String> c = s->s.length()>=10;
				boolean t1 = c.test("NithyaAnil");
				if(t1) {
					System.out.println("The String length is grater than 10");
				}else {
					System.out.println("The String length is not grater than 10");
				}
				
				

	}

}
