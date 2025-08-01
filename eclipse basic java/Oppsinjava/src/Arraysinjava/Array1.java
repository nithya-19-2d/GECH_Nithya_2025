package Arraysinjava;

public class Array1 {
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		//for loop
		for(int i=0; i<10; i++) {
			arr[i] = i+10;
		}
		
		for(int i=0; i<=9 ; i++) {
			System.out.println(i+1 + " the element is " +arr[i] );
		}
		
	}

}
