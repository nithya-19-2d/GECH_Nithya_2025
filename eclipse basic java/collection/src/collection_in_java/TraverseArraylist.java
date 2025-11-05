package collection_in_java;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TraverseArraylist {
	
	public static void main(String[] args) {
		
		ArrayList arr = new ArrayList();
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(6);
		arr.add(7);
		
		//1.for loop
		System.out.println("for");

		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		System.out.println("for each");
		
		//2.for each
		for(Object item : arr) {
			System.out.println(item);
		}
		System.out.println("forEach");
		
		//3.forEach
		
		arr.forEach((item)->System.out.println(item));
		System.out.println();
		
		//4.iterator -uni-direction(forward)
		Iterator itr = arr.iterator();
		System.out.println("Using iterator");
		while(itr.hasNext()) {
		System.out.println(itr.next());}
		
		//5. ListIterator - bi_directional (forward and backward)
		ListIterator list = arr.listIterator();
		System.out.println("Using List Iterator");
		while(list.hasNext()) {
			System.out.println(list.next());
		}
		
		//6.Enumaration
		Vector vec = new Vector();
		vec.add("Hello");
		vec.add(123);
		
		System.out.println("Using Enumaration");
		Enumeration em = vec.elements();
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
		
		
	}
	
	

}
