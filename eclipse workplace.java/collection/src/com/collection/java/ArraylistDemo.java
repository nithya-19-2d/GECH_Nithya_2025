package com.collection.java;

import java.util.ArrayList;

public class ArraylistDemo {
public static void main(String[] args) {
	/*
	 * ArrayList:
	 * ========
	 *Array list is a improved version of array(dynamic Array)
	 *Array list underline data structure is Dynamic array(can grow and shrink)
	 *Array list allow duplicate
	 *ArrayList allow random access(using index)
	 *ArrayList will allow null value
	 *Array list will preserve the order of insertion
	 * */
	//representation of ArrayList
	ArrayList<Integer> list = new ArrayList<Integer>();
	//insertion of elements
	list.add(12);//0
	list.add(1);
	list.add(1);
	list.add(null);//3
	list.add(null);
	list.add(34);
	list.add(23);
	list.add(43);
	list.add(null);
	list.add(null);
	System.out.println(list);
	System.out.println(list.get(3));
	System.out.println(list.size());
	list.remove(0);
	System.out.println(list);
	Integer i = 34;
	list.remove(i);
//	list.clear();
	System.out.println(list);
	
	
}
}
