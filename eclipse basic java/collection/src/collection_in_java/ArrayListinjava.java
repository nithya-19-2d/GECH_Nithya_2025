package collection_in_java;

import java.util.ArrayList;

public class ArrayListinjava {
	
	/*
	 * ArrayList: ======= Array list is a improved version of array(Dynamic Array) 
	 * 
	 * *Array list underline data structure is Dynamic array(we don't mention the array size in array list it
	 * will automatically increase the array size when we insert automatically
	 * decrease/shrink the array size when we delete ).
	 * 
	 *  Array list allow duplicate
	 *  
	 * array list allow random access(using index). 
	 * Array list will allow null
	 * values. 
	 * Array list will preserve the order of insertion
	 */
	
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add("hello");
		arr.add(345);
		arr.add(123.123);
		arr.add(true);
		
		System.out.println(arr);
		System.out.println(arr.get(1));
		
	}
	
	

}
