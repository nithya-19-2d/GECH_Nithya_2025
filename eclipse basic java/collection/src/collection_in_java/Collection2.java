package collection_in_java;

import java.util.ArrayList;
import java.util.Collection;

public class Collection2 {
	
	public static void main(String[] args) {
		Collection col = new ArrayList();
		col.add("123");
		col.add(123);
		col.add(123.112);
		col.add(true);  // there is no type safety
		
		Collection col12 = new ArrayList();
		col12.add("hello");
		
		col.addAll(col12); //
		
		System.out.println(col);
		System.out.println(col12);
		
	}
	/*
	 * Collection --> root interface in collection framework
	 * collections --> it will providee some of the utility
	 * methods to work with collection
	 * 
	 * 
	 * Collection
	 * ==========
	 * when you represent a group of individual object as a single entity then we should go for collection
	 * root interface in collection framework
	 * this will provide some of built in method to work with any collection class 
	 * we can store multiple data types
	 * 
	 * */
	
	
	

}
