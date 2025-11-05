package exceptionInjavaexception;

public class Errors {

	/*
	 * (recursive in java-read)
	 * Exception in java
	 * =================
	 * there is a unwanted or un-excepected event occure in the program.
	 * when ever there is exception the normal flow will stops.
	 * 
	 * 2 types:
	 * =========
	 * 1.checked exception(compile time)-FileNotFoundException(2 ways)
	 * we have to handle at compile time
	 * 
	 * 2.unchecked exception(run time) - arrayindexoutofbound
	 * 
	 * Error:
	 * =====
	 * it is a problem where the programmer can't handle it ex:stackoverflow */
	
	public static void main(String[] args) {
		//i.Error
		
		int res = fact(3);
		System.out.println(res);
	}

	private static int fact(int i) {
//		if (i == 0) {          // base condition (stop here)
//	        return 1;
//	    }
		return i*fact(i-1); //its show stackoverflow error because , we not mention the base condition like fact =1 or 0;
	}
	
	
}
