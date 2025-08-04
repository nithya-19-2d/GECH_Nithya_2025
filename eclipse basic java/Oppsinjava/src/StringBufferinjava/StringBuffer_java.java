package StringBufferinjava;

public class StringBuffer_java {
	/*
	 * 
	 * super(16) => 16 is the default capacity 
	 * .capacity() => is used to determain how much capacity the string buffer held
	 * is mutable(can change) and have thread safety
	 * all the wrapper class are immutable(can not be changed)*/
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
        sb.append("Nithya");
        System.out.println("String1 :" +sb);
        System.out.println("intial capacity: " +sb.capacity());
        sb.append("111111111111111");
        /*
         * (initial_capacity+1)*2 
         * */
        System.out.println("String1 :" +sb);
        System.out.println("Capacity: "+sb.capacity());
        sb.append("1111111111111");
        sb.append("111111111111111");
        System.out.println("capacity: " +sb.capacity());
        
      //All wrapper classes are immutable
      		/*
      		 * In Java, beyond the String class, several other built-in classes are immutable, meaning their state cannot be changed after they are created. These include:
      Primitive Wrapper Classes: All the wrapper classes for primitive data types are immutable. This includes:
      1.Integer
      .2Byte
      3.Long
      4.Float
      5.Double
      6.Character
      7.Boolean
      8.Short
      ================
      Java 8 Date and Time API Classes (java.time package): 
      The classes introduced in the modern Date and Time API are designed to be immutable, ensuring thread-safety and predictable behavior. Examples include:
      1.LocalDate
      2.LocalTime
      3.LocalDateTime
      4.Instant
      5.ZonedDateTime
      =================

      BigInteger and BigDecimal: 
      ==========================
      These classes, used for arbitrary-precision arithmetic, are also immutable. 
      Operations on these objects return new instances with the modified values.
      ============================================================================
      StackTraceElement: 
This class, used in building exception stack traces, is immutable.
==================

Most enum classes: 
==================
While not a strict rule, most enum classes in the standard API are implicitly immutable, as their instances represent fixed constants.
======================================
File: 
====================
Although File objects represent external entities (files on the system) whose state can change, the File object itself, representing the path, is immutable.
Font and BasicStroke (from java.awt): These classes, used in graphics operations, are also immutable.*/
        
        /*constructors in StringBuffer:
    	=============================================
    	*
    	*StringBuffer()-Creates an empty buffer with default capacity (16)
    	*StringBuffer(int capacity)-Creates an empty buffer with custom initial capacity
    	*StringBuffer(String str)-Creates a buffer with initial content of the given string
    	*StringBuffer(CharSequence seq)-Initializes buffer with the given character sequence (like String, StringBuilder)
    	*/
        
        String str1 = "123456";
        final String st2 = "123";
        String str3 = "123";
        
        String str4 = st2+"456";
        String str5 = str3+"456";
        
        System.out.println("str4: " +str4);
        System.out.println("str5:" +str5);
        
        System.out.println(str1 == str4); //true
        System.out.println(str1 == str5);// false
        
     // String comparison using == 
//     		String arr = "123456"; //string literal stored in string constant pool
//     		final String arr2 = "123"; // This is a constant, known at compile time.
//     		String arr3 = "123";  //This is not final, so Java cannot optimize it at compile time.
//     		 
//     		String arr4 = str2 + "456"; // Evaluated at compile time → "123456"
//     		String arr5 = str3 +"456"; // A new object is created in the heap (not from the constant pool).
//     		
//     		System.out.println(arr == arr5);//false
//     		System.out.println(arr == arr4);//true
//        

		
	}
		
		
	}


