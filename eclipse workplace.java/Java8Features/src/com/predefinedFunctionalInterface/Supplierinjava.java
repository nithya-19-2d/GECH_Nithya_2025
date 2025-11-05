package com.predefinedFunctionalInterface;

import java.time.LocalDate;
import java.util.Date;
import java.util.function.Supplier;

public class Supplierinjava {
	public static void main(String[] args) {
		/*
		 * data type of lambda expression is functional interface
		 * Supplier:
		 * ========
		 * it won't take anything but it will return the value
		 * it uses a get() method to return value , without taking parameter
		 * In java anything start from Capital letter(Math , LocalDate), it will considered as Class and method like, random() and now() -> is static method , thats why , without creating a object ,
		 * we can access the random method using class name*/
		
		Supplier<Double> sup = () -> Math.random()*10;
		
		Double res = sup.get();
		System.out.println(res);
		
		
		
		
		Supplier<Date> s = ()->new Date();
		Date date = s.get();
		System.out.println(date);
		
		LocalDate new1 = LocalDate.now(); // it will current date
		Supplier<LocalDate> Q = ()-> LocalDate.now();
		LocalDate res1 = Q.get();
		System.out.println(res1);
		
		//math.random() value print , it containes the range from positive 0 to 1 
		
	}

}
