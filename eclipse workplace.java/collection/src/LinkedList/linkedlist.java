package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ==> linked list underline data structure is doubly linked list
		 * ==> linked list allows duplicate'
		 * ==>linked list allows random access
		 * ==>linked list will allow null value
		 * ==> linked list preserve the order of insertion
		 */
		
		List<Integer> list = new LinkedList<>();
		list.add(43);
		list.add(43);  // duplicate
		list.add(null); // allow null
		list.add(23);
		list.add(30);
		list.add(35);
		System.out.println(list);
		System.out.println(list.get(0)); //random access
		
		/*
		 * linked list underline data structure is doubly linked list
		 *elements stored in the form of values*/

	}

}
