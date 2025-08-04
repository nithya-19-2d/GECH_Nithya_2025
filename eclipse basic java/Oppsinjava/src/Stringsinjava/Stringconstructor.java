package Stringsinjava;

public class Stringconstructor {
	
	public static void main(String[] args) {
		
		/*
		 * String Constructor
		 * ===================*/
		
		String str1 = new String();
	    System.out.println("str1:"+str1);  // this display empty value
	    str1 = "Some values";
	    System.out.println("str1:" +str1);
	    
	    String str2 = new String("Nithya");
	    System.out.println("str2:" +str2);
	    
	    //using char 
	    char[] arr = {'a','b','c','d'};
	    String str3 = new String(arr);
	    System.out.println("char string:"+str3 );
	    
	    //using byte
	    byte[] arr1 = {65,97,66,98,67}; //AaBbC
	    String str4 = new String(arr1);
	    System.out.println("str4:" +str4);
	    
	    StringBuffer sb = new StringBuffer("12345");
	    String str5 = new String(sb);
	    System.out.println("str5 :"+str5);
	}

}
