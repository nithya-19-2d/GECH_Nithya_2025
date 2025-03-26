package exceptioninjava;

public class Exceptioninjava3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * try with multiple catches
		 * go from child to parent not from parent to child*/
		
		int [] array = new int[2];
				array[0]=10;
				array[1]=11;
				try {
					System.out.println(array[10]);
					System.out.println(10/0);
				}
				catch(ArrayIndexOutOfBoundsException e){
					System.out.println(e);
					
				}
				catch(ArithmeticException e) {
					System.out.println(e);
				}
				System.out.println("hello world");
				

	}

}
