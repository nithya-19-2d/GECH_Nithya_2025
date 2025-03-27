package com.predefinedFunctionalInterface;

import java.util.Date;
import java.util.function.Supplier;

public class Supplierinjava {
	public static void main(String[] args) {
		/*
		 * data type of lambda expression is functional interface
		 * Supplier:
		 * ========
		 * it won't take anything but it will teturn the value*/
		Supplier<Date> s = ()->new Date();
		Date date = s.get();
		System.out.println(date);
	}

}
