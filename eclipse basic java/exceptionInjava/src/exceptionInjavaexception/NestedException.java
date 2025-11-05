package exceptionInjavaexception;

public class NestedException {
	
	public static void main(String[] args) {
		
		//main try block
		try {
			 int[] arr = {1 , 2, 3, 4, 5};
			// System.out.println(arr[5]); its shows the exception then it is not going to the inner try loop
			
			//inner try block
			try {
				
				int res = arr[0]/0;
				System.out.println(res);
				
			} catch (ArithmeticException e) {
				System.out.println("division by zero is not possible");
				System.out.println(e.getMessage());
			}
			
      
			 System.out.println(arr[5]); // this will shows the arrayindexoutofbound exception , after printing the inner loop exception, the outer loop excepotion  will shows , if we mention like this. 
			
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("Element at such index does not found");
		}
		
	}

}
