package com.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Setinjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*set:
			 * ====
			 * when you represent a group of individual objects as a single entity
			 * where the insertion order in not preserved,
			 *  duplicate will not allow then we should go for set interface 
			 *  
			 *  
			 *  1.order is not preserved
			 *  2.duplicate will not allow
			 *  3.random access is not allowed
			 *  */

		Set<Integer> set = new HashSet<Integer>();
		set.add(13);
		set.add(null);
		set.add(12);
		set.add(38);
		set.add(23);
		set.add(40);
		System.out.println(set);
		System.out.println(set);
//		System.out.println(((List<Integer>) set).get(0));//random access is not allowed
		
		
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(12);
		list.add(16);
		list.add(35);
		list.add(12);
		System.out.println("List:"+list);
		
		//to remove the duplicated value from arraylist go for set interface
		Set<Integer> set1 = new HashSet<Integer>(list); //hashSet with another interface
		System.out.println("Set:"+set1);
		
		

	}

}
