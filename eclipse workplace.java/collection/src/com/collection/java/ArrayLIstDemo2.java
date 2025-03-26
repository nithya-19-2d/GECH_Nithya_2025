package com.collection.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLIstDemo2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(70);
		list.add(30);
		list.add(50);
		list.add(12);
		System.out.println("Before:"+list);
		/*
		 * Collections
		 * it is a utility classes that provides methods to work with collection
		 * */
		//sort
		Collections.sort(list);
		System.out.println("After:"+list);
		System.out.println("min value:"+Collections.min(list));
		System.out.println("max value:"+Collections.max(list));
		Collections.reverse(list);
		System.out.println("after reverse:"+list);
		
	}

	private static String reverse() {
		// TODO Auto-generated method stub
		return null;
	}

}
