package com.collection.java;

import java.util.ArrayList;
import java.util.List;

public class Listinjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * List:
		 * =====
		 * it is child interface of collection
		 * it have some built in methods that is used inside a list implemented classes only
		 * list implented classes are-->ArrayList,
		 * 
		 * 
		 * when you represent a group of individual objectas a single entity
		 *  where order is preserved and  index based access and duplicate is allowed
		 *  the arraylist/collection contain different type of data type ,they are defaulty in objects,so when we are going to accss the elements presents in collection/list we have to give typecasting*/
		
		List list = new ArrayList();
		list.add(2);//0,this is the index number
		list.add("hello");//1
		list.add(10.67);//2
		list.add(23);//3
		System.out.println(list);
		String str = (String) list.get(1);
		System.out.println(str);
		double value = (double) list.get(2);
		System.out.println(value);
		byte element =  (byte) list.get(3);
		System.out.println(element);
		
		

	}

}
