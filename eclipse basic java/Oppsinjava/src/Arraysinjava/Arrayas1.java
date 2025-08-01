package Arraysinjava;

public class Arrayas1 {
	/*
	 *Array => is a collection of elements with same data type(homogeneous element).
	 *and array contain fixed elements means if i give array size is 100 , then it allows only 100 elements , so for avoid this we use arraylist
	 *
	 *Types
	 *========
	 *1D Array = > int[] arr = new int[];
	 *2D Array => int [][] arr = new int[][];
	 * */
public static void main(String[] args) {
	int[] arr; //declaration
	arr = new int[5]; //initialization the size
	//we can do two in one line , for this fallow=> int [] arr = new int [5];
	//reference of index 0 is arr, to assigning the value to each index , it makes code repetation , means if we have 100 size , then we have to assign the value for 100 size ,so is not a good representation , for this we use for loop
	arr[0] = 10;
	arr[1] = 20;
	arr[2] = 30;
	arr[3] = 40;
	arr[4] = 50;
	//arr[5] = 60; shows array index out of bound exception.
	
	System.out.println("the first elememt is:" +arr[0]);
	System.out.println("the first elememt is:" +arr[1]);
	System.out.println("the first elememt is:" +arr[2]);
	System.out.println("the first elememt is:" +arr[3]);
	System.out.println("the first elememt is:" +arr[4]);
	//System.out.println("the first elememt is:" +arr[5]);
	
}
}
