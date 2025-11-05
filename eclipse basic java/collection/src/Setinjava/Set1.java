package Setinjava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Set1 {
	
	public static void main(String[] args) {
		
		/*
		SET:
		===
		 * set is a child inteface of collection
		 * where you represent a group of individual object as a single entity,
		 * where the insertion order is not preserved
		 * set will not allow duplicate values
		 * when we dont want use  duplicate values best go for set
		 
		 1. no presrved order
		 2. not allow duplicate
		 3. no random access is there
		 */
		
		Set<Integer> st = new HashSet<>();
		st.add(12);
		st.add(14);
		st.add(12);
		st.add(34);
		st.add(null);
		st.add(100);
		st.add(null);
		System.out.println(st);  //its just print unique value and not print the duplicate value
		
		//to remove duplicate value in list , we use set interface
		
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(100);
		marks.add(200);
		marks.add(100);
		marks.add(300);
		marks.add(200);
		marks.add(500);
		marks.add(null);
		
		System.out.println(marks);
		
		Set<Integer> s2 = new HashSet<>(marks);
		System.out.println(s2);
		
		Iterator<Integer> it = marks.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
