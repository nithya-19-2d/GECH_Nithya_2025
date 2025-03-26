package com.collection.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		//List => child 
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		//1.for loop
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i)+ " ");
		}
		//2.for each
		for(int i:list) {
			System.out.print(i+" ");
		}
		System.out.println();
		//3.foreach
		list.forEach(i->System.out.print(i+" "));
		System.out.println();
		
		//4.iterator
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			//index = itr.next()
			System.out.println(itr.next()+" ");
		}
	}

}
