package genericinjava;

import java.util.ArrayList;
import java.util.List;

public class Genericsincollection {
	public static void main(String[] args) {
		/*
		 * Generics:
		 * =========
		 * To provide the type safety and to avoid the type casting in collection then we should go for generics
		 *  * GENERIC: to add type safety we declare the obj type like <Integer>, <Double> etc and to avoid typecasting

		 Syntax:
		 =========
		 	List<type_of_object> arr = new List<type_of_object>();
		 	
		 	List<Integer> list = new ArrayList(Integer); ==> before java8
*/
		
		//without generics
		List marks = new ArrayList();
		marks.add(120);
		marks.add(140);
		System.out.println(marks);
		
		//type casting , there is no type safety
		int marks1 = (int)marks.get(0);
		int marks2 = (int)marks.get(1);
		
		System.out.println(marks1);
		System.out.println(marks2);
		
		//with generics
		List<String> names = new ArrayList<>(); //gives typesafety
		names.add("Nithya");
		names.add("Shwetha");
		
		String name1 = names.get(0); // avoid type casting
		String name2 = names.get(1);
		
		System.out.println(name1);
		System.out.println(name2);
		
		
	}

}
