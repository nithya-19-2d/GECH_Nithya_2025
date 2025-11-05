package exceptioninjava;

public class Exceptioninjava4 {
	
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("invalid age");
		}
		else {
			System.out.println("your age:"+age );
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * finally block:
		 * =>this will execute even if the exception occurs or not 
		 * where we have to write the closing code like
		 * db connection, file close */
		
//		try {
//			System.out.println(10/0);
//		}finally {
//			System.out.println("this is finally block");
//		}
		
//		try {
//			System.out.println(10/0);
//		}catch(Exception e){
//			System.out.println(e);
////			System.out.println(e.getMessage());
//		}finally {
//			System.out.println("this is finally block2");
//		}
		
		/*
		 * throw
		 *=======
		 *it is used to throw the exception */
		
		try {
			validate(11);
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
