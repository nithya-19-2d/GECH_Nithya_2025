package LInkedlist_java;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedCollection {
	
	public static void main(String[] args) {
		
		List<String> linked = new LinkedList<String>();
		linked.add("Nithya");
		linked.add("Shwetha");
		linked.add("swathi");
		
		System.out.println(linked);
		System.out.println("The second element is " +linked.get(2));
		
		//to sort using default method or natural , which sort in ascending order by default
		Collections.sort(linked);
		
		//for decending order sort using custom comparator , which will not possible because we pass String data type ,and - operator is only for numerics
		//Collections.sort(linked, (a1 , a2) -> a2-a1);
		
	     
	     
	}

}
