package com.set;

import java.util.TreeSet;

public class SortedSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sortedSet
		TreeSet<Integer> treeset = new TreeSet<>((a,b)->b-a); //sorting ascending to descending
		treeset.add(2);
		treeset.add(12);
		treeset.add(10);
		treeset.add(100);
		System.out.println("Treeset:"+treeset);
		

	}

}
