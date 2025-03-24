package stringINjava;

public class StringinJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		/*Strings
		 * =====
		 * it is a group of characters
		 * ex:table
		 * need to enclose within ""
		 * 
		 * how to declare the string:'
		 * =========
		 * 1.using string literals
		 * String var_name = "string_name;
		 * 
		 * 2.using new keyword
		 * String var_name = new String("string_name")
		 * */
		
		String str1 = "String1";
		String str2 = new String("String2");
		String str3 = "String1";
		String str4 = new String("String2");
//		System.out.println(str1);
//		System.out.println(str2);
		System.out.println(str1.equals(str2)); //false //check for values
		System.out.println(str1==str2); //false
		//check for reference or address [new =objects,so its having some memory]
		System.out.println(str1.equals(str3)); //true
		System.out.println(str2.equals(str4)); //true
		System.out.println(str1==str3); //true
		System.out.println(str2==str4); //false
		//
		
		
		
	}

}
