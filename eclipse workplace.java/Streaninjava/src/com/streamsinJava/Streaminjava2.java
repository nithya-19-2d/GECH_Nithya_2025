package com.streamsinJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streaminjava2 {
	public static void main(String[] args) {
		//to convert the strings to touppercase and display that in list
		List<String> list = Arrays.asList("one","two","three","four","five" );
		List<String> new_string=list.stream().map((x)->x.toUpperCase()).collect(Collectors.toList());
		System.out.println(new_string);
		
		
		
	}

}
