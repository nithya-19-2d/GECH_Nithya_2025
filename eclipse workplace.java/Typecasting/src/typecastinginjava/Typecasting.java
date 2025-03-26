package typecastinginjava;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * type casting
		 * ======
		 * 
		 * 1.implicite type casting
		 * conversion from one data type to another
		 * 
		 * byte->short->int->long->float->double
		 * 
		 * byte(lower data type)
		 * double(highest data type)
		 * 
		 * 2.explicite data type
		 * double->float->long->int->short->byte
		 * 
		 * 
		 * */
		//implicite type casting
		int a =10;
		long a2 = a;
		
		System.out.println("int:"+a);
		System.out.println("int:"+a2);
		
		float a5 = (float) 2.44;
		double a6 = a5;
		

		System.out.println("float:"+a5);
		System.out.println("double:"+a6);
		
		long b = 12;
		float b1=b;
		System.out.println("long:"+b);
		System.out.println("float:"+b1);
		
		
		
		
		//explicite type casting
		long a4 =20;
		int a3 = (int)a4;
		
		System.out.println("int:"+a3);
		System.out.println("long:"+a4);
		
		double a7 = 2.44;
		float a8 = (float) a7;
		

		System.out.println("float:"+a8);
		System.out.println("double:"+a7);
		
		float b2 = 12;
		long b3=(long) b2;
		
		System.out.println("long:"+b3);
		System.out.println("float:"+b2);
		
		

	}

}
