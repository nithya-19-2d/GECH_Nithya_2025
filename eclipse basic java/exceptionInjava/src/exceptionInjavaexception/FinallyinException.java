package exceptionInjavaexception;

public class FinallyinException {
	public static void main(String[] args) {
		//finally
		/*
		 * it will excecute even if the exception occure or not.
		 * it is used with the try catch handling
		 * need of finally = what are the clean up resource (ex: data base connection, file close)
		 * in each senario the finally block will won't execute
		 * 1.System.exit();  , if we add this to catch , the finally block is executed
		 * 2.when the exception occure in the finally block
		 * 
		 * 
		 * 
		  try {
		  System.out.println(10/0);
			
		} finally{
		System.out.println(the finally block is executed);
		} 
		
		*/
		
		try {
			System.out.println(10/0);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			//System.out.println(10/0); -> it will the=row a exception not execute the finally block
			System.out.println("This is finally block");
		}
	}

}
