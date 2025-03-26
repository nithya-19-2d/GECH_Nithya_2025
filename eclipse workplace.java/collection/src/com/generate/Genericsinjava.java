package com.generate;

import java.util.ArrayList;
import java.util.List;

public class Genericsinjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Generics
		 * =========
		 * to provide the type safety and to avoid the type casting in 
		 * collection then we should go for generic
		 * type safety-tn array ,containes only single data type , is not allowed for inserting differnet data type after mentioning the data type
		 * 
		 * syntax of generics
		 * ========
		 * List<type of objects>*/
		
		char [] arr = {'a','b','c'};//type safety
		char firstEle = arr[0];//without type casting 
		System.out.println(firstEle);
		
		//without generics
		List arr1 = new ArrayList();//there is no type safety
		arr1.add(12);
		arr1.add("hello");
		int value = (int) arr1.get(0);//explicit type casting
		System.out.println(value);
		
		//generics
		//after java 8,in java 8 we use type of object after the ArrayList
		List<Integer> list = new ArrayList<>();//type safety
		list.add(12);
		list.add(120);//1
//		list.add(10.23);
		int a = list.get(1);//there is no concept of type casting
		System.out.println(a);
		System.out.println(list);

	}

}
