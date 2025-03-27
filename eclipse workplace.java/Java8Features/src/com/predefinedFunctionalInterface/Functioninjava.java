package com.predefinedFunctionalInterface;

import java.util.function.Function;

public class Functioninjava {
	public static void main(String[] args) {
		/*
		 * Function:
		 * =========
		 * it will take one parameter then perform action and return the value
		 * Function, have two generic object Function<T, R>
		 * first one for taking the input in one object and another one for return the output in another onject*/
		
		Function<String, Integer> f = (s)->s.length();
		int res=f.apply("hello world");
		System.out.println(res);
		
		

		Function<Integer, Integer> f1 = (s)->s*s;
		int res1=f1.apply(2);
		System.out.println(res1);
		
		
	}

}
