package collection_in_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylist2 {
	
	//which preserve the order of insertion
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(3);
		arr.add(11);
		arr.add(14);
		arr.add(3);
		arr.add(19);
		System.out.println(arr);
		Collections.sort(arr); //comparable used for default or natural sorting  , for custom sorting we use comparator
		System.out.println("After :" +arr);
		System.out.println("Min :" +Collections.min(arr));
		System.out.println("Max :" +Collections.max(arr));
		
		//1.comparable
		//if you beed default or natural sorting 
		//order then we should go for comparable
		Collections.sort(arr);
		System.out.println("using comparable "+arr);
		
		
		//2.comparator
		/*
		 * A negative integer if 01 should come beforen02.
		 * Zero if 01 and 02 are considered equal for sorting purposes.
		 * A positive integer if 01 should come after 02.*/
		Collections.sort(arr, (a1,a2)->a2-a1);
		System.out.println("using comparator : "+arr);
		
	}

}
