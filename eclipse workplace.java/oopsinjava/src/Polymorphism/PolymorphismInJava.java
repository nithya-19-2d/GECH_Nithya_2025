package Polymorphism;
class Person{
	public void walking() {
		System.out.println("the person is walking");
	}	
}

//method - overloading
//class nithya extends Person{
//	
//}

//method - overriding
class nithya extends Person{
	public void walking() {
		System.out.println(" Nithya is walking");
	}
	
}

//method overloading
class Addition{
	public void add(int a, int b) {
		System.out.println("Addition is:" +(a+b));
	}
	
	public void add(int a, int b, int c) {
		System.out.println("Addition is:" +(a+b+c));
	}
	
}

class sub{
	public static void add(int a, int b) {
		System.out.println("addition:"+(a+b));
	}
	
	public static void add(int a, int b,int c) {
		System.out.println("addition:"+(a+b+c));
	}
}





public class PolymorphismInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * polymorphism
		 * ==========
		 * poly -> many
		 * morphism -> forms
		 * it is mechanism that method will perform a different action based on  the situation
		 * 1.method-overloading(one class)
		 * 2.method-overriding(two class) / dynamic- polymorhism/ runtime polymorphism
		 * => 1. overloading/Compiletime polymorphism/static polymorphism/static binding - same method with different inputs within the same class.
		 * -Called as Complile time polymorhism beacuse the compiler decides which input method to be called during compile time.
		 * => 2. overriding for two classes - Using the same method
		 * in the child class extending to parent class but printing different by
		 *  overriding the method and printing the new thing we want to print.
		 *  
		 *  =>static method is not work in method-overriding(is not completly understand)



*/
		
		//method overriding/dynamic-polymorphism
		nithya Nithya=new nithya();
		Nithya.walking();
		
		//method-overloading
		Addition addition=new Addition();
		addition.add(10, 20, 30);
		addition.add(10, 20);
		
		sub.add(20,30);
		sub.add(20,30,40);

	}

}
