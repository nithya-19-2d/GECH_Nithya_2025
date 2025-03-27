package com.functionalinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Comaparator is a functional interface which contain one abstract method is , compare
class functionalinter implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return  o1-o2;
	}
	
}

public class ComparatorINJava {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(2);
		list.add(5);
		list.add(23);
		Collections.sort(list, new functionalinter()); //new functionalinter is a comparator
		System.out.println(list);
		
		Collections.sort(list,(a,b)->b-a);//lambda expression
		System.out.println(list);
		
		
		
		
	}

}
