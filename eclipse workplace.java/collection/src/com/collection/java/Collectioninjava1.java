package com.collection.java;

import java.util.ArrayList;
import java.util.Collection;

public class Collectioninjava1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Collection
		 * ==========
		 * when you reprents a group of individual objects as a single entity then we should go for collection
		 * root interface in collection framwork
		 * this will provided some of built in methods to work with any collection class
		 * collection uses the 'toString' as a default method to print the object
		 * ArrayList collection will perform the operation like add,remove,and clear element and these operation are the built in methods of collection
		 * 
		 * it containes heterogeneous(different data type) data*/
		
		
		Collection collection = new ArrayList(); 
			collection.add(10);
			collection.add("name");
			collection.add(10.89);
			collection.remove(10);
			collection.clear();
			
			System.out.println(collection);
		
	
	}

}
