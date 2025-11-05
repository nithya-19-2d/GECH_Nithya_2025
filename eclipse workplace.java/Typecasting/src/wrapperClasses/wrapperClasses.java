package wrapperClasses;

public class wrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * java is a pure oop or not
		 * =======================
		 * -->No , because its support (primitive data type) 
		 * 
		 * primitive data type:
		 * 
		 * byte,short, int,long,float,double,char,boolean
		 * 
		 * String name = new String("mohan"); (new=>object) is an object
		 * 
		 * collection
		 * ===========
		 * to store group of indivisual objects as a single entity
		 * we can perform/create a collection on objects like string and creating objects on data types 
		 * 
		 * 10,20,30,40---> int(primitive data type)
		 * 
		 * Wrapper classes:
		 * ===============
		 * wrapper arround the primitive data type
		 * 
		 * byte --> Byte (min-value -->'-28', max-value-->'127'
		 * short-->Short
		 * int-->Integer
		 * long-->Long
		 * float-->Float
		 * double-->Double
		 * char-->Character
		 * boolean-->Boolean
		 * 
		 * String = is an object by default
		 * */
		
		//1.Auto boxing -->from primitive to wrapper
//		int a =10;
//		Integer i = a; //convert from 'int data type' to 'object Integer'
//		System.out.println("Int:"+a);
//		System.out.println("Integer:"+i.getClass().getName());
		
		System.out.println("\n Auto boxing /n");
		int a =10;
		Integer i = Integer.valueOf(a); //vlaueof()convert from int data type to object Integer,here 'valueOf' is the method,and its a function of class 'Integer'(Integer is the class)   => to conform that its in wrapper class , we use, getClass().getName()
		System.out.println("Int:"+a);
		System.out.println("Integer:"+i.getClass().getName());
		
		long a3 = 20;
		Long a2 = a3;
		System.out.println("long:"+a3);
		System.out.println("Long:"+a2.getClass().getName());
		
		byte a6 =20;
		Byte a7 =Byte.valueOf(a6);
		System.out.println("byte:"+a6);
		System.out.println("Byte:"+a7.getClass().getName() );
		
		float b =(float) 3.44;
		Float b1 = b;
		System.out.println("float:"+b);
		System.out.println("Floattype:"+b1.getClass().getName() );
		
		
		
		
		
		
		//unboxing-->from Wrapper class to primitive
		System.out.println("\n unboxing \n");	
		Integer i1 =10;
		int a1 = i1.intValue();   // Value() => is for convert from wrapper class  to primitive data type  , but its a optional
//		int a1 = i1;
		System.out.println("Int:"+a1);
		System.out.println("Integer:"+i1);
		System.out.println("Integer:"+i1.getClass().getName());
		
		
		Long a4 = (long) 20;
		long a5 = a4;
		System.out.println("long:"+a5);
		System.out.println("Long:"+a4.getClass().getName());
		
		Byte a8 =20;
		byte a9 =a8.byteValue();
		System.out.println("byte:"+a9);
		System.out.println("Byte:"+a8.getClass().getName());
		
		
		
		

	}

}
