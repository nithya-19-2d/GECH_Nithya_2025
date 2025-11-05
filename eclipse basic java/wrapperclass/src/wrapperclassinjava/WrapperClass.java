package wrapperclassinjava;

public class WrapperClass {

	public static void main(String[] args) {
		//wrapper class => wrapper arround the Primitive data type
		//wrapper class are mutable
		//Auto boxing  => converting from primitive data type to wrapper
		
		int a =10;
		Integer b = a;
		System.out.println("int :" +a);
		System.out.println("Integer :" +b.getClass().getName());  //java.lang.integer
		
		float a1 = 20;
		Float a2 = Float.valueOf(a1);
		System.out.println("Float :" +a2.getClass().getName());
		
		long l3 = 40;
		Long l4 = Long.valueOf(l3);
		System.out.println(l4.getClass().getName());
		System.out.println(l3);
		
		
		
		//Unboxing => from Wrapper class to primitive

		System.out.println(" Unboxing ");
		Integer a3 = 10;
		int a4 = a3.intValue();  //its a optional
		//int a4 = a3;
		System.out.println("Integer :" +a3.getClass().getName());
		System.out.println("int :" +a4);
		
		Long l1 = (long) 10;
		long l2 = l1;
		System.out.println("Long :" +l1.getClass().getName());
		System.out.println("long :" +l2);
		
		Float f1 = (float) 20;
		float f2 = f1;
		System.out.println("Float :" +f1.getClass().getName());
		System.out.println("float :" +f2);
		
		Double d1 = (double) 100;
		double d2 = d1.doubleValue();
		System.out.println("Double :" +d1);
		System.out.println("double :" +d2);
		
		Character c1 = (char)'c';
		char c2 = c1.charValue();
		System.out.println("c1:" +c1.getClass().getName());
		System.out.println("c2 :" +c2);
		
		
		
		
		
		
	}
}
