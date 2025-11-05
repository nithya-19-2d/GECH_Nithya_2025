package com.predefinedFunctionalInterface;

import java.util.function.Consumer;

public class Consumerinjava {
	public static void main(String[] args) {
		/*
		 * consumer
		 * =======
		 * it will consume the value but won't return anything
		 * it will be used in the list , collection , looping , if else and array , 
		 * when we want to display all the element present in them.
		 * we wont give the class name(Consumer) and functional interface name(Consumer) same , if we give , its shows the consumer is not generic(compilation error) */
		
		Consumer<String> c = (s)->System.out.println(s);
		c.accept("hello world");
		
		Consumer<String> b = (s)->System.out.println(s);
		b.accept("hello");
		
		
	}

}
