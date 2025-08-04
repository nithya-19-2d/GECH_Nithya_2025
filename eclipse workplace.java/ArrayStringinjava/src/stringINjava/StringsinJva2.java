package stringINjava;

public class StringsinJva2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String methods
		 * equals
		 * equalsignorecase
		 * concate
		 * toUpperCase
		 * toLowerCase
		 * endswith
		 * startswith
		 * strip
		 * trim 
		 * isBlank()*/
		String str1 = new String("Hello World");
		String str2 = new String("hello world");
		String str3 = new String();
		//1. equals
		System.out.println(str1.equals(str2));
		//2.equalsignorecase
		System.out.println(str1.equalsIgnoreCase(str2)); // shows true
		//3. ==
		System.out.println("==:"+str1==str2);  // shows false
		//4.concate
		System.out.println("concat:"+str1.concat(str2));
		System.out.println(str1.concat(" ").concat(str2).concat("hii"));
		//toUpperCase
		System.out.println(str2.toUpperCase());
		//toLowerCase
		System.out.println(str1.toLowerCase());
		//startswith
		System.out.println(str1.startsWith("Hello"));
		//endswith
		System.out.println(str2.endsWith("world"));
		//trim
		System.out.println(str2.trim()); // this is also shows the hello world
		//strip
		System.out.println(str1.strip()); // this is also shows hello World
		//isBlank()
		System.out.println(str3.isBlank()); // true
		
		
	
	}

}
