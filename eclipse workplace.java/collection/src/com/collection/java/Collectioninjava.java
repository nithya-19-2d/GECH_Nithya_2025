package com.collection.java;

public class Collectioninjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * why we need collection:
		 * ======================
		 * to overcome from drawback of array we have to go for collection
		 * 
		 * drawback of array:
		 * ================
		 * 1.fixed size
		 * 2.same data type elements
		 * we cannot reduce the size of an array
		 * 
		 * Advantages in array
		 * ==================
		 * 1.random access
		 * 2.type safety-the element inside the array is based on the data type
		 * 3.type casting - to print elements in array-no need to type casting  */
		
		int [] array = new int[2];
		array[0]=12;
		array[1]=10;
		
		System.out.println((int)array[0]); //no need of type casting,and no need this
		System.out.println(array[1]);
		System.out.println(array[0]);

	}

}
