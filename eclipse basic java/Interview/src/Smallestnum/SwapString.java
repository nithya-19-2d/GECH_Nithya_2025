package Smallestnum;

public class SwapString {
	public static void main(String[] args) {
		
		   
		        String a = "good";
		        String b = "bad";

		        a = a + b;  // "HelloWorld"
		        b = a.substring(0, a.length() - b.length());
		        a = a.substring(b.length());

		        System.out.println("a: " + a);
		        System.out.println("b: " + b);
		    }
		

	}


