package com.streamsinJava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streaninjava {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(13);
		list.add(34);
		list.add(67);
		list.add(75);
		list.add(88);
		
		//need to filter the odd numbers and display the list of that
		Stream<Integer> stream = list.stream();
		List<Integer> num =stream.filter((i)->i%2!=0).collect(Collectors.toList());
		System.out.println("num:"+num);
		
		List<Integer> numbers = list.stream().filter((i)->i%2!=0).collect(Collectors.toList());
		System.out.println(numbers);
		
	}

}
